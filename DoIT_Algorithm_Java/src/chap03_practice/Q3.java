/* 요소 수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
 * 일치한 요소 수를 반환하는 메소드를 작성하세요.
 * 예를 들어 요소 수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9면
 * 배열 idx에 {1, 3, 7}을 저장하고 을 반환합니다.
 */

package chap03_practice;

import java.util.Scanner;

class Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				idx[j++] = i;
			}
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		int[] idx = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int count = searchIdx(x, num, ky, idx);
		
		if (count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) " + count + "개 있습니다.");
	}
}