package Entites;

public class Serveur extends User{

    private int id;
    private String nom;
    private String prenom;
    private String Email;
    private String pwd;
    private String numero;
    private int numtab;

    public Serveur(int id,String nom, String prenom, String email, String pwd, String numero, int numtab) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Email = email;
        this.pwd = pwd;
        this.numero = numero;
        this.numtab = numtab;

    }

    public Serveur(int idtable, int numtab, String status) {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String getPwd() {
        return pwd;
    }

    @Override
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumtab() {
        return numtab;
    }

    public void setNumtab(int numtab) {
        this.numtab = numtab;
    }
}
