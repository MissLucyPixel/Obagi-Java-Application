public class MultiDimentionArray{
	public static void main(String[] args){
		int[][] numbers = {
			{5,6,8,3,2},
			{9,3,2,7,8},
			{1,6,4,5,3}
		};
		int sum = 0;
		int even = 0;
		int odd = 0;
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 5; col++){
				sum += numbers[row][col];
				if(numbers[row][col] % 2 == 0){
					even++;
				}
				else{
					
				}
			}
		}
		System.out.printf("The sum of all the elements in the array is %d%n",sum);
		System.out.printf("The number of even in the array is %d%n",even);
		System.out.printf("The number of odd in the array is %d%n",odd);
	}
}