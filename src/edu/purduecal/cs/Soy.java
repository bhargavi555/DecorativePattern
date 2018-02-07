package edu.purduecal.cs;

public class Soy extends CondimentDecorator {
 Beverage beverage;

	public Beverage getBeverage() {
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "soy,"+beverage.getDescription();
	}

	public double cost()
	{
		return 0.7+beverage.cost();
	}
}
