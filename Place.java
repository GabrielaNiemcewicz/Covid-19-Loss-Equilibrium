import java.util.ArrayList;

public class Place {

	ArrayList<Person> people;
	ArrayList <Place> places;
	ArrayList <RoadPath> roadsToFrom;
	int [] sizeRC = new int [2];
	boolean isFreeSpace; //tree-like structure for each space
	
	
	Place() {
		ArrayList<Person> people= new ArrayList<Person>();
		ArrayList <Place> places= new ArrayList <Place>();
		ArrayList <RoadPath> roadsToFrom= new ArrayList <RoadPath>();
		isFreeSpace = true;
		
	}
	
	
//	[]
//	[]
//	[]
//	[]
	//[]
//	[]
	///[]
//	[]
	
	public void add(Place place) {
		places.add(place);
	}
	
	public void add(RoadPath roadPath) {
		roadsToFrom.add(roadPath);
		
	}
}
