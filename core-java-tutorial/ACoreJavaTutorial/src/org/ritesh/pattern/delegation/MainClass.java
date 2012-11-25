package org.ritesh.pattern.delegation;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat cat = new Cat();
//Delegation
cat.makeSound(); // Meowwww
IsSoundBehaviour newSound=new RoarSound();
cat.setSoundBehaviour(newSound);
//Delegation
cat.makeSound(); //Output Roarrr
	}

}
