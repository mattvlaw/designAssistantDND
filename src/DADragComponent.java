import java.awt.*;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JComponent;

public class DADragComponent {
	
	private JFrame g_window;
	private JFrame pc_window;
	
	private final int xMin = 85;
	private final int xMax = 1285; //4000x (0,0.281)
	private final int yMin = 25;
	private final int yMax = 825; //(1/12)x (0,9981)
	private final double xScale = 4000;
	private final double yScale = 1/12.0;
	private final int configWindowWidth = 480;
	private final int configWindowHeight = 480;
	public static HashMap<String,GraphPoint> pixelMap = new HashMap<String,GraphPoint>();
	
	public DADragComponent() {
	
		
		g_window = new JFrame();
		g_window.setTitle("Cost vs Science Benefit Plot");
		g_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g_window.setBounds(xMin+configWindowWidth, yMin+5, xMax+55, yMax+75);
	    GraphCoordinates initialGraph = new GraphCoordinates(xMin, xMax, yMin, yMax, xScale, yScale);
	    //initialGraph.addMouseListener(mouseAdapt);
	    
	    g_window.getContentPane().add(initialGraph);
	    
	    g_window.getContentPane().setBackground(Color.WHITE);
	    g_window.setVisible(true);

	   
	    pc_window = new JFrame();
	    pc_window.setTitle("Configuration History");
	    pc_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	   
	    pc_window.setBounds(0, yMin+configWindowHeight, configWindowWidth, configWindowHeight);
	    pc_window.getContentPane().setBackground(Color.WHITE);
	    
	    pc_window.setVisible(true);
	    
		
	}

}
