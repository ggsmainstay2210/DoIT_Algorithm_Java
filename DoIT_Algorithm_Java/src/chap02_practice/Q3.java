// �迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼ҵ带 �ۼ��ϼ���.

package chap02_practice;

import java.util.Random;

class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] oa = new int[100];
		
		for (int i = 0; i < 100; i++) {
			oa[i] = i + 1;
		}
		
		System.out.println("�հ�� " + sumOf(oa) + "�Դϴ�.");
	}
}