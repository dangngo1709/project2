public class SubArray {
	static int maxSubArray(  int array[], int L,int M, int R) {
		int Sum = 0;
		int leftSum  = 0;

	for (int i = M; i >= L; i--) {
		Sum = Sum + array[i];
		if (leftSum < Sum)
			leftSum = Sum;
	}
	Sum = 0;
	int rightSum = 0 ;
	for ( int j = M+1; j <= R; j++ ) {
		Sum += array [j];
		if(rightSum < Sum)
			rightSum = Sum;	
	}
	

		return leftSum + rightSum;
	
		
	}
	static int maxSum(int array[], int L, int R) {
		if(L == R) {
			 return array[L];
		}
		int M = (L +R)/2;
		int maxLeft = maxSum(array,L,M);
		int maxRight = maxSum(array,M +1, R);
		int finalmaxSum = maxSubArray(array,L,M,R);
	
		if (maxLeft> maxRight && maxLeft > finalmaxSum)
			return maxLeft;
		if (maxRight> maxLeft && maxRight > finalmaxSum)
			return maxRight;
		else return finalmaxSum;
		
		}
		 
	public static void main(String[] args) {
	    int array[] = {3, -1, -1, 10, -3, -2, 4};
	    System.out.println(maxSum(array, 0, 6));
	  }
	}	
	

