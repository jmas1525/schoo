class ex_5_6 {
	
	public static void main(String[] args) {
		
		System.out.println("  float\t       int");
		
		for (int h = 1; h <= 21; h++)	System.out.print("-");
		System.out.println();
		
		float FLOAT = 0;
		double INT = 0;
		
		for (int i = 0; i <= 1000; i++) {
			INT = (double)i / 1000;
			if (i != 0)
				FLOAT += 0.001;
			
			System.out.printf("%.7f   %.7f\n",FLOAT,INT);
		}
	}
}