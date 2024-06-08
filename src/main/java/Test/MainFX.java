package Test;

import Controllers.AjouterUser;
import Controllers.AjouterPersonne;
import com.sun.javafx.fxml.FXMLLoaderHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class MainFX extends Application {
    public static void main(String[] args) {

launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       // FXMLLoader loader =new FXMLLoader(getClass().getResource("/AjouterPersonne.fxml"));
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/AjouterUser.fxml"));

       // FXMLLoader loader =new FXMLLoader(getClass().getResource("/AfficherUser.fxml"));


        //Parent root = null;
       try {

          Parent root = loader.load();
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
       }catch (IOException e){
           throw new RuntimeException(e);
       }
    }
}
