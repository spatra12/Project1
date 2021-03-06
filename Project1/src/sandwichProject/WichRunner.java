package sandwichProject;

import java.util.Scanner;
import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WichRunner extends JFrame {
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	public WichRunner(Sandwich sand) 	{
		super("MMMM SANDWICH");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(sand);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("THIS IS A SANDWICH MAKER!!!\nWould you like to make a sandwich? (y/n)");
		String choice = input.nextLine();
		
		if((choice.equals("Y") || choice.equals("y")))
		{
			System.out.println("what meat do you want?");
			String meat = input.next(); 
			System.out.println("do you want it rare or well done?");
			
			boolean mt = false; 
			if(input.next().equals("well done"))
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
			if(input.next().equals("grilled"))
				v = true; 

			Veggie veg = new Veggie(veggie, v);
			
			Sandwich which = new Sandwich(moat, brod, veg, soce); 
			System.out.print(which.toString()); 
			WichRunner run = new WichRunner(which);
		}
	}
	
}

