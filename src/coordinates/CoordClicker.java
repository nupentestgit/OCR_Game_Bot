package coordinates;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Observable;

public class CoordClicker extends Observable {
	
	private Robot bot;
	
	public CoordClicker() {
		try {
			bot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void clickCoord(Coordinate coord) {
		// calculate center
		int x_center = coord.x + coord.width/2;
		int y_center = coord.y + coord.height/2;
		
		bot.mouseMove(x_center, y_center);
		
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		notifyObservers("Habe " + coord.getName() + " angeklickt.");
	}
	
}
