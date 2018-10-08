package model;



public class Thing
{
// Declaration section
//	Data member section
//	Also called instance variables
//	These are special b/c they get a default value
//	All numbers => 0
//	Booleans => false
//	Objects => null
	
	private double jupiter;
	private double venus;
	private double mars;
	private double neptune;
	
	/**
	 * Default constructor or after the fact customization.
	 * AKA I don't know the info yet about the Animals.
	 * Initializing data members with "bad" values to be changed.
	 */
	public Thing()
	{
		
	}
	
	/**
	 * Better constructor when I know the information for the animal object.
	 * @param jupiter
	 * @param venus
	 * @param mars
	 * @param neptune
	 */
	public Thing (double jupiter, double venus, double mars, double neptune)
	{
		this.jupiter = jupiter;
		this.venus = venus;
		this.mars = mars;
		this.neptune = neptune;
	}
	
//	getters
	public double getjupiter()
	{
		return jupiter;
	}
	
	public double getvenus()
	{
		return venus;
	}
	
	public double getmars()
	{
		return mars;
	}
	
	public double getneptune()
	{
		return neptune;
	}
	
//	setters
	public void setjupiter(double jupiter)
	{
		this.jupiter = jupiter;
	}
	
	public void setvenus(double venus)
	{
		this.venus = venus;
	}
	
	public void setmars(double mars)
	{
		this.mars = mars;
	}
	
	public void setneptune(double neptune)
	{
		this.neptune = neptune;
	}
	
	public String toString()
	{
		String description = "You answered" + mars ;
		
		description = "You answered" + jupiter ;
		
		return description;
	}
	
}
