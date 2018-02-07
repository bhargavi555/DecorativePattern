package edu.purduecal.cs;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "mocha,"+beverage.getDescription();
	}
	
	public double cost()
	{
		return 0.6+beverage.cost();
	}

}
