package Controllers;
import Entites.Personne;
import Services.ServicePersonne;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.sql.SQLException;


public class AjouterPersonne {

    @FXML
    private TextField IDAge;

    @FXML
    private TextField IDNom;

    @FXML
    private TextField IDPrenom;

    ServicePersonne sp = new ServicePersonne();

    @FXML
    void AjouterP(ActionEvent event) {

        try {
            sp.ajouter(new Personne(IDNom.getText(),IDPrenom.getText(),Integer.parseInt(IDAge.getText())));
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
