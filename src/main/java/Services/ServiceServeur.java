package Services;

import Entites.Serveur;
import Utils.DataSource;
import Entites.Tables;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceServeur implements IService<Tables> {
    private Connection con1 = DataSource.getInstance().getCon();
    private Statement ste;

    public ServiceServeur() {

        try {
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override

    public void ajouter(Tables tables) throws SQLException {
        String req = "INSERT INTO `Serveur` (`nom`, `prenom`, `id`, `Email`, `pwd`, `numero`) VALUES ('" + tables.getIdtable() + "', '" + tables.getNumtab() + "', '" + tables.getStatus() + "');";
        ste.executeUpdate(req);
    }


    @Override
    public List<Tables> readAll() throws SQLException {
        List<Tables> l1=new ArrayList<>();
        String req="select * from Serveur";

        ResultSet res=ste.executeQuery(req);
        while (res.next())
        {
            int idtable = res.getInt(1);
            String status=res.getString("status");
            int Numtab=res.getInt("numtab");
            Tables t=new Tables(idtable, Numtab, status);
            l1.add(t);
        }
        return l1;
    }

    @Override
    public Tables findbyId(int id) throws SQLException {
        String query = "SELECT * FROM Serveur WHERE idtable = " + id;
        ResultSet res = ste.executeQuery(query);
        if (res.next()) {
            int idtable = res.getInt("idtable");
            int numtab = res.getInt("numtab");
            String status = res.getString("status");
            return new Tables(idtable, numtab, status);
        }
        return null; // Or throw an exception if not found
    }

}
