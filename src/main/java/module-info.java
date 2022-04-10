module com.java.app.students {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.app.students to javafx.fxml;
    exports com.java.app.students;
}