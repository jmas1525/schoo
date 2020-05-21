class ex_6_2 {
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			a[i] = 5 - i;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}