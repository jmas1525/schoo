class ex_5_7 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 1000; i++) {
			double n = (double)i / 1000;
			double POW = Math.pow(n,2);
			System.out.printf("%.7f   %.7f\n",n,POW);
		}
	}
}