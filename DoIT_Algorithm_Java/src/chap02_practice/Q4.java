// 배열 b의 모든 요소를 배열 a에 복사하는 메소드 copy를 작성하세요.

package chap02_practice;

import java.util.Random;

class Q4 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] oa = new int[10];
		int[] ob = new int[10];
		
		System.out.println("원본 배열입니다.");
		for (int i = 0; i < oa.length; i++) {
			oa[i] = rand.nextInt(100);
			System.out.println(oa[i]);
		}
		
		copy(oa, ob);
		
		System.out.println("복사된 배열입니다.");
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
	}
}