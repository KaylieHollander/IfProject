package controller;

// Import section
import javax.swing.JOptionPane;
import model.Thing;
import java.util.ArrayList;

public class Controller
{

	/**
	 * Builds the instance of the Controller.
	 */
	public Controller()
	{
		
	}
	
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		loops();
		askUser();
		lotsOfPlanets();
	}
	
	
	private void loops()
	{
//		boolean isDone = false;
//		boolean isLlama = false;
//		int countDone = 0;
//		int countLlama = 0;
//		
//		while (!isDone)//test the variable
//		{
//			JOptionPane.showMessageDialog(null, "Dragon");
////			Eventually change the loop variable
//			countDone++;
//			if (countDone >= 10)
//			{
//				isDone = true;	// update variable
//			}
//		}
//		
//		while (!isLlama)
//		{
//			JOptionPane.showMessageDialog(null, "Llama");
//			countLlama++;
//			if (countLlama >=15)
//			{
//				isLlama = true;
//			}
//			
		}
		
//		for (int loop = 30; loop >=0; loop -= 2)
//		{
//			Thing mars = new Thing();
//			
//			JOptionPane.showMessageDialog(null, "The number of mars is:" + mars);
//		}
		
		
		
		
		
//	}
	
	private void lotsOfPlanets()
	{
//		Local variables are only visible in the method they are defined in.
//		They only have SCOPE to that method
		
		ArrayList<Thing> myPlanets = new ArrayList<Thing>();
		
	
//		Have to use a wrapper class to hold a primitive in a list
//		Must be capitalized
		
		
		Thing samplePlanet = new Thing();
		Thing otherPlanet = new Thing();
		
		myPlanets.add(samplePlanet);
		myPlanets.add(samplePlanet);
		myPlanets.add(otherPlanet);
		
		for(int index = 0; index < myPlanets.size(); index +=1)
		{
//			Good for display, or minor changes
			JOptionPane.showMessageDialog(null, myPlanets.get(index).getmars());
			
			Thing currentPlanet = myPlanets.get(index);
			currentPlanet.setmars(index * currentPlanet.getmars());
		}
		for (Thing current : myPlanets)
		{
			JOptionPane.showMessageDialog(null, "The planet is named" + current.getmars());
		}
		
	}

	private void planetLists()
	{
		ArrayList<Integer> mySpace = new ArrayList<Integer>();
		
		Thing sampleSpace = new Thing();
		
		mySpace.add(sampleSpace);
		
		
	}
	
		
	private void askUser()
	{
		
		Thing mars = new Thing();
//		Thing jupiter = new Thing();
		
		
		String response = JOptionPane.showInputDialog(null, "How many miles away is mars?");
		while (response == null || !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Wrong number of miles");
		}
		
//		assign and convert
		mars.setmars(Double.parseDouble(response));
		
		JOptionPane.showMessageDialog(null, mars);
		
//		response = JOptionPane.showInputDialog(null, "How many miles away is mars?");
//		if (response.equals("10"))
//		{
//			JOptionPane.showMessageDialog(null, "Wrong number of miles");
//		}
		
		
		while (Integer.parseInt(response) != 10000)
		{
			response = JOptionPane.showInputDialog(null, "How many miles away is mars?");
		}
		
		
//		String jupiterresponse = JOptionPane.showInputDialog(null, "What is the meaning of Jupiter?");
//		
//		jupiter.setjupiter(Double.parseDouble(response));
//		
//		JOptionPane.showMessageDialog(null, jupiter);
//		
//		while (jupiterresponse == null || !validDouble(jupiterresponse))
//		{
//			jupiterresponse = JOptionPane.showInputDialog(null, "Wrong meaning");
//		}
//		
//		
//		while (jupiterresponse != "blue")
//		{
//			jupiterresponse = JOptionPane.showInputDialog(null, "What is the meaning of Jupiter?");
//		}
//		
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value");
		}
		
		return isValid;
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type in a number");
		}
		
		return isValid;
	}

	
}
