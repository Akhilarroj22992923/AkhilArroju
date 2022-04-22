Xclass.javaprogram-------------------------------
	
	package secondprogram;

public class Xclass {
	private int j = 50;
	long l = 560;
	protected float f = 3.456f;
	public char c = 'M';
	public void methodPublic(){     // public method
		methodprivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPublic();
	}
	
	void methodDefault(){    //default method
		methodPublic();
	}
	private void methodprivate(){
		System.out.println("private:"+ j);
	}
	

}


Yclass.javaprogram------------------------------------------------
	
	
	package secondprogram;

import second_program.Nclass;

public class Yclass extends Nclass {

	public static void main(String[] args) {
		
		new Nclass().methodPublic();
		new Yclass().methodProtected();
		new Xclass().methodPublic();
		System.out.println("Xclass public value:"+ new Xclass().l);
		System.out.println("Xclass protected value:"+ new Xclass().f);
		System.out.println("Xclass default value:"+ new Xclass().c);
		
		// TODO Auto-generated method stub

	}

}

Zclass.javaprogram-----------------------------------------------
	
	
	package secondprogram;

import second_program.Mclass;

public class Zclass extends Mclass{

	public static void main(String[] args) {
		new Mclass().methodPublic();
		new Zclass().methodprotected();
		new Xclass().methodPublic();
		System.out.println("Xclass public value:"+ new Xclass().l);
		System.out.println("Xclass protected value:"+ new Xclass().f);
		System.out.println("Xclass default value:"+ new Xclass().c);
		
		// TODO Auto-generated method stub

	}

}
