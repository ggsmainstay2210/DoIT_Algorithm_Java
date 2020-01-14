// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메소드 rcopy를 작성하세요

package chap02_practice;

import java.util.Random;

class Q5 {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[b.length - 1 - i] = a[i];
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
		
		rcopy(oa, ob);
		
		System.out.println("역순으로 복사된 배열입니다.");
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
		
	}
}