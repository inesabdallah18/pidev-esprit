package Controllers.Plats;

import Entites.Plats;
import Services.ServicePlats;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.List;


public class AjouterPlatController {

    @FXML
    private TextField ingredients;

    @FXML
    private TextField nom_plat;
    private AfficherPlatController afficherPlatController;
    // créer une instatnce de ServicePlats
    ServicePlats servP = new ServicePlats();

    //methode qui passe en parametre
    public void setAfficherPlatController(AfficherPlatController afficherPlatController) {
        this.afficherPlatController = afficherPlatController;
    }





    @FXML
    void AjouterPlat(ActionEvent event) throws SQLException {
        if (validerSaisie()) {
            // Vérifier si le nom du plat est unique
            if (estNomPlatUnique(nom_plat.getText().trim())) {
                // Ajouter le plat à la base de données
                servP.ajouter(new Plats(nom_plat.getText().trim(), ingredients.getText().trim()));
                //System.out.println("Plat ajouté avec succès");
                afficherAlert("Ajout du plat", "le plat est ajouté avec succé");

                // Rafraîchir le tableau dans le contrôleur principal
                afficherPlatController.refreshTable();

                // Fermer la fenêtre de dialogue
                Stage stage = (Stage) nom_plat.getScene().getWindow();
                stage.close();
            } else {
                afficherAlerte("Erreur d'unicité", "Le nom du plat existe déjà. Veuillez choisir un autre nom.");
            }
        }

    }




    private boolean validerSaisie() {
        String nom = nom_plat.getText().trim();
        String ingr = ingredients.getText().trim();

        if (nom.isEmpty()) {
            afficherAlerte("Erreur de saisie", "Le nom du plat ne peut pas être vide.");
            return false;
        }

        if (ingr.isEmpty()) {
            afficherAlerte("Erreur de saisie", "Les ingrédients ne peuvent pas être vides.");
            return false;
        }

        return true;
    }




    private boolean estNomPlatUnique(String nomPlat) {
        try {
            // Récupérer tous les plats depuis le service
            List<Plats> listePlats = servP.readAll();

            // Vérifier si le nom du plat est déjà présent dans la liste
            for (Plats plat : listePlats) {
                if (plat.getNom_plat().equalsIgnoreCase(nomPlat)) {
                    return false; // Le nom du plat existe déjà
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Gérer l'exception de manière appropriée dans votre application
        }
        return true; // Le nom du plat est unique
    }


    private void afficherAlerte(String titre, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    private void afficherAlert(String titre, String message) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle(titre);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}


