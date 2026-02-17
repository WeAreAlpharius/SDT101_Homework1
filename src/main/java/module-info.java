module org.example{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens org.example.Part2 to javafx.fxml;
    opens org.example.Part1 to javafx.fxml;
    exports org.example.Part2;
    exports org.example.Part1;
}
