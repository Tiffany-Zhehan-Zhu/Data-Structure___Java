package lecture13;

public class TestMemoryCell {

	public static void main(String[] args) {
		
		MemoryCell m = new MemoryCell();
		
        m.write( "37" );
        String val = (String) m.read( );
        System.out.println( "String contents are: " + val );
        
		m.write(new Integer(46));
		Integer val2 = (Integer) m.read();
		int newVal2 = val2.intValue();
		System.out.println("Integer contents are: " + newVal2);			

		m.write(new Float(4.6));
		Float val3 = (Float) m.read();
		float newVal3 = val3.floatValue();
		System.out.println("Float contents are: " + newVal3);		
	}

}
