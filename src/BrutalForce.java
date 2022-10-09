
public class BrutalForce {

	
public int BrutalForce( int[] array) {
		
	int totalSum = 0;
	int depart = -1;
	int arrive = -1;
	
		if (array == null || array.length == 0) {
			return totalSum;
		}
		for (int i = 0; i < array.length; i++) {

			int currSum = 0;
			for (int j = i ; j < array.length; j++) {
				currSum = currSum + array[j];
				if (currSum > totalSum) {
					totalSum = currSum;
					depart = i;
					arrive = j;
					
				}

			}

		}
		System.out.println(depart);
		System.out.println(arrive);

		return totalSum;
	}

public static void main (String[] args) {
BrutalForce max = new BrutalForce();
int array[] = {2 - 2, -3, 4, -1, -2, 1, 5, -3, 7, 2,-6,10, -2};
int Sum = max.BrutalForce(array);
System.out.print(Sum);
}
}
