import java.util.ArrayList;

public class HomePlace extends Place {
	Person [] family;
	boolean [] isIn;
	ArrayList<Person> guests; 
	
	public HomePlace(int howMany) {
		super();
		family = new Person [howMany];
		isIn = new boolean [howMany];
		guests= new ArrayList<Person>();
		
	}

}
