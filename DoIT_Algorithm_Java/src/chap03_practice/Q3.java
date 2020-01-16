/* ��� ���� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� �迭 idx�� �� �պ��� ������� �����ϰ�,
 * ��ġ�� ��� ���� ��ȯ�ϴ� �޼ҵ带 �ۼ��ϼ���.
 * ���� ��� ��� ���� 8�� �迭 a�� ��Ұ� {1, 9, 2, 9, 4, 6, 7, 9}�̰� key�� 9��
 * �迭 idx�� {1, 3, 7}�� �����ϰ� �� ��ȯ�մϴ�.
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
		
		System.out.print("��� ��: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		int[] idx = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int count = searchIdx(x, num, ky, idx);
		
		if (count == 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) " + count + "�� �ֽ��ϴ�.");
	}
}