package com.maginot.model;

import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

public class MainGridPane extends GridPane {
	public MainGridPane() {
		super();
		configure();
	}

	public void configure(){
		for(int j = 0; j < 30; j++){
			for(int i = 0; i < 15; i++) {
				Cell cell = new Cell(75.0);
				this.add(cell, j, i);
			}
		}
	}
}
