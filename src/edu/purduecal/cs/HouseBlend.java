package edu.purduecal.cs;

public class HouseBlend extends Beverage {
	private CondimentDecorator condimentdecorator;

	public CondimentDecorator getcondimentdecorator() {
		return condimentdecorator;
	}

	public void setcondimentdecorator(CondimentDecorator condimentdecorator) {
		this.condimentdecorator =condimentdecorator;
	}

	public double cost()
	{
		return 2.0;
		
	}

	 public String getDescription(){
			return "House Blend+condimentdecorator.getDescription()";
			
		}
}
