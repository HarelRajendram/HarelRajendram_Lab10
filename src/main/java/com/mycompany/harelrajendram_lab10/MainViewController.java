package com.mycompany.harelrajendram_lab10;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;

public class MainViewController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private MenuItem closeItem;

    @FXML
    private MenuItem copyItem;

    @FXML
    private MenuItem findItem;

    @FXML
    private CheckMenuItem gridItem;

    @FXML
    private RadioMenuItem largeItem;

    @FXML
    private RadioMenuItem mediumItem;
    
    @FXML
    private AnchorPane mainPane;

    @FXML
    private MenuItem newItem;

    @FXML
    private MenuItem openItem;

    @FXML
    private MenuItem replaceItem;

    @FXML
    private MenuItem saveItem;

    @FXML
    private Menu searchMenu;

    @FXML
    private RadioMenuItem smallItem;

    @FXML
    void handleClose(ActionEvent event) {

    }

    @FXML
    void handleCopy(ActionEvent event) {

    }

    @FXML
    void handleFind(ActionEvent event) {

    }

    @FXML
    void handleGrid(ActionEvent event) {

    }

    @FXML
    void handleNew(ActionEvent event) {

    }

    @FXML
    void handleOpen(ActionEvent event) {

    }
    @FXML
    void handleSave(ActionEvent event) {

    }

    @FXML
    void handleReplace(ActionEvent event) {

    }

    @FXML
    void handleSizeLarge(ActionEvent event) {

    }

    @FXML
    void handleSizeMedium(ActionEvent event) {

    }

    @FXML
    void handleSizeSmall(ActionEvent event) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    ToggleGroup tg = new ToggleGroup();
    smallItem.setToggleGroup(tg);
    mediumItem.setToggleGroup(tg);
    largeItem.setToggleGroup(tg);
    closeItem.setDisable(true); // disabled until a file is "opened"
    
    newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
}
    @FXML
    private void handleNew() {
        
    System.out.println("NEW has been pressed");
    newItem.setDisable(true);
    openItem.setDisable(true);
    closeItem.setDisable(false);
}   
    
    @FXML
private void handleOpen() {
 System.out.println("OPEN has been pressed");
 newItem.setDisable(true);
 openItem.setDisable(true);
 closeItem.setDisable(false);
}
@FXML
private void handleClose() {
 System.out.println("CLOSE has been pressed");
 newItem.setDisable(false);
 openItem.setDisable(false);
 closeItem.setDisable(true);
}
@FXML
private void handleSave() {
 System.out.println("SAVE has been pressed");
 newItem.setDisable(false);
 openItem.setDisable(false);
 closeItem.setDisable(false);
}
    
    
    @FXML
    private void handleGrid() {
        
    if (gridItem.isSelected())
        System.out.println("USE GRIDLINES selected");
    else
        System.out.println("USE GRIDLINES unselected");
    }
    @FXML
private void handleCopy() {
 System.out.println("Copy has been pressed");
}
@FXML
private void handleFind() {
 System.out.println("Find has been pressed");
 replaceItem.setDisable(true);
}
@FXML
private void handleReplace() {
 System.out.println("Replace has been pressed");
 findItem.setDisable(true);
}
@FXML
private void handleSizeSmall() {
    if (smallItem.isSelected()) {
        System.out.println("small size has been pressed");
    }
}
@FXML
private void mediumItem() {
    if (mediumItem.isSelected()) {
        System.out.println("medium size has been pressed");
    }
}
@FXML
private void handleSizeLarge() {
    if (largeItem.isSelected()) {
        System.out.println("large size has been pressed");
    }
}


}
