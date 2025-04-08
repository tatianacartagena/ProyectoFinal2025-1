module co.edu.uniquindio.proyectofinalestructura.proyectofinalestructura {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyectofinalestructura.proyectofinalestructura to javafx.fxml;
    exports co.edu.uniquindio.proyectofinalestructura.proyectofinalestructura;
}