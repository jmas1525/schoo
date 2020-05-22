// 文字列探索
import java.util.Scanner;

public class ex_15_3 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1："); String s1 = stdIn.next();
		System.out.print("文字列s2："); String s2 = stdIn.next();
		stdIn.close();

		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else
			System.out.println("s1の" + (idx + 1) + "文字目にs2が含まれます。");

		System.out.println("s1：" + s1);
		System.out.print("s2：");
		for(int i = 0; i < idx; i++)	System.out.print(" ");
		System.out.println(s2);
	}
}