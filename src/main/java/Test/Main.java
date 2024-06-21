package Test;
import Entites.Personne;
import Services.ServicePersonne;
import Utils.DataSource;
import java.sql.*;
<<<<<<< HEAD

=======
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
public class Main {
    public static void main(String[] args) {

        ServicePersonne ser=new ServicePersonne();

<<<<<<< HEAD
        Personne p1=new Personne("hiba","mezni",20);
        try {
=======
        Personne p1=new Personne("zoglem","feriel",20);
       /* try {
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
            ser.ajouter(p1);
            System.out.println("personne ajouteé");
        }catch (SQLException e){
            System.out.println(e);
<<<<<<< HEAD
        }
=======
        }*/
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c


        try {
            ser.readAll().forEach(e-> System.out.println(e));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
