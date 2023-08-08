
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
    private ImageView backgroundImg;

    @FXML
    private AnchorPane backgroundOwn;

    @FXML
    private ImageView imgProfile;

    @FXML
    private Button profileBut;

    @FXML
    void initialize() {
        profileBut.setGraphic(imgProfile);
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

    }

}









