module org.example.Part1_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens org.example.Part1_2 to javafx.fxml;
    exports org.example.Part1_2;
}