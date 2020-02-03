package J_exam;

public class Exam04 {
//4-9 4-12 4-13 제외
	public static void main(String[] args) {
		
		/*[4-1] 다음의 문장들을 조건식으로 표현하라.
		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 
			x>10 && x<20    					
		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
			ch!=' ' && ch!='\t'          		 				
		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
			ch=='x'|| ch=='X'
		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
			ch >= '0' && ch<='9'
		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
			ch >= 'a' && ch<='z' || ch >= 'A' && ch<='Z'
		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
		않을 때 true인 조건식
			(year%400==0 || year%4==0) && year%100 !=0
		7. boolean형 변수 powerOn가 false일 때 true인 조건식
			powerOn==false
		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
			str.equals("yes")
		*/
		
		
		
		/*[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		 
		int sum = 0;
		for(int i=1; i<=21; i++){
			if(i%2!=0 && i%3!=0){
				sum=i+sum;
			}
		}
		System.out.println(sum);
		*/
		
		/*[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		int sum = 0;
		int ssum = 0;
		for(int j=1; j<=10; j++){
			for(int i=1; i<=j; i++){
				sum += i;
			}
		}
		System.out.println(sum);
		*/	
		
		/*[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		100이상이 되는지 구하시오.
		
		int sum = 0;
		int i = 1;
		int j = 1;
		
		while(sum<100){
			System.out.println(i);
			
			if(i>0){
				j = -1*(i+1);
			}
			else{
				j= -1*(i-1);
			}
			i=j;
			sum+=i;
		}
		
		System.out.println(sum);
		*/
		
		/*[4-5] 다음의 for문을 while문으로 변경하시오.
		[연습문제]/ch4/Exercise4_5.java
		
		public class Exercise4_5 {
		public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
		for(int j=0; j<=i; j++)
		System.out.print("*");
		System.out.println();
		}
		} // end of main
		} // end of class
		
	    
		
		int i=0;
		int j=0;
		
		while(i<=10){
			j=0;
			while(j<=i){
				System.out.print("*");
				j++;
			}	
			System.out.println();
			i++;
		}*/
		
		
		/*
		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
		로그램을 작성하시오.
		
		
		 for(int i=1; i<=6; i++){
			 for(int j=1; j<=6; j++){		 
				 if(i+j==6){
					 System.out.print("("+i+","+j+")");
				 }
			 }
			 System.out.println();
		 }
		 */
		
		/*[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
		코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
		
		[연습문제]/ch4/Exercise4_7.java
		class Exercise4_7 {
		public static void main(String[] args) {
		int value = ((int)(Math.random()*6)+1);
		System.out.println("value:"+value);
		}
		}*/
		
		/*[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
				0<=x<=10, 0<=y<=10 이다.
		[실행결과]
		x=1, y=2
		x=3, y=1
		x=5, y=0
		
		
		for(int x=0; x<=10; x++){
			for(int y=0; y<=10; y++){
				if(2*x+4*y==10){
					System.out.println("("+x+","+y+")");
				}
			}
		}
		*/
		
		/*
		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
		완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
		에 알맞은 코드를 넣으시오.
		
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		[연습문제]/ch4/Exercise4_10.java
		class Exercise4_10 {
		public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		
		int nmg=0;
		
		while(num!=0){
			nmg = num % 10;
			num = (int)num/10;			
			sum += nmg;
						
		}
		
	
		System.out.println("sum="+sum);
		}
		}
		
		[실행결과]
				15
*/		

		
		
/*		[4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
		는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
		1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
		시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
		
		[연습문제]/ch4/Exercise4_11.java
		public class Exercise4_11 {
		public static void main(String[] args) {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		for (int i = 0 ; i < 8 ; i++ ) {
			num3=num2+num1;
			num1=num2;
			num2=num3;
			System.out.print(","+ num3);
		}
		} // end of main
		} // end of class
		
		[실행결과]
				1,1,2,3,5,8,13,21,34,55
		
		*/
		
/*		[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
		해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
		신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
		게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
		로그램을 완성하시오.
		
		[연습문제]/ch4/Exercise4_14.java
		class Exercise4_14
		{
		public static void main(String[] args)
		{
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
		count++;
		System.out.print("1과 100사이의 값을 입력하세요 :");
		input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.


		if(input>answer){
			System.out.println("더작은수입니다.");
		}
		else if(answer>input){
			System.out.println("더 큰수 입니다");
		}
		else{
			System.out.println("정답입니다");
			System.out.println("시도횟수는 "+count+"입니다");
			break;
		}
		
		
		} while(true); // 무한반복문
		} // end of main
		} // end of class HighLow
*/	
		
		/*[4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
		어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
		다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[Hint] 나머지 연산자를 이용하시오.
		
		[연습문제]/ch4/Exercise4_15.java
		class Exercise4_15
		{
		public static void main(String[] args)
		{
		int number = 12321;
		int tmp = number;
		int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {
			result = result * 10 + (tmp % 10); //0+1//1*10+2//12*10+3
			tmp= tmp/10;//1//2//3//2//1
		}
		if(number == result)
		System.out.println( number + "는 회문수 입니다.");
		else
		System.out.println( number + "는 회문수가 아닙니다.");
		} // main
		}
		*/
		
	
	}

}
