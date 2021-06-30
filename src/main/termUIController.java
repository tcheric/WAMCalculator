package src.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class termUIController {

    Integer courseNumber = Integer.valueOf(2);

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button addNewCourse;

    @FXML
    private Button course1;

    @FXML
    private VBox courseVBox;

    @FXML
    public void handleAddNewCourse(ActionEvent event) throws IOException {
        String courseNoString = courseNumber.toString();
        System.out.println("Add new term pressed");
        Button newButton = new Button();
        newButton.setPrefWidth(140);
        newButton.setPrefHeight(62.5);
        newButton.setText("Term " + courseNoString);
        newButton.setId("term" + courseNoString);
        System.out.println("Term " + courseNoString + " pressed");
        // newButton.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override public void handle(ActionEvent e) {
        //         try {
        //             getCoursePage("course" + courseNoString);
        //         } catch (IOException e1) {
        //             e1.printStackTrace();
        //         }
        //     }
        // });
        courseNumber++;
        courseVBox.getChildren().add(newButton);
        System.out.println("SUCCESS");
    }
}
