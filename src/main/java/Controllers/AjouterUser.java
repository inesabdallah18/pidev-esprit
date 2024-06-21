package Controllers;

import Entites.User;
<<<<<<< HEAD
import Services.ServiceUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;
=======
import Services.ServiceAdministrateur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

import java.sql.SQLException;
import java.util.Optional;
import java.util.regex.Pattern;
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c

public class AjouterUser {

    @FXML
<<<<<<< HEAD
    private TextField IDEmail;

    @FXML
    private TextField IDNom;

    @FXML
    private TextField IDPrenom;

    @FXML
    private TextField IDpwd;

    @FXML
    private TextField IDnumero;

    ServiceUser u = new ServiceUser();
    @FXML
    void AjouterUser(ActionEvent event) {
        try {
            u.ajouter(new User());
        } catch (SQLException e) {
            System.out.println(e);
        }

=======
    private TextField usremail;

    @FXML
    private TextField usrnom;

    @FXML
    private TextField usrnumero;

    @FXML
    private TextField usrprenom;

    @FXML
    private TextField usrpwd;

    private ServiceAdministrateur admin = new ServiceAdministrateur(); // Utilisation d'une seule instance de ServiceAdministrateur

    // Méthode pour ajouter un utilisateur
    @FXML
    void AjouterUser(ActionEvent event) {
        String nom = usrnom.getText();
        String prenom = usrprenom.getText();
        String numero = usrnumero.getText();
        String email = usremail.getText();
        String pwd = usrpwd.getText();

        if (!isEmailValid(email)) {
            showAlert("Invalid Email", "Please enter a valid email address with '@'.");
            return;
        }

        if (!isNumeroValid(numero)) {
            showAlert("Invalid Phone Number", "Please enter a 9-digit phone number.");
            return;
        }

        try {
            admin.ajouter(new User(nom, prenom, numero, email, pwd));
            showAlert("Success", "User added successfully!");
        } catch (SQLException e) {
            System.out.println(e);
            showAlert("Error", "Failed to add user: " + e.getMessage());
        }
    }

    // Méthode pour supprimer un utilisateur
    @FXML
    public void supprimerDialog(ActionEvent actionEvent) {
        // Boîte de dialogue pour saisir l'email de l'utilisateur à supprimer
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Supprimer Utilisateur");
        dialog.setHeaderText("Saisissez l'email de l'utilisateur à supprimer :");
        dialog.setContentText("Email :");

        // Afficher la boîte de dialogue et attendre que l'utilisateur saisisse l'email
        Optional<String> result = dialog.showAndWait();

        result.ifPresent(email -> {
            // Confirmer la suppression (optionnel) et appeler la méthode de suppression
            boolean confirmed = confirmerSuppression(email); // Vous pouvez implémenter cette méthode si nécessaire

            if (confirmed) {
                // Appeler la méthode de suppression avec l'email saisi
                supprimerUser(email);
            }
        });
    }

    // Méthode pour confirmer la suppression (optionnelle, dépend de vos besoins)
    private boolean confirmerSuppression(String email) {
        Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation de suppression");
        confirmation.setHeaderText("Voulez-vous vraiment supprimer cet utilisateur ?");
        confirmation.setContentText("Email : " + email);

        Optional<ButtonType> result = confirmation.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }

    // Méthode pour supprimer l'utilisateur avec l'email spécifié
    private void supprimerUser(String email) {
        boolean supprime = admin.supprimerUtilisateur(email);

        if (supprime) {
            // Afficher une boîte de dialogue de confirmation après la suppression
            Alert confirmation = new Alert(Alert.AlertType.INFORMATION);
            confirmation.setTitle("Utilisateur supprimé");
            confirmation.setHeaderText(null);
            confirmation.setContentText("L'utilisateur avec l'email " + email + " a été supprimé avec succès.");
            confirmation.showAndWait();

            // Effacer le champ usremail après la suppression
            usremail.clear();
        } else {
            // Afficher une alerte si la suppression a échoué
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur de Suppression");
            alert.setHeaderText(null);
            alert.setContentText("La suppression de l'utilisateur avec l'email " + email + " a échoué.");
            alert.showAndWait();
        }
    }

    // Méthode pour vérifier si l'email est valide
    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Méthode pour vérifier si le numéro est valide
    private boolean isNumeroValid(String numero) {
        return numero.matches("\\d{8}"); // Modifié pour un numéro de 9 chiffres
    }

    // Méthode pour afficher une alerte
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
    }
}
