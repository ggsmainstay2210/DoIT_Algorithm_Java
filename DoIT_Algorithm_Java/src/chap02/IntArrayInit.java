// ���� �ڷ����� int���� �迭(���� ��Ҽ��� 5: �迭 �ʱ��ڿ� ���� ����)

package chap02;

class IntArrayInit {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}