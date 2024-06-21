package Entites;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Plats {
    private  int id;
    private  String nom_plat, ingredients;






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_plat() {
        return nom_plat;
    }

    public void setNom_plat(String nom_plat) {
        this.nom_plat = nom_plat;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public  Plats(int id ,String nom_plat,String ingredients){
        this.id=id;
        this.nom_plat=nom_plat;
        this.ingredients=ingredients;
    }
    public Plats(String nom_plat, String ingredients){
        this.nom_plat=nom_plat;
        this.ingredients=ingredients;

    }

    @Override
    public String toString() {
        return "Plats{" +
                "id=" + id +
                ", nomPlat='" + nom_plat + '\'' +
                ", descriptionP='" + ingredients + '\'' +
                '}';
    }
}
