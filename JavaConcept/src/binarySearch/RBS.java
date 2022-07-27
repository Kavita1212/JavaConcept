package binarySearch;

public class RBS {

	public static void main(String[] args) {
		// int[] a = { 4, 5, 6, 7, 0, 1, 2 };
		int[] a = { 1 };
		int target = 0;
		// findPivot(a);
		int ans = search(a, target);
		System.out.println(ans);

	}

	public static int search(int[] a, int target) {
		int pivot = findPivot(a);
		System.out.println("Pivot==" + pivot);
		if (pivot == -1) {
			return binarySearch(a, target, 0, a.length - 1);// array is not rotated
		}
		if (a[pivot] == target) {
			return pivot;
		}
		if (target < a[pivot]) {
			return binarySearch(a, target, pivot + 1, a.length - 1);
		} else {
			return binarySearch(a, target, 0, pivot - 1);
		}

	}

	public static int findPivot(int[] a) {
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && a[mid] > a[mid + 1]) {
				return mid;
			}
			if (mid > start && a[mid] < a[mid - 1]) {
				return mid - 1;
			}
			if (a[mid] <= start) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static int binarySearch(int[] a, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > a[mid]) {
				start = mid + 1;
			} else if (target < a[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
