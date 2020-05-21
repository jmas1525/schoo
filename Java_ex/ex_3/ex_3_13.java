// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class ex_3_13 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int A = stdIn.nextInt();
		
		System.out.print("整数値：");
		int B = stdIn.nextInt();
		
		System.out.print("整数値：");
		int C = stdIn.nextInt();
		
		int med = 0;
		
		if(B <= A && A <= C)    med = A;
		if(C <= A && A <= B)    med = A;
		if(A <= B && B <= C)    med = B;
		if(C <= B && B <= A)    med = B;
		if(A <= C && C <= B)    med = C;
		if(B <= C && C <= A)    med = C;
		
		System.out.println("中央値は" + med + "です。");
	}
}