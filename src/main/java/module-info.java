module com.example.primeiroprograma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprograma to javafx.fxml;
    exports com.example.primeiroprograma;
}