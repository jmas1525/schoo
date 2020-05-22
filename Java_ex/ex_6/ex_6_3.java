class ex_6_3 {
	
	public static void main(String[] args) {
		
		double[] a = new double[5];
		
		for (int i = 0; i <= 4; i++) {
			a[i] = (i + 1) * 11.0 / 10.0;
		}
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}