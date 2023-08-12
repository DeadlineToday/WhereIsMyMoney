package com.example.whereismymoney;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.sql.SQLException;

public class Controller {

    @FXML
    void showButton(ActionEvent event) throws SQLException, ClassNotFoundException {

        DataBaseFunctions dataBaseFunctions = new DataBaseFunctions();

        dataBaseFunctions.createTable(dataBaseFunctions.connectToDB());

    }

}
