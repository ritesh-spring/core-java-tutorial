package org.ritesh.thread;

public class ThreadJoinEx001 extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoinEx001 joinEx001 = new ThreadJoinEx001();
		ThreadJoinEx001 joinEx0012 = new ThreadJoinEx001();
		ThreadJoinEx001 joinEx0013 = new ThreadJoinEx001();
		joinEx001.start();

		try {
			joinEx001.join(0);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		joinEx0012.start();
		joinEx0013.start();
		/*joinEx0013.setName("Ritesh");
		System.out.println(joinEx0013.getName());
		System.out.println(joinEx0013.getId());*/
	}

}
