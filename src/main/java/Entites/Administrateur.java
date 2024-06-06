package Entites;

public class Administrateur {
    private String nom;
    private String prenom;
    private String numero;
    private String email;
    private int id;

    public Administrateur(int id,String email,String nom,String prenom,String numero )
    {
        this.id=id;
        this.email=email;
        this.nom=nom;
        this.prenom=prenom;
        this.numero=numero;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Administrateur(String email, String nom, String prenom, String numero )
    {

        this.email=email;
        this.nom=nom;
        this.prenom=prenom;
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
