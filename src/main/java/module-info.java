module com.example.hw1cs151javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hw1cs151javafx to javafx.fxml;
    exports com.example.hw1cs151javafx;
}