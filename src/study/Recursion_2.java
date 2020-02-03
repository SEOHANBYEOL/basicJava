package study;

public class Recursion_2 {
	//0에서 n까지의 합을 구하는 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = func(4);
		System.out.println(result);
	}
	
	public static int func(int k){
		if(k<=0){
			return 0;
		}
		else{
			return k+func(k-1);
		}
	}

}
