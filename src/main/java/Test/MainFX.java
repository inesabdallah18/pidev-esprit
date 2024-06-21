package Test;

<<<<<<< HEAD
import Controllers.AjouterPersonne;
=======
import Controllers.AjouterUser;
import Controllers.AjouterPersonne;
import com.sun.javafx.fxml.FXMLLoaderHelper;
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

<<<<<<< HEAD
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


=======
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
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
    }
}
