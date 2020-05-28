import java.util.ArrayList;

public class City extends Place {
ArrayList<Place> districts;


City(){
	
	for(int i=0;i<24;i++)
		{districts.add(new Place());
		for(int j=24-i;j>=0;j--)
			districts.get(i).add(new Place());
		
		
		
		}
	
	
	
	
	
}




}
