/*package Controllers;

import Entites.Personne;
import Entites.User;
import Services.ServiceAdministrateur;
import Services.ServicePersonne;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;
import java.util.List;

public class AfficherUser {


        @FXML
        private Label affichage;


        @FXML
        ServiceAdministrateur admn =new ServiceAdministrateur();
        @FXML
        void AfficherUser(ActionEvent event) {
            try{
                List<User> list = admn.readAll();
                affichage.setText(list.toString());
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }}*/

package Controllers;

import Entites.User;
import Services.ServiceAdministrateur;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class AfficherUser {

    @FXML
    private Label affichage;

    private final ServiceAdministrateur serviceAdministrateur = new ServiceAdministrateur();

    @FXML
    void initialize() {
        // Ce code sera exécuté au moment de l'initialisation du contrôleur

    }

    @FXML
    void  AfficherUser(ActionEvent event) {
        try {
            List<User> utilisateurs = serviceAdministrateur.readAll();
            if (!utilisateurs.isEmpty()) {
                String usersText = utilisateurs.stream()
                        .map(User::toString)
                        .collect(Collectors.joining("\n"));
                affichage.setText(usersText);
            } else {
                affichage.setText("Aucun utilisateur trouvé.");
            }
        } catch (SQLException e) {
            affichage.setText("Erreur lors de la lecture des utilisateurs.");
            e.printStackTrace(); // Affiche l'erreur dans la console pour le débogage
        }
    }
}
