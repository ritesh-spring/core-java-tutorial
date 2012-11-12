package org.ritesh.thread;

public class ThreadEx001 extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx001 threadEx001 = new ThreadEx001();
		ThreadEx001 threadEx0012 = new ThreadEx001();
		ThreadEx001 threadEx0013 = new ThreadEx001();
		threadEx001.start();
		threadEx0012.start();
		threadEx0013.start();
		
/*try {
	threadEx0012.start();
} catch (IllegalThreadStateException e) {
	// TODO: handle exception
	System.out.println(e);
//	e.printStackTrace();
}*/

System.out.println("Naomal Flow....");
	}

}
