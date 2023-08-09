package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

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
    void initialize() {
    profileLogin.setText(userInfoLogin);
    userPhoneInfo.setText(userInfoPhone);
    userEmail.setText(userInfoEmail);


    }


}