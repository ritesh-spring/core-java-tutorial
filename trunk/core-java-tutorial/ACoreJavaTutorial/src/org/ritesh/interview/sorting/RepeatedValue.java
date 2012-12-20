package org.ritesh.interview.sorting;

import java.util.ArrayList;
import java.util.List;

public class RepeatedValue {

	/**
	 * @param args
	 */
	public int findDuplicate(List<Integer> numbers) {
		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
//		int duplicate = total - (hieghestNo * (hieghestNo + 1) / 2);
		int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			list.add(i);
		}
		list.add(5);
		/*list.add(10);
		list.add(5);
		list.add(10);*/
		RepeatedValue value = new RepeatedValue();
		System.out.println(value.findDuplicate(list));
	}

}
