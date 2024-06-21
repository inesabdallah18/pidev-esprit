package Utils;
import java.sql.*;
<<<<<<< HEAD

public class DataSource {
    private  String url="jdbc:mysql://localhost:3308/esprit";
    private  String login="root";
    private  String pwd="";
    private static DataSource data;
    private Connection con;

    private DataSource(){
        try {
            con=DriverManager.getConnection(url,login,pwd);
            System.out.println("connexion établie");
        } catch (SQLException e) {

            System.out.println(e);
        }
    }



   public Connection getCon() {
       return con;
   }

    public static DataSource getInstance() {
        if(data==null)
            data=new DataSource();
        return data;
    }



=======
public class DataSource {
    private  String url="jdbc:mysql://localhost:3306/food";
    private  String login="root";
    private  String pwd="";
    private static DataSource data;

   private Connection con;


   private DataSource(){
       try {
           con=DriverManager.getConnection(url,login,pwd);
           System.out.println("connexion établie");
       } catch (SQLException e) {

           System.out.println(e);
       }
   }
    public Connection getCon() {
         return con;
    }

    public static DataSource getInstance() {
       if(data==null)
           data=new DataSource();
        return data;
    }
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
}
