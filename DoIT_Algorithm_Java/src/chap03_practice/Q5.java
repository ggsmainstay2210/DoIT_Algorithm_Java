/*
 * �츮�� ���캻 ���� �˻� �˰��� ���α׷��� �˻��� ���� ���� ���� ���� ��Ұ� �ϳ� �̻��� ��� �� ��� �߿���
 * �� ���� ��Ҹ� ã�� ���մϴ�. �� ���� ��Ҹ� ã�� binSearchX �޼ҵ带 �ۼ��غ�����.
 */

package chap03_practice;

import java.util.Scanner;

class Q5 {
	// ��� ���� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
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
		
		int idx = binSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}