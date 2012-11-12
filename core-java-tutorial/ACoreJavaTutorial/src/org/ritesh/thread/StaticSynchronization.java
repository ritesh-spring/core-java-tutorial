package org.ritesh.thread;

class Table2 {
	static void printTable2(int n) {
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

class Mt1 extends Thread {
	public void run() {
		Table2.printTable2(2);
	}
}

class Mt2 extends Thread {
	public void run() {
		Table2.printTable2(9);
	}
}

class Mt3 extends Thread {
	public void run() {
		Table2.printTable2(11);
	}
}

class Mt4 extends Thread {
	public void run() {
		Table2.printTable2(14);

	}
}

public class StaticSynchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt1 mt1 = new Mt1();
		Mt2 mt2 = new Mt2();
		Mt3 mt3 = new Mt3();
		Mt4 mt4 = new Mt4();
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}

}
