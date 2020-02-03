package study;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = facto(3);
		System.out.println(result);
	}
	
	public static int facto(int n){
		if(n==0)
		return 1;
		
		else
		return n*facto(n-1);	
		
	}

}
