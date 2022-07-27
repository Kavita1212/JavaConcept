package binarySearch;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int count = countRotation(arr);
		System.out.println(count);

	}

	public static int countRotation(int[] a) {
		int pivot = findPivot(a);
		System.out.println("Pivot==" + pivot);
		return pivot + 1;

	}

	public static int findPivot(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && a[mid] > a[mid + 1]) {
				return mid;
			}
			if (mid < start && a[mid] < a[mid - 1]) {
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

	public static int findPivotWithDuplicate(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && a[mid] > a[mid + 1]) {
				return mid;
			}
			if (mid < start && a[mid] < a[mid - 1]) {
				return mid - 1;
			}
			if (a[mid] == a[start] && a[mid] == a[end]) {
				if (start < end && a[start] > a[start + 1]) {
					return start;
				}
				start++;
				if (end < start && a[end] < a[end - 1]) {
					return end - 1;
				}
				end--;
			} else if (a[start] < a[mid] || (a[start] == a[mid] && a[mid] > a[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}