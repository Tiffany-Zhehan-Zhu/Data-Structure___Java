package lectrue08;

public class TestTicket {

	public static void main(String[] args) {
		
		Ticket t1;
        Ticket t2;
       
        System.out.println( "Ticket count is " + 
                             Ticket.getTicketCount( ) );
       
        t1 = new Ticket( );
        t2 = new Ticket( );
       
        System.out.println( "Ticket count is " +
                            Ticket.getTicketCount( ) );
       
        System.out.println( t1.getSerial( ) );      
        System.out.println( t2.getSerial( ) );
	
	}
}



