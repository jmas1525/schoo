import java.util.Random;

class ex_2_9 {
	
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		double x = rand.nextDouble();
		System.out.println(x + "��0.0�ȏ�1.0�����̎����l�ł��B");
		
		double y = rand.nextDouble() * 10;
		System.out.println(y + "��0.0�ȏ�10.0�����̎����l�ł��B");
		
		double z = (rand.nextDouble() - 0.5) * 2;
		System.out.println(z + "��-1.0�ȏ�1.0�����̎����l�ł��B");
	}
}