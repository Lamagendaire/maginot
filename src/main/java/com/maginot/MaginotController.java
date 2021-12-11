package com.maginot;

import com.maginot.model.Cell;
import com.maginot.model.MainGridPane;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MaginotController implements Initializable {
	private static MaginotController INSTANCE;
	private final DoubleProperty TrasnlateX = new SimpleDoubleProperty(0);
	private final DoubleProperty TrasnlateY = new SimpleDoubleProperty(0);
	private double anchorX, anchorY;
	@FXML
	private Label welcomeText;
	@FXML
	private Label testText;
	@FXML
	private MenuItem fileClose;
	@FXML
	private MainGridPane mainPane;
	@FXML
	private ScrollPane mainPaneContainer;
	private double anchorTranslateX;
	private double anchorTranslateY;
	@FXML
	private SplitPane splitPane;

	public static MaginotController getInstance() {
		if(MaginotController.INSTANCE == null)
			MaginotController.INSTANCE = new MaginotController();
		return MaginotController.INSTANCE;
	}

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}

	public void installMainGridPane() {
		mainPane.getColumnConstraints().removeAll();
		mainPane.setStyle("-fx-background-color: RED;");
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		//mainPane.setStyle("-fx-background-color: GREEN;");
		installMainGridPane();
	}

	@FXML
	protected void onMainPaneScrol() {

	}
}