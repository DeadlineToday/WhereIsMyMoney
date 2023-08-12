module com.example.whereismymoney {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.whereismymoney to javafx.fxml;
    exports com.example.whereismymoney;
}