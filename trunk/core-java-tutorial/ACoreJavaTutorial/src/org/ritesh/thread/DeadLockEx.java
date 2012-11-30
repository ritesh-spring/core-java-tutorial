package org.ritesh.thread;

public class DeadLockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String rc1="Ritesh";
	    final String rc2="Amit";
	    
	    Thread t1=new Thread(){
	    	public void run()
	    	{
	    		synchronized (rc1) {
				System.out.println("Thread 1 : Locked resource : 1..."+rc1);	
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (rc2) {
					System.out.println("Thread 1 : locked resource : 2"+rc2);	
					}
				}
	    		
	    	}
	    	
	    };
	    
	    Thread t2 = new Thread(){
	    	public void run()
	    	{
	    		synchronized (rc2) {
				System.out.println("Thread 2 : locked resouce : 2..."+rc2);
				synchronized (rc1) {
					System.out.println("Thread 2: Locked resource 1"+rc1);	
					}
				}
	    		
	    	}
	    };
	    t1.start();
	    t2.start();
	}

}
