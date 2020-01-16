// ��ü�˻� ������ �迭���� ���� �˻��ϱ�

package chap03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysExamSearch {
	// ��ü�˻� �����͸� �����մϴ�.
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �޼ҵ�(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// ������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = 
				new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
		};
		
		
		}
	}
}