package src.main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        UIController UIController = new UIController();
        FXMLLoader UILoader = new FXMLLoader(getClass().getResource("UIView.fxml"));
        UILoader.setController(UIController);
        Parent UIRoot = UILoader.load();
        Scene scene1 = new Scene(UIRoot);
        UIRoot.requestFocus();

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}