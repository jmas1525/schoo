import java.util.Scanner;

class ex_6_6 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int ninzu;
		
		do {
			System.out.print("�l��(0�ŃL�����Z��)�F");
			ninzu = stdIn.nextInt();
			if (ninzu == 0)		System.exit(0);
		} while (ninzu <= 0);
		
			int[] tensu = new int[ninzu];
		
		System.out.println(ninzu + "�l�̓_������͂���B");
		
		for (int i = 0; i < ninzu; i++) {
			do {
				System.out.print((i + 1) + "�Ԃ̓_���F");
				tensu[i] = stdIn.nextInt();
			} while (tensu[i] < 0);
		}
		
		int max = tensu[0];
		int min = tensu[0];
		int sum = tensu[0];
		
		for (int i = 1; i < tensu.length; i++) {
			if (tensu[i] > max)		max = tensu[i];
			if (tensu[i] < min)		min = tensu[i];
			sum += tensu[i];
		}
		
		System.out.println("���v�_��" + sum + "�_�ł��B");
		System.out.println("���ϓ_��" + (sum / ninzu) + "�_�ł��B");
		System.out.println("�ō��_��" + max + "�_�ł��B");
		System.out.println("�Œ�_��" + min + "�_�ł��B");
	}
}
			
			