package patterns.wtiinfo.designs.observer;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class WindowApp {

	private JFrame frame;
	
	public WindowApp(String title, int width, int height) {
		frame = new JFrame();
		frame.setTitle(title);
		frame.setLocation(600, 400);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(new ChangeTemperaturePanel(), BorderLayout.CENTER);
		frame.add(new TextPanel(), BorderLayout.SOUTH);
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
