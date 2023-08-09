package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Registration extends MainUserProfile {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane backgroundOwn;

    @FXML
    private Button confirmButton;

    @FXML
    private TextField newUserEmail;

    @FXML
    private TextField newUserName;

    @FXML
    private TextField newUserPassword;

    @FXML
    private TextField newUserPhone;

    @FXML
    void initialize() {
        confirmButton.setOnAction(actionEvent -> {
            userInfoLogin = newUserName.getText();
            userInfoPhone = newUserPhone.getText();
            userInfoEmail = newUserEmail.getText();
            userInfoPassword = newUserPassword.getText();

            try {
                confirmButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/mainRegistrationAndLogin.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) confirmButton.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }catch (IOException e){
                e.printStackTrace();
            }
        });
    }

}
