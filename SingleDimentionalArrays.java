public class SingleDimentionalArrays{
	public static void main(String[] args){
		int[] numbers = {5,7,3,9,2};
		
		String[] names = {"Ella","Femi","Great","Taylor","Precious"};
		
		System.out.println("The is the traditional for loop");
		
		for(int i = 0; i < 5; i++){
			System.out.printf("%s is %d years old %n",names[i],numbers[i]);
		}
		System.out.println("=================================================");
		for(String name : names){
			System.out.printf("%s%n",name);
		}
		System.out.println("=================================================");
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
	}
}