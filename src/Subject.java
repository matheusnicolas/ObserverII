
public interface Subject {
	
	public void subscribe(Observer obs);
	public void unsubscribe(Observer obs);
	
	public void notifyObservers();
	
	public Object getData();

}
