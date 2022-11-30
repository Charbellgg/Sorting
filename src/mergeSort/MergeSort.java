package mergeSort;


public class MergeSort {

	public <T extends Comparable<T>> void merge(T[] a, T[] l, T[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] != null && r[j] != null && l[i].compareTo(r[j]) <= 0) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
