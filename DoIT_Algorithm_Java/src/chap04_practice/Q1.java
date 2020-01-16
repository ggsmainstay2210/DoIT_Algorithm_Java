/* Q1: �ǽ� 4-2���� ����ϴ� �޼���� size, capacity, push, pop, peek, dump ���Դϴ�.
 * Ŭ���� IntStack�� ��� �޼ҵ带 ����ϴ� ���α׷��� �ۼ��ϼ���.
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
			System.out.println("���� ������ ��: " + s.size() + "/" + s.capacity());
			System.out.println("(1)push\t(2)pop\t(3)peek\t(4)dump");
			System.out.println("(5)indexOf\t(6)clear\t(7)isEmpty\t(8)isFull");
			System.out.print("(0)����: ");
		
			int menu = stdIn.nextInt();
			
			if (menu == 0) {
				break;
			}
			
			int x;
			switch (menu) {
			case 1: // push
				System.out.print("������: ");
				x = stdIn.nextInt();
				
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				
				break;
				
			case 2: // pop
				try {
					x = s.pop();
					
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				
				break;
				
			case 3: // peek
				try {
					x = s.peek();
					
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				
				break;
				
			case 4: // dump
				s.dump();
				
				break;
				
			case 5: // indexOf
				System.out.print("�˻��� ��: ");
				x = stdIn.nextInt();
				
				if (s.indexOf(x) == -1)
					System.out.println("�׷� �����Ͱ� �����ϴ�.");
				else 
					System.out.println(x + "�� " + s.indexOf(x) + "�� �ε����� �ֽ��ϴ�.");
				
				break;
				
			case 6: // clear
				s.clear();
				
				break;
				
			case 7: // isEmpty
				if (s.isEmpty() == true) 
					System.out.println("��, ����ֽ��ϴ�.");
				else 
					System.out.println("�ƴϿ�, ������� �ʽ��ϴ�.");
				
				break;
				
			case 8: // isFull
				if (s.isFull() == true)
					System.out.println("��, ���� ���ֽ��ϴ�.");
				else
					System.out.println("�ƴϿ�, ���� ���� �ʾҽ��ϴ�.");
				
				break;
			}
			
			System.out.println();
		}
	}
}