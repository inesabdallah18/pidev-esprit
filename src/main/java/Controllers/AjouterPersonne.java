package Controllers;

import Entites.Personne;
import Services.ServicePersonne;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AjouterPersonne {

    @FXML
    private TextField tfage;

    @FXML
    private TextField tfnom;

    @FXML
    private TextField tfprenom;

    ServicePersonne sp = new ServicePersonne();

    @FXML
    void ajoutertoDb(ActionEvent event) {

        try {
            sp.ajouter(new Personne(tfnom.getText(),tfprenom.getText(),Integer.parseInt( tfage.getText())));
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}