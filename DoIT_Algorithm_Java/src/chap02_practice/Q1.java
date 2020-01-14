// Ű�Ӹ� �ƴ϶� ��� ���� ������ �����ϵ��� �ǽ� 2-5�� �����Ͽ� ���α׷��� �ۼ��ϼ���.

package chap02_practice;

import java.util.Random;
import java.util.Scanner;

class Q1 {
	// �迭 a�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		
		int num = rand.nextInt(5) + 1;
		System.out.println("��� ��: " + num);
		
		int[] height = new int[num];
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
		
	}
}
