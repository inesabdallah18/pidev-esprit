package Controllers;
import Entites.Personne;
import Services.ServicePersonne;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
