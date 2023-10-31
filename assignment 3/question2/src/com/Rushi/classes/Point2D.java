package com.Rushi.classes;
import java.util.Objects;
public class Point2D {
	public int x_axis;
	public int y_axis;
	
	public Point2D(int x_axis, int y_axis) {
		super();
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}

	@Override
	public String toString() {
		return "("+x_axis+","+y_axis+")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x_axis, y_axis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x_axis == other.x_axis && y_axis == other.y_axis;
	}
	
	public double calculateDistance(Point2D p2)
	{
		return Math.sqrt(Math.pow((x_axis-p2.x_axis),2)+Math.pow((y_axis-p2.y_axis),2));
	}
	
	public boolean isEquals(Point2D p2)
	{
		return (this.x_axis==p2.x_axis && this.y_axis==p2.y_axis);
	}
}
