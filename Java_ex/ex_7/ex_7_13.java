import java.util.Scanner;

class ex_7_13 {
	
	static int pow2(int n) {
		int pow = 1;
		while(n-- > 0)	{ pow *= 2;}
		return pow;
	}
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static int set(int x, int pos) {
		return x | pow2(pos);
	}
	
	static int reset(int x, int pos) {
		return x & (~pow2(pos));
	}
	
	static int inverse(int x, int pos) {
		return x ^ pow2(pos);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����x��pos�ɂ��āA�ȉ���\�����܂��B");
		System.out.println("�E����x�̒l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ�1�ɂ����l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ�0�ɂ����l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ𔽓]�����l�ƁA���̃r�b�g�\��");
		System.out.println("(�r�b�g�ڂ͍ŉ��ʂ���0, 1, 2�Ɛ����܂��B)");
		
		System.out.println();
		System.out.print("����x�F");
		int x = stdIn.nextInt();
		int pos;
		
		do {
			System.out.print("0�`31�̐��̐���pos�F");
			pos = stdIn.nextInt();
		} while (pos < 0 || pos > 31);
		
		System.out.println("x = " + x);
		System.out.print("x�̃r�b�g�\�� = ");
		printBits(x);
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ�1�ɂ����l = " + set(x, pos));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(set(x, pos));
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ�0�ɂ����l = " + reset(x, pos));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(reset(x, pos));
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ𔽓]�����l = " + inverse(x, pos));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(inverse(x, pos));
		System.out.println();
	}
}