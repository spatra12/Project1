package sandwichProject;

import java.util.Scanner;

public class WichRunner {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("THIS IS A SANDWICH MAKER!!!\nWould you like to make a sandwich? (y/n)");
		String choice = input.nextLine();
		
		if((choice.equals("Y") || choice.equals("y")))
		{
			//System.out.print("ey");
			Sandwich sandwich = new Sandwich();
			System.out.println("what meat do you want?");
			String meat = input.next(); 
			System.out.println("do you want it rare or cooked?");
			
			boolean mt = false; 
			if(input.next().equals("yes"))
				mt = true; 
			
			Meat moat = new Meat(meat, mt);
			
			System.out.println("what type of bread do you want?");
			String bread = input.next(); 
			System.out.println("do you want it toasted?");
			
			boolean brd = false; 
			if(input.next().equals("yes"))
				brd = true; 
			
			Bread brod = new Bread(bread, brd);
			
			
			System.out.println("what type of sauce do you want?");
			String sauce = input.next(); 
			System.out.println("do you want it warmed?");
			
			boolean sce = false; 
			if(input.next().equals("yes"))
				sce = true; 

			Sauce soce = new Sauce(sauce, sce);
			
			System.out.println("what veggie do you want?");
			String veggie = input.next(); 
			System.out.println("do you want it grilled or raw?");
			
			boolean v = false; 
			if(input.next().equals("yes"))
				v = true; 
				//Bread brd = new Bread(bread, true);
			
			Veggie veg = new Veggie(veggie, v);
			
			Sandwich which = new Sandwich(moat, brod, veg, soce); 
			System.out.print(which.toString()); 
		}
	}
	
}
