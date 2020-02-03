package study;

public class EuclidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(30,4));
		}
	
	public static double gcd(int m, int n){
		if(m<n){
			int tmp=m; m=n; n=tmp;
		}
		
		if(m%n==0)
			return n;
		else
			return gcd(n,m%n);
	}
	
	}


