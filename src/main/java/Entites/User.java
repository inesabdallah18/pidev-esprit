package Entites;

public class User {

    private int id;
    private String numero;
    private String nom, prenom;
    private String Email, pwd;

    public User() {
        this.nom = nom;
        this.prenom = prenom;
        this.Email = Email;
        this.pwd = pwd;
        this.numero = numero;
    }

    public User(int id, String nom, String prenom, String Email, String pwd, String numero) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Email = Email;
        this.pwd = pwd;
        this.numero = numero;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}