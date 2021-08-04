package test01;

import java.util.Arrays;

public class Exam007 {
	
	public static void main(String[] args) {
		//배열 요소 5{171.147.150.193.157}을 작성
		//Java API(java.util.Arrays.sort)를 이요하여 정렬
		//배열 요소를 표시합니다.
		
		int[] num = {127,147,150,193,157};
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		
	}

}
