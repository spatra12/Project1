package sandwichProject;

public class Veggie extends Ingredient {
	private boolean method;
	
	public Veggie(String name,boolean method) {
		super(name);
		setCookingMethod(method); 
	}
	
	public void setCookingMethod(boolean method) {
		this.method = method;
	}
	
	public boolean isGrilled() {
		return method;
	}
	
	public String prep() {
		
		if(method)
			return "grilled";
		else
			return "raw";
	}
}
