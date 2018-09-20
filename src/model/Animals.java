package model;

public class Animals
{

	private boolean elephants;
	private double zebras;
	private int llamas;
	private double dragons;
	
	/**
	 * Default constructor or after the fact customization
	 * AKA I don't know the info yet about the Animals
	 */
	public Animals()
	{
		
	}
	
	/**
	 * Better constructor when I know the information for the animal object
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
	public void setelephants()
	{
		this.elephants = elephants;
	}
	
	public void setzebras()
	{
		this.zebras = zebras;
	}
	
	public void setllamas()
	{
		this.llamas = llamas;
	}
	
	public void setdragons()
	{
		this.dragons = dragons;
	}
	
	
}
