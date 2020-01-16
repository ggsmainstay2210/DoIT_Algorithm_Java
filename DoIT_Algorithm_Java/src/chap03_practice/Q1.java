// 실습 3-3dml seqSearchSen 메소드를 while문이 아니라 for문을 사용하여 수정한 프로그램을 작성하세요.

package chap03_practice;

import java.util.Scanner;

class Q1 {
	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;
		
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] == key)
				break;
		}
		
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}