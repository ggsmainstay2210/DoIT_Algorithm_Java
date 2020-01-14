// 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.

package chap02_practice;

class Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] x = {5, 10, 73, 2, -5, 42};
		
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}