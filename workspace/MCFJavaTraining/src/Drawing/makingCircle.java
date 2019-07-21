package Drawing;
import java.applet.*;
import java.awt.*;

public class makingCircle extends Applet{
	
	public void paint(Graphics x){
		x.drawOval(10 , 10, 30, 30);
		x.setColor(Color.BLUE);
		int i = 0;
		while(true){
			i++;
			x.fillOval(i, 30, 60, 60);
		}
		
	}
	
}