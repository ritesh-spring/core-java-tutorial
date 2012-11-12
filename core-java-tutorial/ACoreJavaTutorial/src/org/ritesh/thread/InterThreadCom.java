package org.ritesh.thread;

class Customer {
	int amount = 0;
	int flag = 0;

	public synchronized int withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()
				+ "  is goint to withdraw");
		if (flag == 0) {
			try {
				System.out.println("Waiting....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount -= amount;
			System.out.println("Withdraw Completed...");
			 return amount;
		}
		else {
	return amount; }

	}

	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()
				+ "  is going to Deposit..");
		this.amount += amount;
		notifyAll();
		System.out.println("Deposit Completed..");
		flag = 1;
	
	}
}

public class InterThreadCom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer customer = new Customer();
		Thread t1 = new Thread() {
			public void run() {
				customer.withdraw(5000);
				System.out.println("After withdraw amount is : "
						+ customer.amount);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				customer.deposit(9000);
				System.out.println("After Deposit amount is : "
						+ customer.amount);
			}
		};
		t1.start();
		t2.start();
	}

}
