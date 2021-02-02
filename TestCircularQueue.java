package lecture0304;

public class TestCircularQueue {

	public static void main(String[] args) {
		
		CircularQueue m = new CircularQueue ();
		/* CircularQueue: Data type of m.
		 * m: name of CircularQueue. */
		for (int j = 0; j < 3; j++)
			m.insertQueue();
		
		m.deleteQueue();
		m.printQueueLogical();		
		
	} // end of main

} // end of TestCircularQueue


