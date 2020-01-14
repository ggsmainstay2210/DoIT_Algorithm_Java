// y�� m�� d���� �� �� ���� �� ��(12�� 31���̸� 0, 12�� 30���̸� 1)�� ���ϴ� �Ʒ� �޼ҵ带 �ۼ��ϼ���.

package chap02_practice;

import java.util.Scanner;

class Q9 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int days = mdays[isLeap(y)][m - 1] - d;
		
		for (int i = 12; i > m; i--) {
			days += mdays[isLeap(y)][i - 1];
		}
		
		return days;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ����� ���� ���մϴ�.");
		
		do {
			System.out.print("��: "); int year = stdIn.nextInt();
			System.out.print("��: "); int month = stdIn.nextInt();
			System.out.print("��: "); int day = stdIn.nextInt();
			
			System.out.printf("�� �� %d���� ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? (1. �� / 0. �ƴϿ�): ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}