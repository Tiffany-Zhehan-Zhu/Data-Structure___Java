package lecture12;

public class Triangle extends Shape{
	private double side1;
	private double side2;
	private double base;
	private double height;

	public Triangle(double s1, double s2, double bs, double hei) {
		side1 = s1;
		side2 = s2;
		base = bs;
		height = hei;
	}
	
	public double area( ){ 
    	return (base * height)/2; 
    }

    public double perimeter( ){ 
    	return (side1 + side2 + base); 
    }
    
    public String toString( ){ 
    	return "Triangle: " + side1 + " " + side2 + " " + base + " " + height; 
    }

}
