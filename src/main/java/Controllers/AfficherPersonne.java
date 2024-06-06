package Controllers;
import Entites.Personne;
import Services.ServicePersonne;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
