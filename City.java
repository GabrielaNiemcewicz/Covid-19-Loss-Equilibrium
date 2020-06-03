import java.util.ArrayList;

public class City extends Place {
ArrayList<Place> districts;


City(){
	
	for(int i=0;i<24;i++)
		{districts.add(new Place());
		for(int j= 24-i;j>=0;j--)
			{for(int k= 1+i%2; k>=0;k--)
				districts.get(i).add(new WorkPlace());
			if(i+j>18)
				districts.get(i).add(new LeasurePlace());
			for(int k=3;k>=0;k--)
			districts.get(i).add(new CompanyPlace());
			
			}
		}
	
	
	
	
	
}




}
