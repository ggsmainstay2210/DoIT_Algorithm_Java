/* ������ó�� ���� �˻��� ������ �ڼ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ���� �� ���ʿ� ���� �˻��ϰ� �ִ� ����� �ε����� ����ϰ�, 
 * �˻� ������ �� �� ��� ���� <-, �� �� ��� ���� ->, ���� �˻��ϰ� �ִ� �߾� ��� ���� +�� ����ϵ��� �ϼ���.
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
		
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0]: ");
		x[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		System.out.println("  | 0 1 2 3 4 5 6");
		System.out.println("--+----------------");
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}