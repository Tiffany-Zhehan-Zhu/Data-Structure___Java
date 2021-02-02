package lecture13;

public class MemoryCell {

	// Private internal data representation
	private Object storedValue;
	
	// Public methods
	public Object read() {
		return storedValue;
	}
	
	public void write(Object x) {
		storedValue = x;  // x is stored
	}
}
