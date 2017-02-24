package coordinates;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class Coordinate extends Rectangle {

	private static final long serialVersionUID = 1L;
	private String name;

	public Coordinate(int x, int y, int w, int h) {
		super(new Point(x, y), new Dimension(w, h));
		name = "nothing";
	}

	public Coordinate(int x, int y, int w, int h, String name) {
		this(x, y, w, h);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
