package lecture11;

public class PersonDemo {

	public static void printAll( Person [ ] arr ) {	
		for( int i = 0; i < arr.length; i++ ) {	
			if( arr[ i ] != null ) {		
				System.out.print( "[" + i + "] " );	
				System.out.println( arr[ i ].toString( ) );
			}
		}
	}
	
	public static void main(String[] args) {
		
		Person [ ] p = new Person[ 5 ];
		p[0] = new Person( "Tiffany", 24, "Pittsburgh", "412-555-1212" );
		p[1] = new Person( "Joe", 25, "New York", "212-555-1212" );
		p[2] = new Student( "Jill", 27, "Chicago", "312-555-1212", 4.0 );
		p[3] = new Employee( "Bob", 29, "Boston", "617-555-1212", 100000.0 );
		
		printAll( p );
	}	
}
