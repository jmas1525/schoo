//�l����́A�r�b�g�\����\��

import java.util.Scanner;

class ex_7_32 {
	
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static void printBits(short x) {
		for (int i = 15; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static void printBits(long x) {
		for (int i = 63; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���͂��ꂽ�l�ɂ��āA���̒l�̃r�b�g�\����\�����܂��B");
		
		System.out.print("byte�^�̐���b�F");
		byte b = stdIn.nextByte();
		
		System.out.print("short�^�̐���s�F");
		short s = stdIn.nextShort();
		
		System.out.print("int�^�̐���i�F");
		int i = stdIn.nextInt();
		
		System.out.print("long�^�̐���l�F");
		long l = stdIn.nextLong();
		
		System.out.print("����b�̃r�b�g�\���F");
		printBits(b);
		System.out.println();
		
		System.out.print("����s�̃r�b�g�\���F");
		printBits(s);
		System.out.println();
		
		System.out.print("����i�̃r�b�g�\���F");
		printBits(i);
		System.out.println();
		
		System.out.print("����l�̃r�b�g�\���F");
		printBits(l);
		System.out.println();
		
	}
}