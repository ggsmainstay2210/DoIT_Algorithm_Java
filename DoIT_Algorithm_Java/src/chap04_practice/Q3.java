/* Q3: �ϳ��� �迭�� �����Ͽ� 2���� ������ �����ϴ� int�� �����Ϳ� ���� Ŭ������ ���弼��.
 * ���ÿ� �����ϴ� �����ʹ� int�� ������ �Ʒ� �׸�ó�� �迭�� ó���� ���� ����ϼ���.
 */

package chap04_practice;

class Q3 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	// ���� �� ����: ������ �������
	class EmptyQ3Exception extends RuntimeException {
		public EmptyQ3Exception() {}
	}
	
	// ���� �� ����: ������ ���� ��
	class OverflowQ3Exception extends RuntimeException {
		public OverflowQ3Exception() {}
	}
	
	// ������
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
	
	// A ���ÿ� x�� Ǫ��
	public int pushA(int x) throws OverflowQ3Exception {
		if (ptrA >= ptrB + 1)
			throw new OverflowQ3Exception();
		
		return stk[ptrA++] = x;
	}
	
	// B ���ÿ� x�� Ǫ��
	public int pushB(int x) throws OverflowQ3Exception {
		if (ptrB <= ptrA - 1)
			throw new OverflowQ3Exception();
		
		return stk[ptrB--] = x;
	}
	
	// A ���ÿ��� x�� ��
	public int popA() throws EmptyQ3Exception {
		if (ptrA <= 0)
			throw new EmptyQ3Exception();
		
		return stk[--ptrA];
	}
	
	// B ���ÿ��� x�� ��
	public int popB() throws EmptyQ3Exception {
		if (ptrB >= max - 1)
			throw new EmptyQ3Exception();
		
		return stk[++ptrB];
	}
	
	// A ���ÿ��� �����͸� ��ũ
	public int peekA() throws EmptyQ3Exception {
		if (ptrA <= 0)
			throw new EmptyQ3Exception();
		
		return stk[ptrA - 1];
	}
	
	// B ���ÿ��� �����͸� ��ũ
	public int peekB() throws EmptyQ3Exception {
		if (ptrB >= max - 1)
			throw new EmptyQ3Exception();
		
		return stk[ptrB + 1];
	}
	
	// A ���ÿ��� x ã�� �ε��� ��ȯ
	public int indexOfA(int x) {
		for (int i = ptrA - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
			
			return -1;
	}
	
	// B ���ÿ��� x ã�� �ε��� ��ȯ
	public int indexOfB(int x) {
		for (int i = ptrB + 1; i <= max - 1; i++)
			if (stk[i] == x)
				return i;
		
		return -1;
	}
			
	// A ������ ���
	public void clearA() {
		ptrA = 0;
	}
	
	// B ������ ���
	public void clearB() {
		ptrB = max - 1;
	}
	
	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// A ���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int sizeA() {
		return ptrA;
	}
	
	// B ���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int sizeB() {
		return max - ptrB - 1;
	}
	
	// A ������ ����ִ°�?
	public boolean isEmptyA() {
		return ptrA <= 0;
	}
	
	// B ������ ����ִ°�?
	public boolean isEmptyB() {
		return ptrB >= max - 1;
	}
	
	// A ������ ���� á�°�?
	public boolean isFullA() {
		return ptrA >= ptrB + 1; 
	}
	
	// B ������ ���� á�°�?
	public boolean isFullB() {
		return ptrB <= ptrA - 1;
	}
	
	// A ������ ��� �����͸� �ٴ� �� ����� ������ ���
	public void dumpA() {
		if (ptrA <= 0)
			System.out.println("A ������ ����ֽ��ϴ�.");
		else {
			for (int i = 0; i < ptrA; i++)
				System.out.print(stk[i] + " ");
			
			System.out.println();
		}
	}
	
	// B ������ ��� �����͸� �ٴ� �� ����� ������ ���
	public void dumpB() {
		if (ptrB >= max - 1)
			System.out.println("B ������ ����ֽ��ϴ�.");
		else {
			for (int i = max - 1; i > ptrB; i--)
				System.out.print(stk[i] + " ");
			
			System.out.println();
		}
	}
}