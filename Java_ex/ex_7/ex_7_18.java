import java.util.Scanner;

class ex_7_18 {
	
	static void aryRmv(int[] a, int idx) {
		for (int i = idx; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
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
		
		System.out.println("�z��a����v�fa[idx]���폜���܂��B");
		
		int idx;
		do {
			System.out.print("�폜����C���f�b�N�Xidx�F");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		System.out.println();
		
		aryRmv(a, idx);
		
		System.out.println("�폜��̔z��a��\�����܂��B");
		System.out.print("a = {");
		
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
			if (i != n -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
		
	}
}