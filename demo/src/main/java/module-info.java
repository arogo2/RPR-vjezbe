module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens ba.unsa.etf.rpr to javafx.fxml;
    exports ba.unsa.etf.rpr;
}