package com.Rushi.fruits;

public class Orange extends Fruit{

	public Orange() {
		super();
		this.setFresh(true);
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name, true);
		this.setFresh(true);
	}
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		super.setColor(color);
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public boolean isFresh() {
		// TODO Auto-generated method stub
		return super.isFresh();
	}

	@Override
	public void setFresh(boolean isFresh) {
		// TODO Auto-generated method stub
		super.setFresh(isFresh);
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	public String toString() {
		return "\nFruit:"+this.getClass().getSimpleName()+"\nColor:"+this.getColor()+"\nWeight:"+this.getWeight()+"\nName:"+this.getName()+"\nisFresh:"+this.isFresh();
	}

}
