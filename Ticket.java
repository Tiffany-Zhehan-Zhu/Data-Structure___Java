package lectrue08;

public class Ticket {
	
	private int serialNumber;
    private static int ticketCount = 0;
	
	public Ticket( ) {
        System.out.println( "Calling constructor" );
        serialNumber = ++ticketCount;
    }

	public String toString( ) {
        return "Ticket #" + getSerial( );
    }
	
	// Getters
	public int getSerial( ) {
        return serialNumber;
    }
	
	public static int getTicketCount( ) {
        return ticketCount;
    }

}



