import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class Marker {
	
	private String id;

	private int width;
	private int height;
	
	public Marker(String id) {
		this.id = id;
		width = 10;
		height = 10;
	}
	
	public Marker(String id, int width, int height) {
		this.id = id;
		this.width = width;
		this.height = height;
	}
	
public void paintColor(Graphics2D g, int x, int y, Paint p) {
		
		g.setPaint(p);
		g.fillRect(x, y, width, height);
		g.setPaint(Color.white);
		g.drawString(id,x+width/2,y+height/2);
		
	}

public String getID() {
	return id;
}

}
