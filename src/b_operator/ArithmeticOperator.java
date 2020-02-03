package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  << 산술 연산자 >>
		 *  - + : 더하기
		 *  - - : 빼기
		 *  - * : 곱하기
		 *  - / : 나누기
		 *  - % : 나머지
		 *  - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		
		int a = 10 +20 - 10 * 5 / 10 % 2;
		//*,/,%연산자가+,- 보다 연산의 우선순위가 높다.
		//우선선위가 동일한 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 행변환 후 연산이 수행된다.
		//따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20;
		
		a=c-b;
		System.out.println(a);
		//4byte보다 작은 정수 타입은 4byte(int)로 형변환 후 연산이 수행된다.
		
		long el = 1000000 * 1000000;
		System.out.println(el);//오버플로우발생
		long e2 = 1000000 * 1000000L ;//피연산자 중 하나는 long이어야 결과로 long을 얻는다.
		System.out.println(e2);
		
		double f1 = 10 / 4;
		System.out.println(f1);
		double f2 = 10 / 4.0;
		System.out.println(f2);
		int f3 = 10 % 4;//10을 4로 나눈 나머지
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
		//int g1 = 10/0; //런타임 에러 발생 (실행시 나타나는 에러)
		float g2 = 10.0f /0;
		System.out.println(g2); //infinity : 무한대
		float g3 = 0 /0f;
		System.out.println(g3); //NaN : Not a Number
		
		int h1 = 'A' + 1;
		System.out.println(h1);
		
		int h2 = 'D' - 'A';
		System.out.println(h2);
		
		int h3 = '5' - '0';
		System.out.println(h3);
		
		//산술 연산자와 대입 연산자를 합쳐 연산식을 줄여서 표현할 수 있다.
		int i = 0;
		i += 1; //복합 연산자 
		
		i -= 1;
		i *= 1;
		i /= 1;
		i %= 1;
		
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		--i;
		i--;
		
		i = 0;
		System.out.println("++i ="+ ++i);
		i = 0;
		System.out.println("i++ ="+ i++);
		System.out.println(i);
		
		//반올림을 하기위해 0.5를 더하고 없애기 위해 int로 형변환 한다.
		double round = 50.6;
		System.out.println((int)(round+0.5));
		System.out.println(Math.round(round)); //소수점 첫번째 자리에서 반올림

		double around = 50.56;
		System.out.println((int)(around*10 +0.5)/ 10.0); //소수점 둘째 자리에서 반올림
		System.out.println(Math.round(around*10+0.5)/10.0); //소수점 둘째 자리에서 반올림
		
		//다음을 한줄씩 계사해서 최종 결과를 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값  * 123456
		//3. 2번의 결과값  / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값  % 123456
		
		
		long a1 = 123456 + 654321;
		long a2 = a1 * 123456;
		long a3 = a2 / 123456;
		long a4 = a3 - 654321;
		long a5 = a4 % 123456;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//평균은 소수점 둘째자리에서 반올림해주세요.
		
		int a6 = 1;
		int a7 = 2;
		int a8 = 5;
		
		int sum = a6+a7+a8;
		
		double result= (a6+a7+a8)/3.0;
		
		System.out.println(sum);
		System.out.println(result);
		System.out.println(Math.round(result*10+0.5)/10.0);
		
		
	}

}
