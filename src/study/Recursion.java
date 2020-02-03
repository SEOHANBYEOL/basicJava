package study;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		func(4);

	}
	
	public static void func(int n){
		if(n<=0)
		{
			return;
		}
		else
		{
			System.out.println("^^");
			func(n-1);
		}
	}

}
