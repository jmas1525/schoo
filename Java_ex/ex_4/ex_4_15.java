import java.util.Scanner;

class ex_4_15 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��cm����F");
		int start = stdIn.nextInt();
		
		System.out.print("��cm�܂ŁF");
		int end = stdIn.nextInt();
		
		System.out.print("��cm���ƁF");
		int intervals = stdIn.nextInt();
		
		System.out.println("�g��\t�W���̏d");
		int height = start;
		double Std_weight = 0;
		
		for (int i = 0; i + start <= end; i += intervals){
			Std_weight = (height - 100) * 0.9;
			System.out.println(height + "\t" + Std_weight);
			height += intervals;
		}
	}
}