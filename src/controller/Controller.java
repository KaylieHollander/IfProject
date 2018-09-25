package controller;

// Import section
import javax.swing.JOptionPane;
import model.Animals;


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
	}
	
	
	private void loops()
	{
		boolean isDone = false;
		boolean isLlama = false;
		int countDone = 0;
		int countLlama = 0;
		
		while (!isDone)//test the variable
		{
			JOptionPane.showMessageDialog(null, "Dragon");
//			Eventually change the loop variable
			countDone++;
			if (countDone >= 10)
			{
				isDone = true;	// update variable
			}
		}
		
		while (!isLlama)
		{
			JOptionPane.showMessageDialog(null, "Llama");
			countLlama++;
			if (countLlama >=15)
			{
				isLlama = true;
			}
			
		}
		
		for (int loop = 0; loop <30; loop += 2)
		{
			JOptionPane.showMessageDialog(null, "The loop value is:" + loop);
		}
		
		
		
		
		
	}
		
	private void askUser()
	{
		String response = JOptionPane.showInputDialog(null, "How many llamas?");
		
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Wrong number of llamas");
		}
		
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
			JOptionPane.showMessageDialog(null, "This requires a double value >)");
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
