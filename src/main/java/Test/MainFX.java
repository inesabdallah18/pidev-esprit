package Test;

import Controllers.AjouterPersonne;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import java.io.IOException;

public class MainFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/LivreurScene.fxml"));

        try {
            Parent root =loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("SEAFOOD");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
