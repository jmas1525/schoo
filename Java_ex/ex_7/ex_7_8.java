import java.util.Scanner;
import java.util.Random;

class ex_7_8 {
	
	static int random(int a, int b) {
		Random rand = new Random();
		
		if(b < a)	return a;
		
		int area = b - a + 1;
		
		int abrand = rand.nextInt(area) + a;
		
		return abrand;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����a�ȏ�b�ȉ��̗����𐶐����āA���̒l��ԋp���܂��B");
		System.out.println("b�̒l��a��菬�����ꍇ�ɂ́Aa�̒l�����̂܂ܕԋp���܂��B");
		
		System.out.print("����a�F");
		int a = stdIn.nextInt();
		
		System.out.print("����b�F");
		int b = stdIn.nextInt();
		
		System.out.println(random(a, b));
	}
}