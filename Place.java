import java.util.ArrayList;
import java.util.Queue;

public class Place {
	final int MAX_AT_STORE = 6;
	ArrayList<Person> people;
	ArrayList<Location> at;
	Location automatic_door; //can use deep learning to count number of people entering and at the store, to check if max is not exceeded 
	
	Queue <Person> queue_outside;
	ArrayList <Place> places;
	ArrayList <RoadPath> roadsToFrom;
	int [] sizeRC = new int [2];
	boolean isFreeSpace; //tree-like structure for each space
	
	
	Place() {
		ArrayList<Person> people= new ArrayList<Person>();
		ArrayList <Place> places= new ArrayList <Place>();
		ArrayList <RoadPath> roadsToFrom= new ArrayList <RoadPath>();
		queue_outside= new java.util.Queue<~>();
		isFreeSpace = true;
		sizeRC[0] = 10;	sizeRC[1]= 5;
		automatic_door = new Location (0,0);
	}
	
	



//	[]
//	[]
//	[]
//	[]
	//[]
//	[]
	///[]
//	[]
	
	
	public void letIn(Person person) {
		if(people.size()<MAX_AT_STORE)
			people.add(person);
			at.add(automatic_door);
	}
	
	public void letOut() {
		
		
	}
	
	
	public void add(Place place) {
		places.add(place);
	}
	
	public void add(RoadPath roadPath) {
		roadsToFrom.add(roadPath);
		
	}
}
