class Label_break_demo {
	public static void main(String[] args) {
	nodecimal:
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k < 10; k++) {	
				if(i % 2 == 0)
					continue nodecimal;
				System.out.print("["+i+"]["+k+"]#");
			}

			System.out.print("\n");
		}
	}
}
