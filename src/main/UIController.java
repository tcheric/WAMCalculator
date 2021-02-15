package src.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UIController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button addNewTerm;

    @FXML
    private Button term1;

    @FXML
    private Button term2;

    @FXML
    private Button term3;

    @FXML
    public void handleTerm1(ActionEvent event) throws IOException {
        System.out.println("Term 1 pressed");
        getTermPage("term1"); // 303030
    }

    @FXML
    public void handleTerm2(ActionEvent event) throws IOException {
        System.out.println("Term 2 pressed");
        getTermPage("term2"); // 403f30
    }

    @FXML
    public void handleTerm3(ActionEvent event) throws IOException {
        System.out.println("Term 3 pressed");
        getTermPage("term3"); // 404a40
    }

    @FXML
    public void handleAddNewTerm(ActionEvent event) throws IOException {
        System.out.println("Add new term pressed");
    }

    private void getTermPage(String filename) throws IOException {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(filename + ".fxml"));
        } catch (IOException e) {
            System.out.println("Failed");
        }
        
        System.out.println(root);
        if (borderPane == null){
            System.out.println("borderPane is null");
        }

        borderPane.setCenter(root);
    }
}
