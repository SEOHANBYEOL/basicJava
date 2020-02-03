package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요.
	
		
		
		
		int num1 = (int)(Math.random()*9)+1;	
		int num2 = (int)(Math.random()*9)+1;
		while(num1==num2){
			num2 = (int)(Math.random()*9)+1;
		}
		int num3 = (int)(Math.random()*9)+1;
		while(num2==num3 || num1==num3){
		    num3 = (int)(Math.random()*9)+1;
		}
		
				
		while(true){
			
			int strike = 0;
			int ball = 0;
			int out =0;
			
			
			System.out.println("숫자를 입력해주세요.(3자리)");
			Scanner s = new Scanner(System.in);
			int receive = Integer.parseInt(s.nextLine());
			
			if(receive>999 || receive<100){
				System.out.println("세자리수를 입력해야합니다");
			}
			else{

				//숫자 나누어 받기
				int rnum3 = receive%10;
				receive = receive/10;
				
				int rnum2 = receive%10;
				receive = receive/10;
				
				int rnum1 = receive%10;
				
				
				
				if(num1 == rnum1){
					strike++;
				}
				else if(num1 == rnum2){
					ball++;
				}
				else if(num1 == rnum3){
					ball++;
				}
				else{
					out++;
				}
				
				if(num2 == rnum2){
					strike++;
				}
				else if(num2 == rnum1){
					ball++;
				}
				else if(num2 == rnum3){
					ball++;
				}
				else{
					out++;
				}
				
				
				if(num3 == rnum3){
					strike++;
				}
				else if(num3 == rnum1){
					ball++;
				}
				else if(num3 == rnum2){
					ball++;
				}
				else{
					out++;
				}
				
				
				
				
				System.out.println("strike :"+strike+" ball: "+ball + " out: "+out);
			
				
				
				if(strike==3){
					System.out.println("정답입니다.");
					break;
				}

			}			
		}
			
	
		
		
		
	}

}
