package sandwichProject;

public class Bread extends Ingredient {
	private boolean toasted = false;
	
	public Bread(boolean toast) {
		toasted = toast;
	}
	public void toast() {
		toasted = true;
	}
	
	public String prep() {
		if(toasted)
			return "toasted";
		else
			return "untoasted";
	}
	
}
