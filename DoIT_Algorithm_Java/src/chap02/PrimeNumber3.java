// 1,000 ÀÌÇÏÀÇ ¼Ò¼ö¸¦ ¿­°Å(¹öÀü 3)

package chap02;

class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[1000];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for (int n = 5; n < 1000; n += 2) {
			boolean flag = false;
			
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
				
				if (!flag) {
					prime[ptr++] = n;
					counter++;
				}
			}
			
			for (int i = 0; i < ptr; i++) 
				System.out.println(prime[i]);
			
			System.out.println("°ö¼À°ú ³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö: " + counter);
		}
	}
}