package org.ritesh;

interface I1 {
	public int add(int i);
}

interface I2 {
	public int add(int k, int j);
}

public class InterfaceTest implements I1, I2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int add(int i) {
		// TODO Auto-generated method stub
		return i;
	}

}
