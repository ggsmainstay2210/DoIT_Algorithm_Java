// �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.

package chap02_practice;

class Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]�� a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
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
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
}