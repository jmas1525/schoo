// ��Βl��Ԃ�
import java.util.Scanner;

class ex_7_31 {
	
	static int absolute(int x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	static long absolute(long x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	static float absolute(float x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
		static double absolute(double x) {
		if(x >= 0)		return x;
		else			return (-1) * x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("int�^�̕ϐ�a�F");
		int a = stdIn.nextInt();
		
		System.out.print("long�^�̕ϐ�b�F");
		long b = stdIn.nextLong();
		
		System.out.print("float�^�̕ϐ�c�F");
		float c = stdIn.nextFloat();
		
		System.out.print("double�^�̕ϐ�d�F");
		double d = stdIn.nextDouble();
		
		System.out.println("a�̐�Βl��" + absolute(a) + "�ł��B");
		System.out.println("b�̐�Βl��" + absolute(b) + "�ł��B");
		System.out.println("c�̐�Βl��" + absolute(c) + "�ł��B");
		System.out.println("d�̐�Βl��" + absolute(d) + "�ł��B");
	}
}