package Services;

import Entites.Plats;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicePlats implements IService<Plats> {

    private Connection con1 = DataSource.getInstance().getCon();
    private Statement ste;
    public  ServicePlats(){
        try {
            ste=con1.createStatement();
        }catch (SQLException e){
            System.out.println("ici"+e);
        }
    }


    @Override
    public void ajouter(Plats plats) throws SQLException {

        String req=  "INSERT INTO plats (nom_plat, ingredients) VALUES" +
                " ('" + plats.getNom_plat() + "','" + plats.getIngredients() + "')";
        ste.executeUpdate(req);

    }




    // Méthode pour vérifier l'unicité du nom du plat
    public boolean isNomPlatUnique(String nom) throws SQLException {
        String query = "SELECT COUNT(*) FROM plats WHERE nom_plat = ?";
        PreparedStatement ps = con1.prepareStatement(query);
        ps.setString(1, nom);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1) == 0;
    }

    @Override
    public void supprimer(Plats plats) throws SQLException {

        String query = "DELETE FROM plats WHERE id = ?";
        try (PreparedStatement stmt = con1.prepareStatement(query)) {
            stmt.setInt(1, plats.getId());
            stmt.executeUpdate();
            System.out.println("Plat with ID " + plats.getId() + " has been deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }






    @Override
    public void update(Plats plats) throws SQLException {

        String query = "UPDATE plats SET nom_plat = ?, ingredients = ? WHERE id = ?";
        try (PreparedStatement stmt = con1.prepareStatement(query)) {
            stmt.setString(1, plats.getNom_plat());
            stmt.setString(2, plats.getIngredients());
            stmt.setInt(3, plats.getId());
            stmt.executeUpdate();
            System.out.println("Plat with ID " + plats.getId() + " has been updated.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }






    }

    @Override
    public Plats findById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Plats> readAll() throws SQLException {


        List<Plats> l1=new ArrayList<>();
        String req="select * from plats";

        ResultSet res=ste.executeQuery(req);
        while (res.next())
        {
            int id=res.getInt(1);
            String nom_plat=res.getString("nom_plat");
            String ingredients=res.getString("ingredients");

            Plats p=new Plats(id,nom_plat,ingredients);
            l1.add(p);
        }
        return l1;


    }



    // Nouvelle méthode pour retourner uniquement les noms des plats
    public List<String> readAllNames() throws SQLException {
        List<String> noms = new ArrayList<>();
        String req = "SELECT nom_plat FROM plats";
        ResultSet res = ste.executeQuery(req);
        while (res.next()) {
            String nom_plat = res.getString("nom_plat");
            noms.add(nom_plat);
        }
        return noms;
    }
}
