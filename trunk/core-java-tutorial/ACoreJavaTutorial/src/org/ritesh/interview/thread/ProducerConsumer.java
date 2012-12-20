package org.ritesh.interview.thread;

class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		if (!valueSet) //{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Interrupted Exception Caught...");
			}
			System.out.println("Got n: " + n);
			valueSet = false;
			notify();
		//}// End of IF
		return n;
	}

	synchronized public void put(int n) {
		if (valueSet) //{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("Interrupted Exception Caught..");
			}
			this.n = n;
			valueSet = true;
			System.out.println("Put n: " + n);
			notify();
		//}// End of If
	} // End of Put
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		super();
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (i<= 11) {
			q.put(i++);
		}
	}

}

class Consumer implements Runnable {
	Q q;

	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			q.get();
		}
	}

}

public class ProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q q=new Q();
new Producer(q);
new Consumer(q);
System.out.println("Press Ctrl+c to Stop...");
	}

}
