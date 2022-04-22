Mclass.javaprogram-----------------------------------------------------------------------


package second_program;

public class Mclass {
	
	private int j = 50;
	long l = 560;
	protected float f = 3.456f;
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodprotected(){ // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){
		System.out.println("Mclass:methodprivate"+ j);
	}

}


Nclass.javaprogram-----------------------------------------------------------------------------------------
	
	package second_program;

public class Nclass {
	protected long k = 1000;
	public int s = 6;
	double d = 245;
	
	public void methodPublic(){     // public method
		System.out.println("Nclass:methodpublic");
	}
	
	protected void methodProtected(){   // protected method
		System.out.println("Nclass:methodprotected");
	}
	
	void methodDefault(){    //default method
		System.out.println("Nclass:methoddefault");
	}
	
	private void methodPrivate(){
		System.out.println("Nclass:methodprivate");
	}

}


Pclass.javaprogram---------------------------------------------------------------------------------------------------------------
	
	package second_program;

public class Pclass {
	
	public void methodPublic(){     // public method
		System.out.println("pclass:methodpublic");
	}
	
	protected void methodProtected(){   // protected method
		System.out.println("pclass:methodprotected");
	}
	
	void methodDefault(){    //default method
		System.out.println("pclass:methoddefault");
	}
	
	private void methodPrivate(){
		System.out.println("pclass:methodprivate");

}

	public static void main(String[] args) {
		new Mclass().methodPublic();
		System.out.println("default M value: "+ new Mclass().l);
		System.out.println("protected M value: "+ new Mclass().f);
		System.out.println("protected N value:"+ new Nclass().k);
		System.out.println("public Nvalue: "+ new Nclass().s);
		System.out.println("default N value: "+ new Nclass().d);
		// TODO Auto-generated method stub
	}

}


