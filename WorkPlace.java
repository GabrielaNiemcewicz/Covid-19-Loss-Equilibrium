import java.util.ArrayList;

public class WorkPlace extends CompanyPlace{
	int currentAssets;
	int assets;
	int current_liabilities;
	int long_term_liabilities;
	int income_monthly;
	int income_daily;
	
	ArrayList<Person> workers;
	
	WorkPlace(){ //should be constructed with workers
		super();
		workers = new ArrayList<Person>();
		
		
		
	}
	
	
}
