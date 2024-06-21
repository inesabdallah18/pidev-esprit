package Services;

import Entites.Personne;
import Entites.Serveur;
import Entites.User;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceUser implements IService<User> {
    private Connection con1 = DataSource.getInstance().getCon();
    private Statement ste;


    public ServiceUser() {

        try {
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override

    public void ajouter(User user) throws SQLException {
        String req = "INSERT INTO `user` ( `nom`, `prenom`,`id`, `Email`,`pwd`,`numero`) VALUES ( '"+user.getNom()+"', '"+user.getPrenom()+"', '"+user.getId()+"', '"+user.getEmail()+"', '"+user.getPwd()+"', '"+user.getNumero()+"');";
        ste.executeUpdate(req);
    }


    @Override
    public List<User> readAll() throws SQLException {
        List<User> l1=new ArrayList<>();
        String req="select * from personne";

        ResultSet res=ste.executeQuery(req);
        while (res.next())
        {
            String nom=res.getString("nom");
            String prenom=res.getString("prenom");
            String Email=res.getString("Email");
            String pwd=res.getString("pwd");
            String numero=res.getString("numero");
            int id=res.getInt(1);
            User u = new User(id,nom,prenom,Email,pwd,numero);
            l1.add(u);
        }
        return l1;
    }

    @Override
    public User findbyId(int id) throws SQLException {
        String query = "SELECT * FROM User WHERE id = " + id;
        ResultSet res = ste.executeQuery(query);
        if (res.next()) {
            String nom=res.getString("nom");
            String prenom=res.getString("prenom");
            String Email=res.getString("Email");
            String pwd=res.getString("pwd");
            String numero=res.getString("numero");
            return new User(id,nom,prenom,Email,pwd,numero);
        }
        return null;
    }

}
