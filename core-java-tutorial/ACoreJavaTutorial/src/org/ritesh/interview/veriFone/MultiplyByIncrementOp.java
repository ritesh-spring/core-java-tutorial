package org.ritesh.interview.veriFone;

public class MultiplyByIncrementOp {

	/**
	 * @param args
	 */
	int i;
	public int multiply(int a, int b) {
		
		for (int i = 1; i < b; i++) {
			for (int j = 1; j <= a; j++) {
				i=a++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3, j = 2;
MultiplyByIncrementOp op = new MultiplyByIncrementOp();
//		int k = MultiplyByIncrementOp.multiply(13, 2);
		System.out.println(op.multiply(i, j));
	}

}
