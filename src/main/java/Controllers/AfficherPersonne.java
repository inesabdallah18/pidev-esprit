package Controllers;
import Entites.Personne;
import Services.ServicePersonne;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
<<<<<<< HEAD
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.util.List;

public class AfficherPersonne {
    @FXML
    private Label IDAfficher;

    @FXML
    private TextField IDAge;

    @FXML
    private TextField IDNom;

    @FXML
    private TextField IDPrenom;


        ServicePersonne sp = new ServicePersonne();

        @FXML
        void AfficherP(ActionEvent event) {
            try {
                List<Personne> list = sp.readAll();
                IDAfficher.setText(list.toString());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
}
=======
import java.sql.SQLException;

import java.util.List;

public class AfficherPersonne {

    @FXML
    private Label afficher;

    @FXML
    private Label lage;

    @FXML
    private Label lnom;

    @FXML
    private Label lprenom;
    @FXML
    ServicePersonne sp =new ServicePersonne();
    @FXML
    void afficherfomDB(ActionEvent event) {
try{
       List<Personne> list = sp.readAll();
       afficher.setText(list.toString());
    }catch (SQLException e) {
throw new RuntimeException(e);
}

    }}
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
