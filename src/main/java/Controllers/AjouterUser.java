package Controllers;

import Entites.User;
import Services.ServiceUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AjouterUser {

    @FXML
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

    }
}
