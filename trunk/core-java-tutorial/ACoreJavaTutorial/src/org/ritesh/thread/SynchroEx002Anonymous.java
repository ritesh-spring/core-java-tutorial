package org.ritesh.thread;

class Table1 {
	synchronized void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e);
			}
		}
	}
}

public class SynchroEx002Anonymous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table1 table1 = new Table1();
		ThEx1 th1 = new ThEx1() {
			public void run() {
				table1.printTable(5);
			}

		};
		ThEx2 th2 = new ThEx2() {
			public void run() {
				table1.printTable(11);
			}
		};
		th1.start();
		th2.start();

	}

}
