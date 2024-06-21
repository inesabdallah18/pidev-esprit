package Entites;

public class Tables {
    private int idtable;
    private int numtab;
    private String status;


    public Tables(int idtable,int numtab, String status) {

        this.idtable = idtable;
        this.numtab = numtab;
        this.status = status;

    }

    public int getIdtable() {
        return idtable;
    }

    public int getNumtab() {
        return numtab;
    }

    public String getStatus() {
        return status;
    }
}
