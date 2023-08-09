package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginAndRegistrationMain extends Registration{

    static String strUserNameInfoLogin, strPasswordUserInfo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane backgroundOwn;

    @FXML
    private Button logInButton;

    @FXML
    private TextField loginUserNameInfo;

    @FXML
    private PasswordField passwordUserInfo;

    @FXML
    private Button registrationButton;

    @FXML
    void initialize() {
        registrationButton.setOnAction(actionEvent -> {
            try {
                registrationButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/register.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) registrationButton.getScene().getWindow();
                stage.setScene(scene);
                stage.show();

            } catch (IOException e){
                e.printStackTrace();
            }
        });

        logInButton.setOnAction(actionEvent -> {
            strUserNameInfoLogin = loginUserNameInfo.getText();
            strPasswordUserInfo = passwordUserInfo.getText();

            if (strUserNameInfoLogin.equals(userInfoLogin) && strPasswordUserInfo.equals(userInfoPassword)) {
                try {
                    logInButton.getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/sample.fxml"));
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) logInButton.getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else  {
                loginUserNameInfo.setText("incorrect");
                passwordUserInfo.setText("incorrect");
            }
        });
    }

}
