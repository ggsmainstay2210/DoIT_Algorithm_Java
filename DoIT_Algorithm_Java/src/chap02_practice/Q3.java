// 배열 a의 모든 요소의 합계를 구하여 반환하는 메소드를 작성하세요.

package chap02_practice;

import java.util.Random;

class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] oa = new int[100];
		
		for (int i = 0; i < 100; i++) {
			oa[i] = i + 1;
		}
		
		System.out.println("합계는 " + sumOf(oa) + "입니다.");
	}
}