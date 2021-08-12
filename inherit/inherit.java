class Aclass {
	private int var_pri = 10;
	protected int var_pro = 11;
	public int var_pub = 12;
	int var_nomod = 13;
	private void metd_pri() {
		System.out.println("when private method called");
		System.out.println("metd_pri,var_pri = "+var_pri);
		System.out.println("metd_pri,var_pro = "+var_pro);
		System.out.println("metd_pri,var_pub = "+var_pub);
		System.out.println("metd_pri,var_nomod = "+var_nomod);
	}
	protected void metd_pro() {
		System.out.println("when protected method called");
		System.out.println("metd_pro,var_pri = "+var_pri);
		System.out.println("metd_pro,var_pro = "+var_pro);
		System.out.println("metd_pro,var_pub = "+var_pub);
		System.out.println("metd_pro,var_nomod = "+var_nomod);
	}
	public void metd_pub() {
		System.out.println("when public method called");
		System.out.println("metd_pub,var_pri = "+var_pri);
		System.out.println("metd_pub,var_pro = "+var_pro);
		System.out.println("metd_pub,var_pub = "+var_pub);
		System.out.println("metd_pub,var_nomod = "+var_nomod);
	}
	void metd_nomod() {
		System.out.println("when nomod method called");
		System.out.println("metd_nomod,var_pri = "+var_pri);
		System.out.println("metd_nomod,var_pro = "+var_pro);
		System.out.println("metd_nomod,var_pub = "+var_pub);
		System.out.println("metd_nomod,var_nomod = "+var_nomod);
	}
}

/*v2class Bclass extends Aclass {
	public static void main(String[] args) {
		Aclass a = new Aclass();
		Bclass b = new Bclass();
/*v1		a.metd_pub();
		a.metd_nomod();
		a.metd_pro();
//		a.metd_pri();
		System.out.println("In Bclass,Aclass acesses,var_pri = "+a.var_pri);
		System.out.println("In Bclass,Aclass acesses,var_pro = "+a.var_pro);
		System.out.println("In Bclass,Aclass acesses,var_pub = "+a.var_pub);
		System.out.println("In Bclass,Aclass acesses,var_nomod = "+a.var_nomod);v1	v2*/
/*v2		b.metd_pub();
		b.metd_nomod();
		b.metd_pro();
//		b.metd_pri();
//		System.out.println("In Bclass,Bclass acesses,var_pri = "+b.var_pri);
		System.out.println("In Bclass,Bclass acesses,var_pro = "+b.var_pro);
		System.out.println("In Bclass,Bclass acesses,var_pub = "+b.var_pub);
		System.out.println("In Bclass,Bclass acesses,var_nomod = "+b.var_nomod);

	}
}v2*/

class Cclass {
	public static void main(String[] args) {
//		Cclass c = new Cclass();
		Aclass a = new Aclass();
		a.metd_pub();
		a.metd_nomod();
		a.metd_pro();
		a.metd_pri();
		System.out.println("In Cclass,Aclass acesses,var_pri = "+a.var_pri);
		System.out.println("In Cclass,Aclass acesses,var_pro = "+a.var_pro);
		System.out.println("In Cclass,Aclass acesses,var_pub = "+a.var_pub);
		System.out.println("In Cclass,Aclass acesses,var_nomod = "+a.var_nomod);
	}
}
	
