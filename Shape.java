package lecture12;

public abstract class Shape {

	public abstract double area( );
	public abstract double perimeter( );
	 
	public double semiperimeter( ){ 
		 return perimeter( ) / 2; 
	}

}
