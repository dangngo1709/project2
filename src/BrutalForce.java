
public class BrutalForce {
public int BrutalForce( int[] array) {
		int totalSum = 0;
		
	
		if (array == null || array.length == 0) {
			return totalSum;
		}
		for (int i = 0; i < array.length; i++) {

			int currSum = 0;
			for (int j = i ; j < array.length; j++) {
				currSum = currSum + array[j];
				if (currSum > totalSum) {
					totalSum = currSum;
					
				}

			}

		}

		return totalSum;
	}

public static void main (String[] args) {
BrutalForce max = new BrutalForce();
int array[] = {3, -1, -1, 10, -3, -2, 4};
int Sum = max.BrutalForce(array);
System.out.print(Sum);
}
}