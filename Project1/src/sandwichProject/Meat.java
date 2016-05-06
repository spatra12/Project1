package sandwichProject;

public class Meat extends Ingredient {
	private String cookingMethod = "rare";
	
	public Meat(String method) {
		cookingMethod = method;
	}
	
	public void setCookingMethod(String method) {
		cookingMethod = method;
	}
	
	public String getCookingMethod() {
		return cookingMethod;
	}
	
	public String prep() {
		return cookingMethod;
	}
	
}
