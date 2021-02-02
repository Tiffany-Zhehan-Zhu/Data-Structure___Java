package lecture12;

public class Circle extends Shape{	
	private double radius;
	
	public Circle( double rad ){ 
		radius = rad; 
	}

    public double area( ){ 
    	return Math.PI * radius * radius; 
    }

    public double perimeter( ){ 
    	return 2 * Math.PI * radius; 
    }
    
    public String toString( ){ 
    	return "Circle: " + radius; 
    }
}