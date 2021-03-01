package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UserViewController {
	@FXML
	private TextField nameField;
	@FXML
	private Button okBtn;
	
	public void showName(ActionEvent e) {
		System.out.println("Hello, " + nameField.getText());
	}
}
