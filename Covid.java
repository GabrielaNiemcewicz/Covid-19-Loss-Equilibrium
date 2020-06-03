//20seconds intervals
public enum Covid {
	public static int [] drate = new int [] {1,3,10}; //in promiles
	double TRANSMITION_RATE = 2.4;
	static int [] TIME_TO_RECOVERY = new int [] {12,22}; //days
	static int [] TIME_TO_CONTAGIOUS = new int [] {1,5}; //days
	final static double AT_RISK = 15*3*1/java.lang.Math.pow(2, -2);  //3 steps in a minute //possible enum
	int MAX_DISTANCE = 9; //meters
	
	
	
 public	static double howContagious(int time_iterator, Person vector) {
	 double distance =1; //hard-coded for now
	int t = 0; //timeline - all project iterator?
	//definitely each Person's quality
	 int t_to_contagious = (int) java.lang.Math.random()*(TIME_TO_CONTAGIOUS[1]-TIME_TO_CONTAGIOUS[0])+TIME_TO_CONTAGIOUS[0];
	 int t_to_recovery = (int) java.lang.Math.random()*(TIME_TO_RECOVERY[1]-TIME_TO_RECOVERY[0])+TIME_TO_RECOVERY[0];
	if(vector.infected&&vector.contagious)
	 if(time_iterator<t_to_contagious)
		return 0;
	if(time_iterator>=t_to_recovery)
		{vector.setToRecovered();
		return 0;
		}
	if(distance>9)
		return 0;
	return 1/java.lang.Math.pow(distance, -2); //spheres' areas of diff radius
	 
 }
 
 
 public void is_Exposed(/*ArrayList*/Person vector) {
	 //if 2metres for 15 minutes, at risk 
	 //develop analogical scenerios
	 int sum = 0; //might be in Person, and decrement with time -> too resource-exhausting, maybe at end of each day
	 if(vector.contagious)
		/*this*/ sum+=howContagious(10,vector);
	 if(sum>AT_RISK)
		 setInitExposure();
		 	 
	 //possibly-wind, aired
 }
 
 private void setInitExposure() {
	 double exposureRisk = 0.3;
 }
 
 //use only at the end of time periods
public void getInfected () {
	
}
//precondition: exposureRisk>initExposure
public double increaseRisk () {
//	double exposureRisk = 0.3 *sum/AT_RISK;
}
 
	
	
}
