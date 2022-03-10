package threading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Starting Thread 1");
//		Task taskRunner = new Task("Thread A");
//		Thread t1 = new Thread(taskRunner);
//		t1.start();
//		
//		
//		System.out.println("Hello Starting Thread 2");
//		
//		Task taskRunner2 = new Task("Thread B");
//		Thread t2 = new Thread(taskRunner2);
//		t2.start();
//		
		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		
		worker2.start();
	
	}

}

class Worker extends Thread{
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() +" got value " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task implements Runnable {
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<1000; i++) {
			Thread.currentThread().setName(this.name);
			System.out.println("number: "+ i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	}
}


//class Task extends Thread {
//	
//	public void run() {
//		for(int i=0; i<1000; i++) {
//			if (Thread.currentThread().getName().equals("Thread-1")) {
//				Thread.currentThread().setName("Thread B");
//				System.out.println("number: "+ i + " - " + Thread.currentThread().getName());
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			} else {
//				Thread.currentThread().setName("Thread A");
//				System.out.println("number: "+ i + " - " + Thread.currentThread().getName());
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//					
//		}
//	}
//}