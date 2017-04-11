
public class Car {
	
	private	String make;
	private int speed;
	
	
	public void setSpeed(int sp){
		speed = sp;
	}
	
	public int getSpeed(){
		return speed; 
	}
	public void accelerate(){
		speed = speed + 5; 
		
	}

}
