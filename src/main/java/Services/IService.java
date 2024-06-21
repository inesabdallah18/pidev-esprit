package Services;

<<<<<<< HEAD
import Entites.Commande;

=======
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
import java.sql.SQLException;
import java.util.List;

public interface IService<T> {

<<<<<<< HEAD
    void ajouter(T t) throws SQLException;
    List<T> readAll() throws SQLException;
    T findbyId(int id) throws SQLException;


=======
  void ajouter(T t) throws SQLException;

  void supprimer(T t) throws SQLException;

  void  update(T t) throws SQLException;

  T findbyId(int e) throws SQLException;

  List<T> readAll() throws SQLException;
>>>>>>> c008da9ae62a4d2548a3133edfb0508e1c8cce2c
}
