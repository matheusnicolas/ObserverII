import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Person> subscribers = new ArrayList<Person>();
		
		Person eduardo = new Person("Eduardo", 	1111111);
		subscribers.add(eduardo);
		Person joao = new Person("Joao", 2222222);
		subscribers.add(joao);
		Person nathalia = new Person("Nathalia", 3333333);
		subscribers.add(nathalia);
		
				
		Person zeAntonio = new Person("Jose Antonio", 4444444);
		
		Magazine veja = new Magazine();
		for(Person p : subscribers)
			p.setSubject(veja);
				
		veja.setWeeklyMagazine("A Republica do Pixuleco - 19/08/2015");
		veja.notifyObservers();
		
		for(Person p : subscribers)
			System.out.println(p.getState());
		
		
		subscribers.add(zeAntonio);
		zeAntonio.setSubject(veja);
		
		
		for(Person p : subscribers)
			System.out.println(p.getState());
		
		veja.setWeeklyMagazine("Iguais perante a lei - 26/08/2015");
		veja.notifyObservers();
		
		for(Person p : subscribers)
			System.out.println(p.getState());

	}

}
