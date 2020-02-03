package study;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "dfdfdfdfdf";
		System.out.println(length_s(a));
		printChars(a);
		System.out.println();
		printCharReverse(a);
		//printInBinary(8);
		System.out.println();
		int []az = new int[] {1,2,3,4,5,6};
		System.out.println(sum(6,az));
		
	}
	
	//문자열 갯수 
	public static int length_s(String str){
		if(str.equals(""))
			return 0;
		else
			return 1+length_s(str.substring(1));
	}
	
	//문자열 하나하나 입력받기
	public static void printChars(String str){
		if(str.length() ==0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	
	//문자열 뒤집어 프린트받기
	public static void printCharReverse(String str) {
		if(str.length() == 0)
			return;
		else{
			printCharReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
	//2진수로 변환하여 출력
	public void printInBinary(int n){
		if(n<2)
			System.out.println(n);
		else{
			printInBinary(n/2);
			System.out.println(n%2);
		}
	}
	
	//배열의 합 구하기
	public static int sum(int n, int [] data){
		if(n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
	
	//데이터 파일로 부터 n개의 정수 읽어오기
	public void readFrom(int n, int[] data, Scanner in){
		if(n==0)
			return;
		else{
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
	
	

}
