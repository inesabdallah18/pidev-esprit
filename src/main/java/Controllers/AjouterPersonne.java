package Controllers;
<<<<<<< HEAD
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
=======

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
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c

    ServicePersonne sp = new ServicePersonne();

    @FXML
<<<<<<< HEAD
    void AjouterP(ActionEvent event) {

        try {
            sp.ajouter(new Personne(IDNom.getText(),IDPrenom.getText(),Integer.parseInt(IDAge.getText())));
=======
    void ajoutertoDb(ActionEvent event) {

        try {
            sp.ajouter(new Personne(tfnom.getText(),tfprenom.getText(),Integer.parseInt( tfage.getText())));
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
<<<<<<< HEAD

}
=======
}
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
