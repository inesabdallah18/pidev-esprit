package Tests;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainFX extends Application {
    public static void main(String[] args) {

        launch();

    }

    @Override
    public void start(Stage stage) {

        FXMLLoader loader=new FXMLLoader(getClass().getResource("/Plats/AfficherListePlat.fxml"));

        try {
            Parent root=loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Liste des plats");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
