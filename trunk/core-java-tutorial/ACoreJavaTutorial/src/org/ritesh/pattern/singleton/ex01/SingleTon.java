package org.ritesh.pattern.singleton.ex01;

public class SingleTon {
	private static SingleTon instance;

	private SingleTon() {

		// TODO Auto-generated constructor stub
		System.out.println("SingleTon() : Initializing Instance...");
	}

	// Early instantiation using implementation with static field.

	
	/*  private static SingleTon instance = new SingleTon();
	  
	  public static SingleTon getInstance() { return instance; }
	 */
	
	
	
	// Lazy instantiation using double locking mechanism
	
	
	public static SingleTon getInstance() {
		if (instance == null) {
			synchronized (SingleTon.class) {
				if (instance == null) {
					System.out
							.println("First time getInstance() was Invoked...");
					instance = new SingleTon();
				}
			}
		}
		return instance;

	}
	
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
//		return SingleTon.getInstance();
		
	}
	public void doSomething() {
		System.out.println("doSomething(): Singleton does SomeThing...");
	}
	public void doSomething2()
	{
		System.out.println(" I am in doSomething2()");
	}
}
