package org.ritesh.thread;

class Table {
	synchronized void printTable(int n) {
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e);
			}
		}
	}

}

class MyTh1 extends Thread {
	Table t;

	public MyTh1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {

		t.printTable(5);
	}

}

class MyTh2 extends Thread {
	Table t;

	public MyTh2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	public void run() {

		t.printTable(11);
	}

}

public class SynchroEx001 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		MyTh1 myTh1 = new MyTh1(table);
		MyTh2 myTh2 = new MyTh2(table);
		myTh1.start();
		myTh2.start();
	}

}
