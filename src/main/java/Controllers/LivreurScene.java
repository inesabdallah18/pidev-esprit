package Controllers;

import Entites.Commande;
import Services.ServiceLivreur;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class LivreurScene {

    @FXML
    private TableView<Commande> idtable;

    @FXML
    private TableColumn<Commande, Integer> ID_Commande;

    @FXML
    private TableColumn<Commande, String> id_nom;

    @FXML
    private TableColumn<Commande, String> id_description;

    @FXML
    private TableColumn<Commande, String> id_status;

    @FXML
    private TextField SearchID;

    private ServiceLivreur L = new ServiceLivreur();
    private ObservableList<Commande> masterData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        AfficherOrder();

        // Adding listener to the search text field
        FilteredList<Commande> filteredData = new FilteredList<>(masterData, p -> true);
        SearchID.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(commande -> {
                if (newValue == null || newValue.isEmpty() || newValue.isBlank()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();

                // Filter by ID_Command only
                return String.valueOf(commande.getID_Command()).toLowerCase().contains(lowerCaseFilter);
            });
        });

        SortedList<Commande> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(idtable.comparatorProperty());

        idtable.setItems(sortedData);
    }

    @FXML
    void AfficherOrder() {
        try {
            List<Commande> list = L.readAll();
            masterData.addAll(list);

            ID_Commande.setCellValueFactory(new PropertyValueFactory<>("ID_Command"));
            id_nom.setCellValueFactory(new PropertyValueFactory<>("ClientName"));
            id_description.setCellValueFactory(new PropertyValueFactory<>("Description"));
            id_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}




