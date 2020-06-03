
public class DSIR {
    private int dead;
	private int recovered;
	private int infected;
    private int healthy;
	private int population;
	public DSIR() {
		   dead = 0;
		   recovered=0;
		   infected = 10;
		   healthy = 1000000;
		   population = 1000000;
	}
	public int getDead() {
		return dead;
	}
	public void setDead(int dead) {
		this.dead = dead;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public int getInfected() {
		return infected;
	}
	public void setInfected(int infected) {
		this.infected = infected;
	}
	public int getHealthy() {
		return healthy;
	}
	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	

}
