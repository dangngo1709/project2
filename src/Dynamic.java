
public class Dynamic {
	public int Dynamic(int[] array) {
		int totalSum = 0;
		int currSum = 0;

		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			if (currSum < 0) {
				currSum = 0;

			}
			if (currSum > totalSum) {
				totalSum = currSum;

			}
			
		}
		return totalSum;
	}
	public static void main (String[] args) {
		Dynamic max = new Dynamic();
		int array[] = {3, -1, -1, 10, -3, -2, 4};
		int Sum = max.Dynamic(array);
		System.out.print(Sum);
}
}
