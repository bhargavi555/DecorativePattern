package edu.purduecal.cs;

public abstract class CondimentDecorator  {
	private String description;
	private boolean houseblend,darkroast,decaf,espresso= false;
	public abstract String getDescription();
		// TODO Auto-generated method s
	public abstract double cost();

}
