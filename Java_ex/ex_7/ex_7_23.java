import java.util.Scanner;

class ex_7_23 {
	
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x)		count++;
		}
		
		int[] srch = new int[count];
		count = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x){
				srch[count] = i;
				count++;
			}
		}
		
		return srch;
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
		
		System.out.println("�z��a�̗v�f�̒��Œl��x�ł���S�v�f�̃C���f�b�N�X��擪���珇�Ɋi�[�����z��b���쐬���܂��B");
		System.out.print("��������lx�F");
		int x = stdIn.nextInt();
		
		int[] b = arraySrchIdx(a, x);
		
		System.out.println("");
		
		System.out.print("b = {");
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i != b.length -1)
				System.out.print(", ");
		}
		
		System.out.println("}");
	}
}