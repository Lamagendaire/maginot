package com.maginot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MaginotApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MaginotApplication.class.getResource("maginot.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 750, 500);
		stage.setTitle("Maginot");
		stage.setScene(scene);
		stage.setMaximized(true);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}