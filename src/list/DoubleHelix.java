/**
 * 
 */
package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sundaramtiwari
 *
 */
public class DoubleHelix {

	public static void main(String[] args) {
		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();
		List<Integer> maxList = new ArrayList<Integer>();
		populateList(firstList, secondList);

		boolean flag = true;

		if (firstList.get(0) > secondList.get(0)) {
			int i=0;
			while (flag) {
				maxList.add(firstList.get(i++));
			}
		}
		for (int i=0; i < (firstList.size() < secondList.size() ? firstList.size() : secondList.size()); i++) {
			if (flag && firstList.get(i) > secondList.get(i)) {
				maxList.add(firstList.get(i));
				flag = false;
			} else {
				maxList.add(secondList.get(i));
				flag = false;
			}
		}
	}

	private static void populateList(List<Integer> firstList, List<Integer> secondList) {
		firstList.add(3);
		firstList.add(5);
		firstList.add(7);
		firstList.add(9);
		firstList.add(20);
		firstList.add(25);
		firstList.add(30);
		firstList.add(40);
		firstList.add(55);
		firstList.add(56);
		firstList.add(57);
		firstList.add(60);
		firstList.add(62);

		secondList.add(1);
		secondList.add(4);
		secondList.add(7);
		secondList.add(11);
		secondList.add(14);
		secondList.add(25);
		secondList.add(44);
		secondList.add(47);
		secondList.add(55);
		secondList.add(57);
		secondList.add(100);		
	}

}
