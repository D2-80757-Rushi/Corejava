package com.Rushi.fruits;

public class Apple extends Fruit{
	
	public Apple() {
		super();
		this.setFresh(true);
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getColor() {
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		super.setColor(color);
	}

	@Override
	public double getWeight() {
		return super.getWeight();
	}

	@Override
	public void setWeight(double weight) {
		super.setWeight(weight);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public boolean isFresh() {
		return super.isFresh();
	}

	@Override
	public void setFresh(boolean isFresh) {
		super.setFresh(isFresh);
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}

	@Override
	public String toString() {
		return "\nFruit:"+this.getClass().getSimpleName()+"\nColor:"+this.getColor()+"\nWeight:"+this.getWeight()+"\nName:"+this.getName()+"\nisFresh:"+this.isFresh();
	}
}
