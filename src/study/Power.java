package study;

public class Power {
//n승
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = po(2,3);
		System.out.println(result);
	}
	
	public static double po(double x, int n){
		if(n==0)
			return 1;
		
		else
			return x*po(x, n-1);
	}

}
