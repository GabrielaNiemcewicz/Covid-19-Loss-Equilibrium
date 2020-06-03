
public class Person {

	boolean infected;
	boolean susceptible;
	boolean contagious;
	boolean hasWork; 
	double exposure;
	int age;
	double exposureRisk;
	Character character;
	int timeToRecovery;
	int [] position;
	
	Person(){
		susceptible = true;
		infected = false;
		contagious = false;
		position= new int[] {(int) (100* Math.random()),  (int) (100* Math.random())};
		exposure=0;
	}
	
	public void move() {} 
	
	public void socialize() {}
	
	public void go_to_(Place place) {}
	
	public void exercise() {}
	
	public void get_exposed(double viralLoad) {
		if(infected==false&&susceptible==true)
		exposure+=viralLoad;
				
	}
	
	public double infect() {
		Covid c19 = null;
		double vl;
		if(infected==true)
			{vl= c19.howContagious(timeToRecovery, this);
			return vl;}
		else return 0;
	}
	
	public void touch_or_sneeze(Place surface) {}
	  Covid c19;
	//precondition: time iterator >= recovery time
	 public void setToRecovered() {
		 double drate = 100*java.lang.Math.random();
		 if(infected == true)
			 if(drate<=c19.drate[1]) //hard-coded for now
				 this.die();
			 else if(drate>33+c19.drate[1])
				 this.recover();
			 else contagious = false;
				 
		 infected = false;
	 }
	 
	 private void die() {
		 
	 }
	 
	 private void recover() {
		 susceptible = false;
		 contagious = false;
	 }

	//if person is not in the city, he is in his house
	
}
