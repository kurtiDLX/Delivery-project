
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
import javafx.stage.Stage;

public class Controller {

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
    private Button profileBut;

    @FXML
    private ImageView infoImg;

    @FXML
    void initialize() {
        profileBut.setGraphic(imgProfile);
        infoButton.setGraphic(infoImg);
        profileBut.setOnAction(actionEvent -> {
          try {
              profileBut.getScene().getWindow().hide();
              FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/profile.fxml"));
              Parent root = loader.load();
              Scene scene = new Scene(root);
              Stage stage = (Stage) profileBut.getScene().getWindow();
              stage.setScene(scene);
              stage.show();

          }catch (IOException e) {
              e.printStackTrace();
          }
        });

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









