// 3�̒l�̒����l�����߂�B�iex3-13�Ƃ͕ʂ̕��@�ŁI�j

import java.util.Scanner;

class ex_7_3 {
	
	static int med(int a, int b, int c) {
		int[] desc = {a, b, c};
		for (int i = desc.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(desc[j] < desc[j + 1]) {
					int t = desc[j];
					desc[j] = desc[j + 1];
					desc[j + 1] = t;
					
					//System.out.println(desc[0] + " " + desc[1] +" " + desc[2]);
				}
			}
		}
		return desc[1];
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3�̐����l�̒����l��ԋp���܂��B");
		
		int[] n = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("�����l�F");
			n[i] = stdIn.nextInt();
		}
		
		System.out.println("\n�����l�F" + med(n[0], n[1], n[2]));
	}
}
		