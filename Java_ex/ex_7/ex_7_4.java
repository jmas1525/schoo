// 3�̒l�̒����l�����߂�B�iex3-13�Ƃ͕ʂ̕��@�ŁI�j

import java.util.Scanner;

class ex_7_4 {
	
	static int sumUp(int a) {
		int sum = 0;
		int max = 1;
		int min = a;
		
		if(max < min) {
			int t = max;
			max = min;
			min = t;
		}
		
		for (int i = min; i <= max; i++)	sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1����n�܂ł̑S�����̘a��ԋp���܂��B");
		
		System.out.print("����n�F");
		int n = stdIn.nextInt();
		
		System.out.println("\n1����" + n + "�܂ł̘a�F" + sumUp(n));
	}
}
		