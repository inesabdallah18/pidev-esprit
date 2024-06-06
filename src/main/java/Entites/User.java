package Entites;

public class User {
    int id;
    String nom;
    String prenom;
    String numero;
    String email;
    String pwd;

    public User(int id, String nom, String prenom, String email, String pwd, String s){

        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.numero=numero;
        this.pwd=pwd;


    }
    public User(String nom,String prenom,String numero,String email,String pwd){

        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.numero=numero;
        this.pwd=pwd;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
