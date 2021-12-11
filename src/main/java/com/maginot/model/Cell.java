package com.maginot.model;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Cell extends Pane {

	public Cell(Double size) {
		super();
		setPrefSize(size, size);
		setMinSize(size, size);
		setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
}
