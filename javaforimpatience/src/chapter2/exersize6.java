package chapter2;

/*
 * Repeat the preceding exercise, but now make 
 * translate and scale into mutators.
 */

final class Point1
{
	private double x;
	private double y;
	
	//Default Constructor (no args)
	public Point1()
	{
		x = 0;
		y = 0;
	}
	
	//Custom constructor (allows specific x and y pos)
	public Point1(double x, double y)
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
	public Point1 translate(double x, double y)
	{
		this.x += x;
		this.y += y;
		
		return new Point1(this.x,this.y);
	
	}
	
	public Point1 scale(double ammount)
	{
		this.x *= ammount;
		this.y *= ammount;
		
		return new Point1(this.x,this.y);
		
	}	
}

public class exersize6{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//should set p to a point with coordinates (2, 3.5).
		Point1 p = new Point1(3,4).translate(1, 3).scale(0.5);
		
		System.out.println(p.getX() + ", " + p.getY());
	}
}
