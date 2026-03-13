module org.example {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.Part1 to javafx.fxml;
    exports org.example.Part1;
}