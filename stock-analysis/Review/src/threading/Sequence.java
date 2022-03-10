package threading;

public class Sequence {

	private int value = 0;
	
	//not thread safe.
	
	public synchronized int getNext() {
//		synchronized (this) {
			value++;
			return value;
//		}	
	}
}
