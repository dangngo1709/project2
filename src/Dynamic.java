
public class Dynamic {
	public int Dynamic(int[] array) {
		int totalSum = 0;
		int currSum = 0;
		int depart = 0;
		int arrive = 0;
		int tempDepart = 0;
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			if (currSum > totalSum) {
				totalSum = currSum;
				depart = tempDepart;
				arrive = i;
			}

			if (currSum < 0) {
				currSum = 0;
				tempDepart = i+1;

			}

		}
		System.out.println(depart);
		System.out.println(arrive);
		return totalSum;
	}

	public static void main(String[] args) {
		Dynamic max = new Dynamic();
		int array[] = { 2 - 2, -3, 4, -1, -2, 1, 5, -3, 7, 2,-6,10, -2 };
		int Sum = max.Dynamic(array);
		System.out.print(Sum);
	}
}

public class Dynamic {
	public int Dynamic(int[] array) {
		int totalSum = 0;
		int currSum = 0;
		int depart = 0;
		int arrive = 0;
		int tempDepart = 0;
		for (int i = 0; i < array.length; i++) {
			currSum = currSum + array[i];
			if (currSum > totalSum) {
				totalSum = currSum;
				depart = tempDepart;
				arrive = i;
			}

			if (currSum < 0) {
				currSum = 0;
				tempDepart = i+1;

			}

		}
		System.out.println(depart);
		System.out.println(arrive);
		return totalSum;
	}

	public static void main(String[] args) {
		Dynamic max = new Dynamic();
		int array[] = { 2 - 2, -3, 4, -1, -2, 1, 5, -3, 7, 2,-6,10, -2 };
		int Sum = max.Dynamic(array);
		System.out.print(Sum);
	}
}
