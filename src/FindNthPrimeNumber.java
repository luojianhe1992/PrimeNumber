import java.util.ArrayList;


public class FindNthPrimeNumber {
	public static void main(String[] args) {
		System.out.println(findNthPrimeNumber(6));
		
		System.out.println(findNPrimeNumber(10));
	}
	
	public static ArrayList<Integer> findNPrimeNumber(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=1;i<n;i++){
			result.add(findNthPrimeNumber(i));
		}
		return result;
	}
	
	public static int findNthPrimeNumber(int n){
		if(n == 1){
			return 1;
		}
		
		int count = 0;
		int pointer = 0;
		
		while( count < n){
			pointer++;
			if(isPrimeNumber(pointer)){
				count++;
			}
		}
		return pointer;
	}
	
	public static boolean isPrimeNumber(int num){
		for(int i = 2;i<num;i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
