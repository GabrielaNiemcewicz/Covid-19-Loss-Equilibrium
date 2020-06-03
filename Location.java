
public class Location {
	double x,y;
	
	public Location(int x, int y) {
		this.x = (double)x;
		this.y = (double)y;
	}
	
	public double getX() {
		return x;
	}
	public void moveX(int dx) {
		this.x += dx;
	}
	public double getY() {
		return y;
	}
	public void moveY(int dy) {
		this.y += dy;
	}


}
