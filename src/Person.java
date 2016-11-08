
public class Person implements Observer{
	
	private String name;
	private int cpf;
	private Subject subject;
	
	private String articleOfTheWeek;
	
	public Person(String name, int cpf){
		this.name = name;
		this.cpf = cpf;		
	}
	
	public void setSubject(Subject subject){
		this.subject = subject;
		subject.subscribe(this);
	}

	@Override
	public void update() {
		Object obj = subject.getData();
		if(obj instanceof String)
			articleOfTheWeek = (String)obj;
	}
	
	public String getState(){
		return "Name: "+name+"\nCpf: "+cpf+"\nArticle of the week: "+articleOfTheWeek;	
	}

}
