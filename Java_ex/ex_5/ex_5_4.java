import java.util.Scanner;

class ex_5_4 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("����x,y,z�̍��v�ƕ��ϒl�����߂܂��B");
		
		System.out.print("x�̒l�F");
		int x = stdIn.nextInt();
		
		System.out.print("y�̒l�F");
		int y = stdIn.nextInt();
		
		System.out.print("z�̒l�F");
		int z = stdIn.nextInt();

		System.out.println("���v��" + (x + y + z) + "�ł��B");
		System.out.println("���ς�" + (x + y + z) / 3.0 + "�ł��B");
	}
}