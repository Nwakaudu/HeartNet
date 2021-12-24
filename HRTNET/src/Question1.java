import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		
		System.out.print("Maximum number is "+String.valueOf(comparison(7,91)));
	}
	
	public static int comparison(int x,int y) {
		/*int max = 0;
		if(x>y) {
			max =x;
			} else {
				max = y;}*/
		
		return Math.max(x, y);
		//return max;
	}
	
	//without comparison operators
	public static int withoutcomparison(int x,int y) {
		int[] numbers = {x,y};
		Arrays.sort(numbers);
		return numbers[numbers.length-1];
	}

}
