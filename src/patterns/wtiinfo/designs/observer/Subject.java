package patterns.wtiinfo.designs.observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void unresisterObserver(Observer observer);
	public void notifyObservers();
	
}
