package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDerpartment;
	@FXML
	private MenuItem menuItemAbout;
	
	public void onMenuItemSellerAction() {
		System.out.println("oi");
	}
	public void onMenuItemDepartmentAction() {
		System.out.println("tchau");
	}
	public void onMenuItemAboutAction() {
		System.out.println("feliz natal");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

}
