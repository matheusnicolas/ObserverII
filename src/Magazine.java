import java.util.ArrayList;
import java.util.List;


public class Magazine implements Subject{
	
	private List<Observer> observers;
	
	private String weeklyMagazine;
	
	public Magazine(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer obs) {
		if(!observers.contains(obs))
			observers.add(obs);		
	}

	@Override
	public void unsubscribe(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observers)
			obs.update();
	}

	public Object getData() {
		return weeklyMagazine;
	}

	public void setWeeklyMagazine(String weeklyMagazine) {
		this.weeklyMagazine = weeklyMagazine;
	}	

}
