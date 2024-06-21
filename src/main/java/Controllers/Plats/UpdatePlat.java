package Controllers.Plats;

import Entites.Plats;
import Services.ServicePlats;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;

public class UpdatePlat {

    @FXML
    private TextField id;

    @FXML
    private TextField ingredients;

    @FXML
    private TextField nom_plat;


    ServicePlats servP = new ServicePlats();

    // Méthode pour initialiser les données du plat à modifier



    @FXML
    void UpdatePlat(ActionEvent event) {
        /*
        try {
            // Mettre à jour les données du plat avec les valeurs des champs
            plat.setNom_plat(nom_plat.getText());
            plat.setIngredients(ingredients.getText());

            // Appeler la méthode de service pour mettre à jour le plat
            servP.update(plat);

            System.out.println("Plat modifié avec succès");

            // Fermer la fenêtre de mise à jour
            ((Stage) nom_plat.getScene().getWindow()).close();

        } catch (SQLException e) {
            System.out.println("Erreur lors de la modification du plat : " + e.getMessage());
        }
    }*/
    }}
