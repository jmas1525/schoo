import java.util.Scanner;

class ex_7_14 {
	
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
	
	static int setN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = set(x, i);
		return x;
	}
	
	static int resetN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = reset(x, i);
		return x;
	}
	
	static int inverseN(int x, int pos , int n) {
		for (int i = pos; i < pos + n; i++) 	x = inverse(x, i);
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����x��pos�An�ɂ��āA�ȉ���\�����܂��B");
		System.out.println("�E����x�̒l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g��1�ɂ����l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g��0�ɂ����l�ƁA���̃r�b�g�\��");
		System.out.println("�E����x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g�𔽓]�����l�ƁA���̃r�b�g�\��");
		System.out.println("(�r�b�g�ڂ͍ŉ��ʂ���0, 1, 2�Ɛ����܂��B)");
		
		System.out.println();
		System.out.print("����x�F");
		int x = stdIn.nextInt();
		int pos;
		int n;
		
		do {
			System.out.print("0�`31�̐��̐���pos�F");
			pos = stdIn.nextInt();
		} while (pos < 0 || pos > 31);
		
		do {
			System.out.print("���̐���n�F");
			n = stdIn.nextInt();
			if(n + pos > 31)		System.out.println("n + pos <= 32 �ɂȂ�悤�ɂ��Ă��������B");
		} while (n < 0 || n + pos > 32);
		
		System.out.println("x = " + x);
		System.out.print("x�̃r�b�g�\�� = ");
		printBits(x);
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g��1�ɂ����l = " + setN(x, pos, n));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(setN(x, pos, n));
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g��0�ɂ����l = " + resetN(x, pos, n));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(resetN(x, pos, n));
		System.out.println();
		
		System.out.println("x��pos�r�b�g�ڂ��ŉ��ʂƂ��ĘA������n�̃r�b�g�𔽓]�����l = " + inverseN(x, pos, n));
		System.out.print("���̃r�b�g�\�� = ");
		printBits(inverseN(x, pos, n));
		System.out.println();
	}
}