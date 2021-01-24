package src.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The WAM Calculator program allows users to add their assessments, courses and
 * grades, in order to calculate their total WAM.
 * 
 * @author Eric T Chen
 */
public class CalcApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("WAM Calculator");
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}