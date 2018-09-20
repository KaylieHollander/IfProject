package model;

public class Animals
{

	private int elephants;
	private double zebras;
	private int llamas;
	
	public Animals (int elephants, double zebras, int llamas)
	{
		this.elephants = elephants;
		this.zebras = zebras;
		this.llamas = llamas;
	}
	
//	getters
	public int getelephants()
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
	
	
}
