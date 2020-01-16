// �ǽ� 3-3dml seqSearchSen �޼ҵ带 while���� �ƴ϶� for���� ����Ͽ� ������ ���α׷��� �ۼ��ϼ���.

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
		
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}