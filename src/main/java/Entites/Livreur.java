package Entites;

import jdk.jshell.Snippet;

public class Livreur extends User{
    private int id;
    private String nom;
    private String prenom;
    private String Email;
    private String pwd;
    private String numero;
    private int ID_Command, id_client;
    private String Description;
    private String ClientName;
    private  String Status;

    public Livreur(int id, String nom, String prenom, String email, String pwd, String numero, int ID_Command, int id_client, String Description, String ClientName, String Status) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.Email = email;
        this.pwd = pwd;
        this.numero = numero;
        this.id_client = id_client;
        this.ID_Command = ID_Command;
        this.Description = Description;
        this.ClientName = ClientName;
        this.Status = Status;

    }

    public Livreur(int ID_Command,String ClientName, String Description, String Status) {
        this.ID_Command = ID_Command;
        this.Description = Description;
        this.ClientName = ClientName;
        this.Status = Status;
    }

    public int getID_Command() {
        return ID_Command;
    }

    public void setID_Command(int ID_Command) {
        this.ID_Command = ID_Command;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
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
}






