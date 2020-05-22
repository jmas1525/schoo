import java.util.Random;

class ex_2_9 {
	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		double x = rand.nextDouble();
		System.out.println(x + "は0.0以上1.0未満の実数値です。");
		
		double y = rand.nextDouble() * 10;
		System.out.println(y + "は0.0以上10.0未満の実数値です。");
		
		double z = (rand.nextDouble() - 0.5) * 2;
		System.out.println(z + "は-1.0以上1.0未満の実数値です。");
	}
}