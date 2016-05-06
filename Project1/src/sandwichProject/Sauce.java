package sandwichProject;

public class Sauce extends Ingredient {
	private boolean isWarm;
	
	public Sauce(boolean warm) {
		isWarm = warm;
	}
	
	public void isWarm(boolean warm) {
		isWarm = warm;
	}
	
	public String prep() {
		if(isWarm)
			return "warm";
		else
			return "cold";
	}
	
}
