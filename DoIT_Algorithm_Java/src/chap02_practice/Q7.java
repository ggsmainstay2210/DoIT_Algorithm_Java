// 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.

package chap02_practice;

import java.util.Scanner;

class Q7 {
	// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
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
		
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한 번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.print("변환하는 음이 아닌 정수: ");
		
		no = stdIn.nextInt();
		
		System.out.print("어떤 진수로 변환할까요?(2-36): ");
		
		cd = stdIn.nextInt();
		
		dno = cardConvR(no, cd, cno);
		
		System.out.print("2진수로 ");
		for (int i = dno - 1; i >= 0; i--)
			System.out.print(cno[i]);
		System.out.println("입니다.");
	}
}