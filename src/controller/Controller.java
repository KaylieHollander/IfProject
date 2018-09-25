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
		
	}
		

	
}
