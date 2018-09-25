package model;

public class Animals
{
// Declaration section
//	Data member section
//	Also called instance variables
//	These are special b/c they get a default value
//	All numbers => 0
//	Booleans => false
//	Objects => null
	
	private boolean elephants;
	private double zebras;
	private int llamas;
	private double dragons;
	
	/**
	 * Default constructor or after the fact customization.
	 * AKA I don't know the info yet about the Animals.
	 * Initializing data members with "bad" values to be changed.
	 */
	public Animals()
	{
		this.elephants = true;
		this.zebras = 99000;
		this.llamas = 5;
		this.dragons = 88;
	}
	
	/**
	 * Better constructor when I know the information for the animal object.
	 * @param elephants
	 * @param zebras
	 * @param llamas
	 * @param dragons
	 */
	public Animals (boolean elephants, double zebras, int llamas, double dragons)
	{
		this.elephants = elephants;
		this.zebras = zebras;
		this.llamas = llamas;
		this.dragons = dragons;
	}
	
//	getters
	public boolean getelephants()
	{
		return elephants;
	}
	
	public double getzebras()
	{
		return zebras;
	}
	
	public int getllamas()
	{
		return llamas;
	}
	
	public double getdragons()
	{
		return dragons;
	}
	
//	setters
	public void setelephants(boolean elephants)
	{
		this.elephants = elephants;
	}
	
	public void setzebras(double zebras)
	{
		this.zebras = zebras;
	}
	
	public void setllamas(int llamas)
	{
		this.llamas = llamas;
	}
	
	public void setdragons(double dragons)
	{
		this.dragons = dragons;
	}
	
	
}
