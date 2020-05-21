//値を入力、ビット構成を表示

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
		
		System.out.println("入力された値について、その値のビット構成を表示します。");
		
		System.out.print("byte型の整数b：");
		byte b = stdIn.nextByte();
		
		System.out.print("short型の整数s：");
		short s = stdIn.nextShort();
		
		System.out.print("int型の整数i：");
		int i = stdIn.nextInt();
		
		System.out.print("long型の整数l：");
		long l = stdIn.nextLong();
		
		System.out.print("整数bのビット構成：");
		printBits(b);
		System.out.println();
		
		System.out.print("整数sのビット構成：");
		printBits(s);
		System.out.println();
		
		System.out.print("整数iのビット構成：");
		printBits(i);
		System.out.println();
		
		System.out.print("整数lのビット構成：");
		printBits(l);
		System.out.println();
		
	}
}