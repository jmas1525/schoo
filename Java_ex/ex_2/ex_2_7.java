import java.util.Random;

class ex_2_7 {
	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int x = rand.nextInt(9) + 1;
		System.out.println(x + "��1���̐��̐����l�ł��B");
		
		int y = rand.nextInt(9) - 9;
		System.out.println(y + "��1���̕��̐����l�ł��B");
		
		int z = rand.nextInt(90) + 10;
		System.out.println(z + "��2���̐��̐����l�ł��B");
	}
}