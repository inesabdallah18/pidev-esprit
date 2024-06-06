package Controllers;


import Entites.User;
import Services.ServiceAdministrateur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AjouterUser {

    @FXML
    private TextField usremail;

    @FXML
    private TextField usrnom;

    @FXML
    private TextField usrnumero;

    @FXML
    private TextField usrprenom;

    @FXML
    private TextField usrpwd;



    ServiceAdministrateur admin = new ServiceAdministrateur();


    @FXML
    void AjouterUser(ActionEvent event) {

        try {
            admin.ajouter(new User(usrnom.getText(), usrprenom.getText(), usrnumero.getText(), usremail.getText(), usrpwd.getText()));
        } catch (SQLException e) {
            System.out.println(e);
        }

    }}




