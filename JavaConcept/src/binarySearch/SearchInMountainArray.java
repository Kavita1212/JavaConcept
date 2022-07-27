package binarySearch;

public class SearchInMountainArray {

	public static void main(String[] args) {
		 int[] a = { 1, 2, 3, 4, 5, 3, 1 };
		//int[] a = { 0, 1, 2, 4, 2, 1 };
		int target = 3;
		int ans = search(a, target);
		System.out.println(ans);
	}

	public static int search(int[] a, int target) {
		int peak = findpeak(a);
		System.out.println("peak==" + peak);
		int firstTry = OrderAgonisticBinarySearch(a, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		return OrderAgonisticBinarySearch(a, target, peak + 1, a.length - 1);
	}

	public static int findpeak(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (a[mid] > a[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}

	public static int OrderAgonisticBinarySearch(int[] a, int target, int start, int end) {

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
