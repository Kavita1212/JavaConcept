package leetcode;

//leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class VariableOperation {

	/*
	 * Input: operations = ["--X","X++","X++"] Output: 1
	 */
	public static void main(String[] args) {

		String[] op = { "--X", "X++", "X++" };
		int ans=finalValueAfterOperations(op);
		System.out.println(ans);
	}

	public static int finalValueAfterOperations(String[] operations) {
		int x = 0;
		for (int i = 0; i < operations.length; i++) {
			if (operations[i] == "--X" || operations[i] == "X--") {
				x = x - 1;
			} else if (operations[i] == "++X" || operations[i] == "X++") {
				x = x + 1;
			} else {
				continue;
			}
		}
		return x;
	}

}
