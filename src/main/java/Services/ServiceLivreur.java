package Services;

import Entites.Commande;
import Utils.DataSource;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceLivreur implements IService<Commande> {
    private Connection con1 = DataSource.getInstance().getCon();
    private Statement ste;

    public ServiceLivreur() {
        try {
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void ajouter(Commande commande) throws SQLException {
        String req = "INSERT INTO Commande (ID_Command, ClientName, Description, NumClient, status) VALUES (" +
                commande.getID_Command() + ", '" +
                commande.getClientName() + "', '" +
                commande.getDescription() + "', '" +
                commande.getNumClient() + "', '" +
                commande.getStatus() + "')";
        ste.executeUpdate(req);
    }

    ObservableList<Commande> CommandeObservablelist = FXCollections.observableArrayList();

    @Override
    public Commande findbyId(int id) throws SQLException {
        String query = "SELECT `ID_Command`, `ClientName`, `Description`, `NumClient`, `Status` FROM `commande` WHERE `ID_Command` = " + id;
        ResultSet res = ste.executeQuery(query);
        if (res.next()) {
            int ID_Commande = res.getInt("ID_Command");
            String clientName = res.getString("ClientName");
            String NumClient = res.getString("NumClient");
            String description = res.getString("Description");
            String status = res.getString("Status");
            return new Commande(ID_Commande, clientName, description, NumClient, status);
        }
        return null;
    }

    @Override
    public List<Commande> readAll() throws SQLException {
        List<Commande> l1 = new ArrayList<>();
        String req = "SELECT * FROM Commande";
        ResultSet res = ste.executeQuery(req);
        while (res.next()) {
            int ID_Command = res.getInt("ID_Command");
            String ClientName = res.getString("ClientName");
            String Description = res.getString("Description");
            String NumClient = res.getString("NumClient");
            String status = res.getString("status");

            Commande l = new Commande(ID_Command, ClientName, Description, NumClient, status);
            l1.add(l);
        }
        return l1;
    }
}
