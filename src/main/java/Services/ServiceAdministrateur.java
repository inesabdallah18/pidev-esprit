package Services;

import Entites.Administrateur;

import Entites.User;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceAdministrateur implements IService<User> {


        private Connection con1= DataSource.getInstance().getCon();
        private Statement ste;


        public ServiceAdministrateur(){

            try {
                ste=con1.createStatement();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }





        public void ajout(User user) throws SQLException
        {
            PreparedStatement pre= con1.prepareStatement("INSERT INTO `user` ( `nom`, `prenom`, `numero`, `email`, `pwd`) VALUES ( ?,?,?,?,?);");
            pre.setString(1,user.getNom());
            pre.setString(2,user.getPrenom());
            pre.setString(3,user.getNumero());
            pre.setString(4,user.getEmail());
            pre.setString(5,user.getPwd());

            pre.executeUpdate();
        }

    @Override
    public void ajouter(User user) throws SQLException {

    }

    @Override
    public void supprimer(User user) throws SQLException {

    }

    @Override
    public void update(User user) throws SQLException {

    }

    @Override
        public User findbyId(int id) throws SQLException {
            return null;
        }

        @Override
        public List<User> readAll() throws SQLException {
            List<User> l1=new ArrayList<>();
            String req="select * from user";

            ResultSet res=ste.executeQuery(req);
            while (res.next())
            {
                int id=res.getInt(1);
                String nom=res.getString("nom");
                String prenom=res.getString("prenom");
                String numero=res.getString("numero");
                String email=res.getString("email");
                String pwd=res.getString("pwd");
                User user=new User(id,nom,prenom,numero,email,pwd);
                l1.add(user);
            }
            return l1;
        }
    }


