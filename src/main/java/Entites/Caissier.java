package Entites;

public class Caissier extends User{
    String status;
    public Caissier(int id, String nom, String prenom, String email, String pwd, String num_user,String status) {
        super(id, nom, prenom, email, pwd, num_user);
        this.status=status;
    }

    public Caissier(String nom, String prenom, String email, String pwd, String num_user,String status) {
        super(nom, prenom, email, pwd, num_user);
        this.status=status;
    }
}
