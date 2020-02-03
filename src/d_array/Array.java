package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * << 배열 >> 
		 * - int[] number = new int[5];
		 * - int[] number = new int[]{10,20,30,40,50};
		 * - int[] number = {10,20,30,40,50};
		 */
		
		//배열은 참조형 타입입니다.(->값이저장될주소가들어감)
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array); //주소
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약20억)이다.
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1,2,3}; //선언과 초기화를 동시에 해야한다.
		/*
		   int[] iArray3;
		   iArray3 = {1,2,3};//컴파일 에러 발생
        */
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 60; //ArrayIndexOutOfBoundsException발생
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] arr1 = new int[10];
	
		//모든 인덱스에 있는 값을 변경해주세요.
		for(int i=0; i<10; i++){  
			arr1[i] = i;
		}
		System.out.println(Arrays.toString(arr1));

		//모든 인덱스에 있는 값을 더해주세요. (배열이름.length -> 배열의 길이)
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++){
			sum += arr1[i];
		}
		System.out.println(sum);
		
		//index는 1씩 증가하는 규칙이있어 for문과 사용하기 좋다.
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i=0; i<array.length; i++){
			array[i] = i+1;
		}
		System.out.println(Arrays.toString(array));
		
		//배열에 숫자를 저장하고 합계와 평균을 구해봅시다.
		int [] numbers= new int[10];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(numbers));
	   
		sum=0; //합계
		double avg = 0; //평균
		
		for(int i=0; i<numbers.length; i++){
			sum += numbers[i];
		}
		
		avg = (double)sum/numbers.length;
		System.out.println("sum:"+sum+" avg:"+avg);
		
		//향상된 for문
		for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		
		//배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요.
		
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i=1; i<numbers.length; i++){
			if(min>numbers[i]){
				min = numbers[i];
			}
			if(max<numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("min : "+ min);
		System.out.println("max : "+ max);
		
		//배열을 섞어주세요.
		int[] shuffle = new int[30];
		for(int i=0; i<shuffle.length; i++){
			shuffle[i] = i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		int tmp = 0;
		int num = 0;
		
		for(int i=0; i<100; i++){
			num = (int)(Math.random()*shuffle.length);
			tmp = shuffle[0];
			shuffle[0] = shuffle[num];
			shuffle[num] = tmp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
/*		
		int[] random = new int[500];
		int[] ran = new int[11];
		
		for(int i=0; i<500; i++){
		  random[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(random));
		
	
		for(int i=1; i<11; i++){
			int count = 0;
			for( int j=0; j<500; j++){
				if(i==random[j]){	
					count++;
				}
				ran[i]=count;
			}
		}
		
		System.out.println(Arrays.toString(ran));
		
		for(int i=1; i<11; i++){
			System.out.println(i +":"+ran[i]);
		}
		*/
		//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
				Scanner s = new Scanner(System.in);
				System.out.println("최솟값:");
				int rmin= Integer.parseInt(s.next());
				
				System.out.println("최댓값:");
				int rmax= Integer.parseInt(s.next());
		
				System.out.println("반복횟수:");
				int rturn= Integer.parseInt(s.next());
		
				int[] random = new int[rturn];
				int[] ran = new int[rmax+1];
				
				for(int i=0; i<rturn; i++){
				  random[i] = (int)(Math.random()*rmax)+1;
				  while(random[i]<rmin){
					  random[i] = (int)(Math.random()*rmax)+1;
				  }
				}
				
				System.out.println("배열 : " + Arrays.toString(random));
				
			
				for(int i=1; i<rmax+1; i++){
					int count = 0;
					for( int j=0; j<rturn; j++){
						if(i==random[j]){	
							count++;
						}
						ran[i]=count;
					}
				}
			
				
				for(int i=1; i<rmax+1; i++){
					System.out.println(i +":"+ran[i]);
				}
		

		

	}

}
