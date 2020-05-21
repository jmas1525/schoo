import java.util.Scanner;

class ex_7_19 {
	
	static void aryRmvN(int[] a, int idx, int n) {
		for (int i = idx; i < a.length - n; i++) {
			a[i] = a[i + n];
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
		
		System.out.println("�z��a����v�fa[idx]��擪�Ƃ���N�̗v�f���폜���܂��B");
		
		int idx;
		int N;
		do {
			System.out.print("�폜����C���f�b�N�Xidx�F");
			idx = stdIn.nextInt();
		} while (idx < 0 || idx >= a.length);
		
		do {
			System.out.print("���̐���N�F");
			N = stdIn.nextInt();
			if(N + idx > a.length)		System.out.println("N + idx ���z��a�̗v�f���ȉ��ɂȂ�悤�ɂ��Ă��������B");
		} while (N < 0 || N + idx > a.length);
		
		aryRmvN(a, idx, N);
		
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