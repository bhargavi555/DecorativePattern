package edu.purduecal.cs;

public class Whip extends CondimentDecorator {
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
		return "Whip,"+beverage.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.8+beverage.cost();
	}

}
