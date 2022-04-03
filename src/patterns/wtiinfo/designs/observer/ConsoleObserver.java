package patterns.wtiinfo.designs.observer;

public class ConsoleObserver implements Observer {

	@Override
	public void update(Subject subject) {
		WeatherForecast wf = (WeatherForecast) subject;
		System.out.println("Temperatura alterada: " + wf.getTemperature());
	}

}
