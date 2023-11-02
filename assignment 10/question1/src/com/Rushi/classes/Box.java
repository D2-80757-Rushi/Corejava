package com.Rushi.classes;

public class Box<T extends Employee> {
	private T obj;
	public Box(T obj)
	{
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public double getSalary()
	{
		return this.obj.calculateSalary();
	}
}
