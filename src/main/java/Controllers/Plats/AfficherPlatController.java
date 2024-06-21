package Controllers.Plats;


import Entites.Plats;
import Services.ServicePlats;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AfficherPlatController {

    //noveau


  @FXML
  private TableColumn<Plats, Void> Icon;


    @FXML
    private TableColumn<Plats, String> DescFromDB;

    @FXML
    private TableColumn<Plats, String> NomFromDB;

    @FXML
    private TableView<Plats> tableAffiche;

    @FXML
    private Label ListMenu;

    ServicePlats servP = new ServicePlats();







    @FXML
    public void initialize() {

        AfficherFromDB();


        // Add button to the "Icon" column
        Callback<TableColumn<Plats, Void>, TableCell<Plats, Void>> cellFactory = new Callback<>() {
            @Override
            public TableCell<Plats, Void> call(final TableColumn<Plats, Void> param) {
                final TableCell<Plats, Void> cell = new TableCell<>() {
                    private final Button btn = new Button("Update");
                    private final Button bnt1 = new Button("Delete");
                    private final HBox hbox = new HBox(btn, bnt1);

                    {
                        btn.setOnAction(event -> {
                            try {
                                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Plats/UpdatePlat.fxml"));
                                Parent root = fxmlLoader.load();
                                Stage stage = new Stage();
                                stage.initModality(Modality.APPLICATION_MODAL);  // Bloquer l'interaction avec les autres fenêtres
                                stage.setTitle("Modifier plat");
                                stage.setScene(new Scene(root));
                                stage.showAndWait();  // Attendre la fermeture de la fenêtre
                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                        });

                        bnt1.setOnAction(event -> {
                            Plats plat = getTableView().getItems().get(getIndex());
                            System.out.println("Delete Plat: " + plat.getNom_plat() + " " + plat.getIngredients());

                            try {
                                servP.supprimer(plat);
                                tableAffiche.getItems().remove(plat);
                                System.out.println("Deleted Plat: " + plat.getNom_plat() + " " + plat.getIngredients());
                            } catch (SQLException e) {
                                e.printStackTrace();
                                // You may want to show an alert to the user if the deletion fails
                            }
                        });

                        hbox.setSpacing(10); //espace entre bouton

                    }


                    // cette methode permet de generer a chaque foix les bouton
                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(hbox);
                        }
                    }
                };
                return cell;
            }
        };

        Icon.setCellFactory(cellFactory);

    }



    ////






            void AfficherFromDB() {
                try {

                    List<Plats> list = servP.readAll();
                    //une interface dnas javaFX qui permet l'interface de se réagir automatiquement
                    ObservableList<Plats> observableList = FXCollections.observableArrayList(list);

                    //permet d'extraire les donnee de la base de donnée dans la colonne de la tableau
                    NomFromDB.setCellValueFactory(new PropertyValueFactory<Plats, String>("nom_plat"));
                    DescFromDB.setCellValueFactory(new PropertyValueFactory<Plats, String>("ingredients"));

                    //associer les donnée stocker dans le variable observableList das le tableau
                    tableAffiche.setItems(observableList);
                } catch (SQLException e) {
                    System.out.println("n'est pas afficher");
                }


            }


   //Afficher pop up


    public void refreshTable() {
        AfficherFromDB();
    }

    //bouton petmet d'afficher l'interface d'ajout
    @FXML
    void AfficherInterfaceAjout(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Plats/AjouterPlat.fxml"));
            Parent root = fxmlLoader.load();
            AjouterPlatController ajouterPlatController = fxmlLoader.getController();
            ajouterPlatController.setAfficherPlatController(this);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);  // Bloquer l'interaction avec les autres fenêtres
            stage.setTitle("Ajouter un plat");
            stage.setScene(new Scene(root));
            stage.showAndWait();  // Attendre la fermeture de la fenêtre
        } catch (IOException e) {
            e.printStackTrace();
        }
    }












    }



