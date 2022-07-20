package redoPractice19072022;

public class Print_No_Without_Using_Any_Loop {

	public static void main(String[] args) {
		printNo(1);
	}

	public static void printNo(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNo(num);
		}
	}
}