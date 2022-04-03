package patterns.wtiinfo.designs.observer;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TextPanel extends JPanel {
	
	public TextPanel() {
		JTextField txtTemp = new JTextField(10);
		txtTemp.setFont(new Font("Arial", Font.BOLD, 24));
		txtTemp.setEnabled(false);
		add(txtTemp);
		
		TextObserver observer = new TextObserver(txtTemp);
		WeatherForecast.getInstance().registerObserver(observer);
	}


}
