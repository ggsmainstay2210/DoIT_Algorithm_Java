// �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�δ� �޼ҵ带 �ۼ��ϼ���.

package chap02_practice;

import java.util.Scanner;

class Q6 {
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� ���ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYX";
		char temp;
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for (int i = 0; i < digits / 2; i++) {
			temp = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = temp;
		}
	
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = stdIn.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36): ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 32);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for (int i = 0; i <= dno - 1; i++) 
				System.out.print(cno[i]);;
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1. �� / 0. �ƴϿ�): ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}