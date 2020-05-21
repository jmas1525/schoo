import java.util.Random;

class ex_2_7 {
	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int x = rand.nextInt(9) + 1;
		System.out.println(x + "は1桁の正の整数値です。");
		
		int y = rand.nextInt(9) - 9;
		System.out.println(y + "は1桁の負の整数値です。");
		
		int z = rand.nextInt(90) + 10;
		System.out.println(z + "は2桁の正の整数値です。");
	}
}