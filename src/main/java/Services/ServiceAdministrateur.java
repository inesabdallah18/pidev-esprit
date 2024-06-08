package Services;

import Entites.User;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceAdministrateur implements IService<User> {

    private Connection con1;
    private Statement ste;

    public ServiceAdministrateur() {
        con1 = DataSource.getInstance().getCon(); // Récupération de la connexion unique à la base de données
        try {
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Méthode pour ajouter un utilisateur dans la base de données
    @Override
    public void ajouter(User user) throws SQLException {
        PreparedStatement pre = con1.prepareStatement("INSERT INTO `user` (`nom`, `prenom`, `numero`, `email`, `pwd`) VALUES (?, ?, ?, ?, ?);");
        pre.setString(1, user.getNom());
        pre.setString(2, user.getPrenom());
        pre.setString(3, user.getNumero());
        pre.setString(4, user.getEmail());
        pre.setString(5, user.getPwd());

        pre.executeUpdate();
    }

    @Override
    public void supprimer(User user) throws SQLException {

    }

    // Méthode pour supprimer un utilisateur par email
    public boolean supprimerUtilisateur(String email) {
        String sql = "DELETE FROM user WHERE email = ?";
        try (PreparedStatement statement = con1.prepareStatement(sql)) {
            statement.setString(1, email);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Autres méthodes pour implémenter l'interface IService
    @Override
    public void update(User user) throws SQLException {
        // À implémenter si nécessaire
    }

    @Override
    public User findbyId(int id) throws SQLException {
        // À implémenter si nécessaire
        return null;
    }

    @Override
    public List<User> readAll() throws SQLException {
        List<User> l1 = new ArrayList<>();
        String req = "SELECT * FROM user";

        ResultSet res = ste.executeQuery(req);
        while (res.next()) {
            int id = res.getInt(1);
            String nom = res.getString("nom");
            String prenom = res.getString("prenom");
            String numero = res.getString("numero");
            String email = res.getString("email");
            String pwd = res.getString("pwd");
            User user = new User(id, nom, prenom, numero, email, pwd);
            l1.add(user);
        }
        return l1;
    }
}
