package sandwichProject;

public class Sauce extends Ingredient {
	private boolean isWarm;
	
	public Sauce(String name,boolean warm) {
		super(name);
		isWarm = warm;
	}
	
	public void setWarm(boolean warm) {
		isWarm = warm;
	}
	
	public boolean isWarm() {
		return isWarm;
	}
	
	public String prep() {
		if(isWarm)
			return "warm";
		else
			return "cold";
	}
	
}
