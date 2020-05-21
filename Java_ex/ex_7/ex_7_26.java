import java.util.Scanner;

class ex_7_26 {
	
	static Scanner stdIn = new Scanner(System.in);
	
	static int[] arrayInsOf(int[] a, int idx, int x) {
		int[] ins = new int[a.length + 1];
		
		for (int i = 0; i < ins.length; i++) {
			if(i < idx)	ins[i] = a[i];
			else if (i == idx)	ins[i] = x;
			else		ins[i] = a[i - 1];
		}
		return ins;
	}
	
	static void printArray(int[] a) {
		System.out.print("{");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i != a.length - 1)
				System.out.print(", ");
		}
		
		System.out.println("}");
	}
	
	static int[] makeArray() {
		System.out.print("�v�f���F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		System.out.println("�z��a���쐬���܂��B");
		int[] a = makeArray();
		
		System.out.print("a = ");
		printArray(a);
		
		int idx;
		System.out.println("�z��a�̗v�fa[idx]��x��}�������z��b���쐬���܂��B");
		do {
			System.out.print("�}������C���f�b�N�Xidx�F");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx > a.length);
		
		System.out.print("�}������lx�F");
		int x = stdIn.nextInt();
		
		int[] b = arrayInsOf(a, idx, x);
		
		System.out.print("b = ");
		printArray(b);
	}
}