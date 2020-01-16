/* 오른쪽처럼 이진 검색의 과정을 자세히 출력하는 프로그램을 작성하세요.
 * 각 행의 맨 왼쪽에 현재 검색하고 있는 요소의 인덱스를 출력하고, 
 * 검색 범위의 맨 앞 요소 위에 <-, 맨 끝 요소 위에 ->, 현재 검색하고 있는 중앙 요소 위에 +를 출력하도록 하세요.
 */

package chap03_practice;

import java.util.Scanner;

class Q4 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			
			System.out.print("  |");
			for (int i = 1; i < pl * 2 + 1; i++)
				System.out.print(" ");
			System.out.print("<-");
			for (int i = 1; i < (pc * 2 + 1) - (pl * 2 + 2); i++)
				System.out.print(" ");
			System.out.print("+");
			for (int i = 1; i < (pr * 2 + 1) - ((pc * 2 + 2) - (pl * 2 + 2)) - (pl * 2 + 2); i++)
				System.out.print(" ");
			System.out.println("->");
			
			System.out.printf(" %d|", pc);
			for (int i = 0; i < a.length; i++)
				System.out.printf(" %d", a[i]);
			System.out.println("\n  |");
			
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pl + 1;
			else
				pr = pr - 1;
		} while (pl <= pr);
		
		return -1;
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
		
		System.out.println("  | 0 1 2 3 4 5 6");
		System.out.println("--+----------------");
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}