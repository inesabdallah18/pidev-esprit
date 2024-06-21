package Entites;

public class Commande {
    private int ID_Command;
    private String ClientName;
    private String Description;
    private String NumClient;
    private String status;

    public Commande(int ID_Command, String ClientName, String Description, String NumClient, String status) {

        this.ID_Command = ID_Command;
        this.ClientName= ClientName;
        this.Description = Description;
        this.NumClient = NumClient;
        this.status = status;
    }

    public int getID_Command() {
        return ID_Command;
    }

    public String getClientName() {
        return ClientName;
    }

    public String getDescription() {
        return Description;
    }

    public String getNumClient() {
        return NumClient;
    }

    public String getStatus() {
        return status;
    }
}
