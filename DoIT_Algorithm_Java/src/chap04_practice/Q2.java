// Q2: 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Gstack<E>를 작성하세요.

package chap04_practice;

public class Q2 {
	public static void main(String[] args) {
		// 아무 것도 실행하지 않는 main 메소드
	}
}

class Gstack<E> {
	private int max;
	private int ptr;
	private E[] stk;
	
	// 실행 시 예외: 스택이 비어있음
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {}
	}
	
	// 실행 시 예외: 스택이 가득 참
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {}
	}
	
	// 생성자
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		
		try {
			stk = (E[])(new Object[max]);
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 스택에 x를 푸시
	public E push(E x) throws OverflowGstackException {
		if (ptr >= max) 
			throw new OverflowGstackException();
		
		return stk[ptr++] = x;
	}
	
	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public E pop() throws EmptyGstackException {
		if (ptr <= 0)
			throw new EmptyGstackException();
		
		return stk[--ptr];
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0)
			throw new EmptyGstackException();
		
		return stk[ptr - 1];
	}
	
	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i].equals(x))
				return i;
		
		return -1;
	}
	
	// 스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptr; i++) 
				System.out.print(stk[i] + " ");
			
			System.out.println();
		}
	}
}