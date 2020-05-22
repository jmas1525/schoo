import java.util.Scanner;

class ex_7_20 {
	
	static void aryIns(int[] a, int idx, int x) {
		for (int i = a.length - 1; i > idx; i--) {
			a[i] = a[i - 1];
		}
		a[idx] = x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
		System.out.println("�z��a�̗v�fa[idx]��x��}�����܂��B");
		
		int idx;
		do {
			System.out.print("�}������C���f�b�N�Xidx�F");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		
		System.out.print("�}������lx�F");
		int x = stdIn.nextInt();
		
		aryIns(a, idx, x);
		
		System.out.println("�}����̔z��a��\�����܂��B");
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
	}
}