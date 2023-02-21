module com.example.incdec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.incdec to javafx.fxml;
    exports com.example.incdec;
}