module com.mycompany.harelrajendram_lab10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.harelrajendram_lab10 to javafx.fxml;
    exports com.mycompany.harelrajendram_lab10;
}
