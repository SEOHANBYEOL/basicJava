package study;

public class Recursion_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[] {1,2,3,5};
		String[] da = new String[] {"0","2","3","5","7"};
		int n = search(data, 0, 4, 3);
		System.out.println(n);
		
		int y = findMax(data, 0,2);
		System.out.println(y);
		
		int x = binarySearch(da, "7", 0, 4);
		System.out.println(x);
	}

	public static int search(int[] data, int n, int target){
		for(int i=0; i<n; i++)
			if(data[i]==target)
				return i;
		return -1;
	}
	
	//암시적 매개변수를 명시적 매개변수로 바꾸어라.
	//시작 위치와 끝 위치를 매개변수로 받아서 처음부터 끝까지 비교 
	/*public static int search(int [] data, int begin, int end, int target){
		if(begin>end)
			return -1;
		else if(target == data[begin])
			return begin;
		else
			return search(data, begin+1, end, target);
	}
	*/
	public static int search(int[] data, int begin, int end, int target){
		if(begin>end){
			return -1;
		}
		else{
			int middle =(begin+end)/2;
			if(data[middle]==target)
				return middle;
			int index = search(data,begin,middle-1, target);
			if(index != -1)
				return index;
			else
				return search(data, middle+1, end, target);
			}
		}
	
/*	public static int findMax(int[] data,int begin, int end){
		if(begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data,begin+1, end));
	}
	*/
	public static int findMax(int[] data, int begin, int end){
		if(begin==end)
			return data[begin];
		else
		{
			int middle = (begin+end)/2;
			int max1 = findMax(data, begin, middle);
			int max2 = findMax(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
	
	//이진검색 알고리즘
	//사전 찾는것과 비슷함
	public static int binarySearch(String[] items, String target, int begin, int end){
		if(begin>end)
			return -1;
		else {
			int middle = (begin+end)/2;
			int comResult = target.compareTo(items[middle]);
			if(comResult == 0)
				return middle;
			else if(comResult < 0)
				return binarySearch(items, target, begin, middle-1);
			else
				return binarySearch(items, target, middle+1, end);
			}
	}
	
	}
	
	

