package sandwichProject;

public class Bread extends Ingredient {
	private boolean toasted = false;
	
	public Bread(String name,boolean toast) {
		super(name);
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
