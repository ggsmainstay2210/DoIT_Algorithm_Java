/* 오른쪽처럼 선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하세요.
 * 이때 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고, 
 * 현재 검색하고 있는 요소 위에 별표 기호 *를 출력하세요. 
 */

package chap03_practice;

import java.util.Scanner;

class Q2 {
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			System.out.print("  |");
			for (int j = 1; j <= i * 2 + 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			System.out.printf(" %d|", i);
			for (int j = 0; j < n; j++) {
				System.out.printf(" %d", a[j]);
			}
			System.out.println("\n  |");
			
			if (a[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		System.out.println("  | 0 1 2 3 4 5 6");
		System.out.println("--+----------------");
		
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}