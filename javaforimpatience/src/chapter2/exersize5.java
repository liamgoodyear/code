package chapter2;

/*
 * Implement an immutable class Point that describes a point in the 
 * plane. Provide a constructor to set it to a specific point, 
 * a no-arg constructor to set it to the origin, and methods 
 * getX , getY , translate , and scale . 
 * 
 * The translate method moves the point by a given amount in x - and 
 * y -direction. 
 * 
 * The scale method scales both coordinates by a given factor. 
 * Implement these methods so that they return new points with the 
 * results. 
 * For example, 
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5).
 */

final class Point
{
	private final double x;
	private final double y;
	
	//Default Constructor (no args)
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	//Custom constructor (allows specific x and y pos)
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	//Getters
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	//Setters
	public Point translate(double x, double y)
	{
		double newX = this.x + x;
		double newY = this.y + y;
		return new Point(newX, newY);
	}
	
	public Point scale(double ammount)
	{
		double scaleX = this.x * ammount;
		double scaleY = this.y * ammount;
		
		return new Point(scaleX, scaleY);
		
	}	
}

public class exersize5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//should set p to a point with coordinates (2, 3.5).
		Point p = new Point(3,4).translate(1, 3).scale(0.5);
		
		System.out.println(p.getX() + ", " + p.getY());
	}
}
