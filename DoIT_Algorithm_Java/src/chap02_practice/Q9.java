// y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 아래 메소드를 작성하세요.

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
		
		System.out.println("그 해 경과일 수를 구합니다.");
		
		do {
			System.out.print("년: "); int year = stdIn.nextInt();
			System.out.print("월: "); int month = stdIn.nextInt();
			System.out.print("일: "); int day = stdIn.nextInt();
			
			System.out.printf("그 해 %d일이 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오): ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}