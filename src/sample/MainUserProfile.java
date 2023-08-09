package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainUserProfile {

    static String userInfoEmail,userInfoLogin,userInfoPhone, userInfoPassword;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane backgroundOwn;

    @FXML
    private ImageView imgProfile;

    @FXML
    private Button infoButton;

    @FXML
    private ImageView profileAvatarId;

    @FXML
    private Button profileBut;

    @FXML
    private Text profileLogin;

    @FXML
    private Text userEmail;

    @FXML
    private Text userPhoneInfo;

    @FXML
    private ImageView infoImg;

    @FXML
    void initialize() {
        profileLogin.setText(userInfoLogin);
        userPhoneInfo.setText(userInfoPhone);
        userEmail.setText(userInfoEmail);
        infoButton.setOnAction(actionEvent -> {
            try {
                infoButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("info.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }


}