// ��� ��ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ��ϼ���.

package chap02_practice;

import java.util.Scanner;

class Q7 {
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(r + "|\t" + x);
		System.out.println(" +--------");
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
			System.out.println(r + "|\t" + x + " ... " + d[digits - 1]);
			System.out.println(" +--------");
		} while (x != 0);
		
		System.out.println(" \t" + x + " ... " + d[digits - 1]);
		
		return digits;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no; // ��ȯ�ϴ� ����
		int cd; // ���
		int dno; // ��ȯ ���� �ڸ���
		int retry; // �ٽ� �� ��?
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
		
		no = stdIn.nextInt();
		
		System.out.print("� ������ ��ȯ�ұ��?(2-36): ");
		
		cd = stdIn.nextInt();
		
		dno = cardConvR(no, cd, cno);
		
		System.out.print("2������ ");
		for (int i = dno - 1; i >= 0; i--)
			System.out.print(cno[i]);
		System.out.println("�Դϴ�.");
	}
}