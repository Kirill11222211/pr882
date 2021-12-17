module com.example.pr882 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr882 to javafx.fxml;
    exports com.example.pr882;
}