package patterns.wtiinfo.designs.observer;

import javax.swing.JTextField;

public class TextObserver implements Observer{

	private JTextField newTxtTemp;
	
	public TextObserver(JTextField newTxtTemp) {
		this.newTxtTemp = newTxtTemp;
	}

	@Override
	public void update(Subject subject) {
		WeatherForecast wf = (WeatherForecast) subject;
		newTxtTemp.setText(String.valueOf(wf.getTemperature()));
	}

}
