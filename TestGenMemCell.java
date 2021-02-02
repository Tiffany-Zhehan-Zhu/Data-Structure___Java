package lecture13;

public class TestGenMemCell {

	public static void main(String[] args) {
		
		GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		m.write(new Integer(468));
		Integer val = m.read();
		int newVal = val.intValue();
		System.out.println("Integer contents are: " + newVal);			

		GenericMemoryCell<Float> n = new GenericMemoryCell<Float>();
		n.write(new Float(4.6));
		Float val2 = n.read();
		float newVal2 = val2.floatValue();
		System.out.println("Float contents are: " + newVal2);	
		
		GenericMemoryCell<String> p = new GenericMemoryCell<String>();
		p.write("37");
        String val3 = p.read( );
        System.out.println( "String contents are: " + val3 );
	}

}
