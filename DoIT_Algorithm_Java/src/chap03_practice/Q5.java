/*
 * 우리가 살펴본 이진 검색 알고리즘 프로그램은 검색할 값과 같은 값을 같는 요소가 하나 이상일 경우 그 요소 중에서
 * 맨 앞의 요소를 찾지 못합니다. 맨 앞의 요소를 찾는 binSearchX 메소드를 작성해보세요.
 */

package chap03_practice;

import java.util.Scanner;

class Q5 {
	// 요소 수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		int idx = -1;
		
		do {
			int pc = (pl + pr) / 2;
			
			if (a[pc] == key) {
				idx = pc;
				break;
			}
			else if (a[pc] < key)
				pl = pl + 1;
			else
				pr = pr - 1;
		} while (pl <= pr);
		
		if (idx == -1)
			return idx;
		else {
			for (int i = idx; i >= pl; i--) {
				if (a[i] == key) {
					idx = i;
				}
			}
			return idx;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}