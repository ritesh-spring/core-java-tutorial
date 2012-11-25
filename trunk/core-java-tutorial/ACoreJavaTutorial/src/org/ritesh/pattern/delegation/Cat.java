package org.ritesh.pattern.delegation;

public class Cat {
	private IsSoundBehaviour sound = new MeowSound();

	public void makeSound() {
		this.sound.makeSound();
	}
	public void setSoundBehaviour(IsSoundBehaviour newSound)
	{
		this.sound=newSound;
	}
}
