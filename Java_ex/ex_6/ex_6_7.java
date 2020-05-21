// üŒ`’Tõ

import java.util.Random;
import java.util.Scanner;

class ex_6_7 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for (int j = 0; j < n; j++) 
			a[j] = rand.nextInt(10);
		
		System.out.print("”z—ña‚Ì‘S—v‘f‚Ì’l\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println("}");
		
		System.out.print("’T‚·”’lF");
		int key = stdIn.nextInt();
		
		int i;
		for (i = n - 1; i >= 0; i--)
			if (a[i] == key)
				break;
		
		if (i >= 0)										//’Tõ¬Œ÷
			System.out.println("‚»‚ê‚Ía[" + i + "]‚É‚ ‚è‚Ü‚·B");
		else											//’Tõ¸”s
			System.out.println("‚»‚ê‚Í‚ ‚è‚Ü‚¹‚ñB");
	}
}