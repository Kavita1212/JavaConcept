package binarySearch;

public class OrderAgonisticBinarySearch {

	public static void main(String[] args) {
		// int[] a = { 3, 4, 5, 7, 8 };
		int[] a = { 5, 3, 2, 1 };
		int target = 2;
		int ans = binarySearch(a, target);
		System.out.println(ans);

	}

	public static int binarySearch(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;
		boolean isAsc = a[start] < a[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == a[mid]) {
				return mid;
			}
			if (isAsc) {
				if (target > a[mid]) {
					start = mid + 1;
				} else if (target < a[mid]) {
					end = mid - 1;
				}
			} else {
				if (target < a[mid]) {
					start = mid + 1;
				} else if (target > a[mid]) {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

}
