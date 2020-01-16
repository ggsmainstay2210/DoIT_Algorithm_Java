/* ������ó�� ���� �˻��� ��ĳ�� ������ ���ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �̶� �� ���� �� ���ʿ� ���� �˻��ϴ� ����� �ε����� ����ϰ�, 
 * ���� �˻��ϰ� �ִ� ��� ���� ��ǥ ��ȣ *�� ����ϼ���. 
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
		
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		System.out.println("  | 0 1 2 3 4 5 6");
		System.out.println("--+----------------");
		
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}