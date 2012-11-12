package org.ritesh.thread;

public class InteruptingThreadEx01 extends Thread {

	public void run()
	{
		try {
			Thread.sleep(500);
			System.out.println("Task.....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException("Thread Interrupted...."+e);
			System.out.println("Exception Handeled..."+e);
		}
		System.out.println("Thread is Running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteruptingThreadEx01 ex01 = new InteruptingThreadEx01();
		ex01.start();
		
		try {
			ex01.interrupt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Exception Handeled...."+e);
		}
	}

}
