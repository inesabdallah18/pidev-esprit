package Entites;

public class User {
<<<<<<< HEAD

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




=======
    int id;
    String nom;
    String prenom;
    String numero;
    String email;
    String pwd;

    public User(int id, String nom, String prenom, String email, String numero, String pwd){

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

>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

=======
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
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

<<<<<<< HEAD
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
=======
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
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
<<<<<<< HEAD
}
=======

        @Override
        public String toString() {
            return "User{" +
                    "id='" + id + '\'' +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", numero='" + numero + '\'' +
                    ", email='" + email + '\'' +
                    ", pwd=" + pwd+
                    '}';
        }



}
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
