package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

public class CartScreenController {
	private Cart cart;
    @FXML
    private TableColumn<?, ?> colMediacategory;

    @FXML
    private TableView<?> tblMedia;

    @FXML
    private TableColumn<?, ?> colMediaCost;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableColumn<?, ?> colMediaTitle;

    
    public CartScreenController(Cart cart) {
    	
    }
}