// �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼ҵ� rcopy�� �ۼ��ϼ���

package chap02_practice;

import java.util.Random;

class Q5 {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[b.length - 1 - i] = a[i];
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] oa = new int[10];
		int[] ob = new int[10];
		
		System.out.println("���� �迭�Դϴ�.");
		
		for (int i = 0; i < oa.length; i++) {
			oa[i] = rand.nextInt(100);
			System.out.println(oa[i]);
		}
		
		rcopy(oa, ob);
		
		System.out.println("�������� ����� �迭�Դϴ�.");
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
		
	}
}