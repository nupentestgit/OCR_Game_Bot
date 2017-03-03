package screenshots.types;

import java.awt.image.BufferedImage;

public class DummyImage {
	
	private BufferedImage dummy;
	
	public DummyImage(BufferedImage img) {
		this.dummy = img;
	}

	public BufferedImage getDummy() {
		return dummy;
	}

	public void setDummy(BufferedImage dummy) {
		this.dummy = dummy;
	}
	
}
