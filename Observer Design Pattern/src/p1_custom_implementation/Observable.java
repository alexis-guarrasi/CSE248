package p1_custom_implementation;

public interface Observable {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();
}
