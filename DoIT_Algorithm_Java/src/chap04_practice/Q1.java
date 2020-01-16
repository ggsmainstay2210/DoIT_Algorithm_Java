/* Q1: 실습 4-2에서 사용하는 메서드는 size, capacity, push, pop, peek, dump 뿐입니다.
 * 클래스 IntStack의 모든 메소드를 사용하는 프로그램을 작성하세요.
 */

package chap04_practice;

import chap04.IntStack;
import chap04.IntStack.*;
import java.util.Scanner;

class Q1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println("현재 데이터 수: " + s.size() + "/" + s.capacity());
			System.out.println("(1)push\t(2)pop\t(3)peek\t(4)dump");
			System.out.println("(5)indexOf\t(6)clear\t(7)isEmpty\t(8)isFull");
			System.out.print("(0)종료: ");
		
			int menu = stdIn.nextInt();
			
			if (menu == 0) {
				break;
			}
			
			int x;
			switch (menu) {
			case 1: // push
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				
				break;
				
			case 2: // pop
				try {
					x = s.pop();
					
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				
				break;
				
			case 3: // peek
				try {
					x = s.peek();
					
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				
				break;
				
			case 4: // dump
				s.dump();
				
				break;
				
			case 5: // indexOf
				System.out.print("검색할 값: ");
				x = stdIn.nextInt();
				
				if (s.indexOf(x) == -1)
					System.out.println("그런 데이터가 없습니다.");
				else 
					System.out.println(x + "는 " + s.indexOf(x) + "번 인덱스에 있습니다.");
				
				break;
				
			case 6: // clear
				s.clear();
				
				break;
				
			case 7: // isEmpty
				if (s.isEmpty() == true) 
					System.out.println("네, 비어있습니다.");
				else 
					System.out.println("아니오, 비어있지 않습니다.");
				
				break;
				
			case 8: // isFull
				if (s.isFull() == true)
					System.out.println("네, 가득 차있습니다.");
				else
					System.out.println("아니오, 가득 차지 않았습니다.");
				
				break;
			}
			
			System.out.println();
		}
	}
}