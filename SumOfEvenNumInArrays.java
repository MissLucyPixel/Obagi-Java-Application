public class SumOfEvenNumInArrays{
	public static void main(String[] args){
		int[] num = {1,2,3,4,5,6,7,8,9,1};
	    int sumOf4_6 = 0;
		int sumOf5_9 = 0;
		
		for(int i = 1; i < 10; i++){
			if(i >= 4 && 1 <= 6){
				sumOf4_6 += num[i];
			}
			if(i >= 5 && i <= 9){
				sumOf5_9 += num[i];
			}
		}
		int result = sumOf4_6 * sumOf5_9;
		if(result % 2 == 0){
			System.out.printf("The Even number is %d",result);
		} 
	}
}