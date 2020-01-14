// ������ó�� ���� ������� �ʵ�� ���� Ŭ������ ���弼��. ������ ���� �����ڿ� �޼ҵ带 �����ؾ� �մϴ�.

package chap02_practice;

import java.util.Scanner;

public class Q11 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��¥�� �Է��ϼ���.\n");
		System.out.print("�⣺");
		int y = stdIn.nextInt();
		System.out.print("����");
		int m = stdIn.nextInt();
		System.out.print("�ϣ�");
		int d = stdIn.nextInt();
		
		YMD date = new YMD(y, m, d);

		System.out.print("�� �� ��/���� ��¥�� ���ұ��?��");
		int n = stdIn.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
	}
}

class YMD {
	int y;
	int m;
	int d;
	
	YMD(int y, int m, int d) {
		this.y = y; this.m = m; this.d = d;
	}
	
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		
		if (n < 0) {
			return (before(-n));
		}
		
		temp.d += n;
		while (temp.d > Q11.mdays[Q11.isLeap(temp.y)][temp.m - 1]) {
			temp.d -= Q11.mdays[Q11.isLeap(temp.y)][temp.m - 1];
			
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		
		return temp;
	}

	
	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		
		if (n < 0) {
			return (after(-n));
		}
		
		temp.d -= n;
		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += Q11.mdays[Q11.isLeap(temp.y)][temp.m - 1];
		}
		
		return temp;
	}
}