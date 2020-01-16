/* Q3: 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스를 만드세요.
 * 스택에 저장하는 데이터는 int형 값으로 아래 그림처럼 배열의 처음과 끝을 사용하세요.
 */

package chap04_practice;

class Q3 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	// 실행 시 예외: 스택이 비어있음
	class EmptyQ3Exception extends RuntimeException {
		public EmptyQ3Exception() {}
	}
	
	// 실행 시 예외: 스택이 가득 참
	class OverflowQ3Exception extends RuntimeException {
		public OverflowQ3Exception() {}
	}
	
	// 생성자
	public Q3(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// A 스택에 x를 푸시
	public int pushA(int x) throws OverflowQ3Exception {
		if (ptrA >= ptrB + 1)
			throw new OverflowQ3Exception();
		
		return stk[ptrA++] = x;
	}
	
	// B 스택에 x를 푸시
	public int pushB(int x) throws OverflowQ3Exception {
		if (ptrB <= ptrA - 1)
			throw new OverflowQ3Exception();
		
		return stk[ptrB--] = x;
	}
	
	// A 스택에서 x를 팝
	public int popA() throws EmptyQ3Exception {
		if (ptrA <= 0)
			throw new EmptyQ3Exception();
		
		return stk[--ptrA];
	}
	
	// B 스택에서 x를 팝
	public int popB() throws EmptyQ3Exception {
		if (ptrB >= max - 1)
			throw new EmptyQ3Exception();
		
		return stk[++ptrB];
	}
	
	// A 스택에서 데이터를 피크
	public int peekA() throws EmptyQ3Exception {
		if (ptrA <= 0)
			throw new EmptyQ3Exception();
		
		return stk[ptrA - 1];
	}
	
	// B 스택에서 데이터를 피크
	public int peekB() throws EmptyQ3Exception {
		if (ptrB >= max - 1)
			throw new EmptyQ3Exception();
		
		return stk[ptrB + 1];
	}
	
	// A 스택에서 x 찾아 인덱스 반환
	public int indexOfA(int x) {
		for (int i = ptrA - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
			
			return -1;
	}
	
	// B 스택에서 x 찾아 인덱스 반환
	public int indexOfB(int x) {
		for (int i = ptrB + 1; i <= max - 1; i++)
			if (stk[i] == x)
				return i;
		
		return -1;
	}
			
	// A 스택을 비움
	public void clearA() {
		ptrA = 0;
	}
	
	// B 스택을 비움
	public void clearB() {
		ptrB = max - 1;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// A 스택에 쌓여 있는 데이터 수를 반환
	public int sizeA() {
		return ptrA;
	}
	
	// B 스택에 쌓여 있는 데이터 수를 반환
	public int sizeB() {
		return max - ptrB - 1;
	}
	
	// A 스택이 비어있는가?
	public boolean isEmptyA() {
		return ptrA <= 0;
	}
	
	// B 스택이 비어있는가?
	public boolean isEmptyB() {
		return ptrB >= max - 1;
	}
	
	// A 스택이 가득 찼는가?
	public boolean isFullA() {
		return ptrA >= ptrB + 1; 
	}
	
	// B 스택이 가득 찼는가?
	public boolean isFullB() {
		return ptrB <= ptrA - 1;
	}
	
	// A 스택의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dumpA() {
		if (ptrA <= 0)
			System.out.println("A 스택이 비어있습니다.");
		else {
			for (int i = 0; i < ptrA; i++)
				System.out.print(stk[i] + " ");
			
			System.out.println();
		}
	}
	
	// B 스택의 모든 데이터를 바닥 → 꼭대기 순서로 출력
	public void dumpB() {
		if (ptrB >= max - 1)
			System.out.println("B 스택이 비어있습니다.");
		else {
			for (int i = max - 1; i > ptrB; i--)
				System.out.print(stk[i] + " ");
			
			System.out.println();
		}
	}
}