package mergeSort;

import java.util.ArrayList;

public class MergeSort {

	public <E extends Comparable<E>> void merge(ArrayList<E> data, ArrayList<E> left, ArrayList<E> right, int start, int end) {

		int i = 0, j = 0;
		while (i < start && j < end) {
			if (left.get(i) != null && right.get(j) != null && left.get(i).compareTo(right.get(j)) <= 0) {
				data.add(left.get(i++));
			} else {
				data.add(right.get(j++));
			}
		}
		while (i < start) {
			data.add(left.get(i++));
		}
		while (j < end) {
			data.add(right.get(j++));
		}
	}
	
}
