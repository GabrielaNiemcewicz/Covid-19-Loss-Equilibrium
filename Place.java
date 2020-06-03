import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Place {
	int MAX_AT_STORE = 6;
	ArrayList<Person> people;
	ArrayList<Location> at;
	Location automatic_door; //can use deep learning to count number of people entering and at the store, to check if max is not exceeded 
	
	ArrayList <Person> queue_outside;
	ArrayList <Place> places;
	ArrayList <RoadPath> roadsToFrom;
	int [] sizeRC = new int [2];
	boolean isFreeSpace; //tree-like structure for each space
	
	
	Place() {
		ArrayList<Person> people= new ArrayList<Person>();
		ArrayList <Place> places= new ArrayList <Place>();
		ArrayList <RoadPath> roadsToFrom= new ArrayList <RoadPath>();
		queue_outside= new ArrayList<Person>();
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
			if(queue_outside.size()==0)
			{people.add(person);
			at.add(automatic_door);}
			else 
				queue_letIn();
				
		else
		{
			queue_outside.add(person);	
		}
	}
	
	public Person letOut(int i) {
		Person person = people.get(0);
		people.remove(i);
		return person;
	}
	
	
	public void queue_letIn () {
		int i=0;
		if(queue_outside.size()>0)
			while(people.size()<this.MAX_AT_STORE)
			{
				people.add(queue_outside.get(i));
				queue_outside.remove(i);
				i++;
			}
	}
	
	
	public void add(Place place) {
		places.add(place);
	}
	
	public void add(RoadPath roadPath) {
		roadsToFrom.add(roadPath);
		
	}
	
	public void queue_Outside(Person person) {
		if(people.size()>MAX_AT_STORE)
			this.queue_outside.add(person);
	}
	
	
	
	private void queue_Contact(int position) {
		int end = this.queue_outside.size();
		Covid c19 = null;
		int singleExplosure;
		Person waitingPerson = queue_outside.get(position);
		for(int i=0;i<position;i++)
			waitingPerson.get_exposed(c19.howContagious(6000, queue_outside.get(i)));
		for(int i=end;i>position;i--)
			waitingPerson.get_exposed(c19.howContagious(6000, queue_outside.get(i)));
	}
	
	//unfinished- howContagious should take distance from pytagorean equation inside interface between each 2 Person position
	public void contact() {
		Covid c19 = null;
		for(int i=0;i<people.size();i++) //gets infected
			for(int j=0;j<people.size();j++) //infected, possibly
				if(i!=j) //not from himself
					people.get(i).get_exposed(c19.howContagious(6000, people.get(j)));
	}
	
	
	
}
