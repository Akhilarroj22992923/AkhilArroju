package fifth_program;

class inheritence {
	int totalprice;
	int id = 78;
	String name = "Amul";
	
	void display(){
		System.out.println("id:"+id+"   "+"name:"+name);
		
	}
}
class inheritence1 extends inheritence {
	int count = 50;
	String category = "butter";
	
	void display1(){
		System.out.println("id:"+id+"   "+"name:"+name);
		System.out.println("count:"+count+"   "+"category:"+category);
	}
	
}
class inheritence2 extends inheritence {
	int count = 90;
	String category = "Milk";
	
	void display2(){
		System.out.println("id:"+id+"   "+"name:"+name);
		System.out.println("count:"+count+"   "+"category:"+category);
	}
	
}
class inheritence3 extends inheritence {
	int count = 56;
	String category = "choco";
	
	void display3(){
		System.out.println("id:"+id+"   "+"name:"+name);
		System.out.println("count:"+count+"   "+"category:"+category);
	}
	
}
class inheritence4 extends inheritence1 {
	int price = 30;
	
	void display4(){
		totalprice = count * price;
		System.out.println("id:"+id+"   "+"name:"+name+"   "+"category:"+category);
		System.out.println("totalprice:"+totalprice);
	}
	
}
class inheritence5 extends inheritence2 {
	int price = 10;
	
	void display5(){
		totalprice = count * price;
		System.out.println("id:"+id+"   "+"name:"+name+"    "+"category:"+category);
		System.out.println("totalprice:"+totalprice);
	}
	
}

public class inheritanceprogram {

	public static void main(String[] args) {
		inheritence4 obj1 = new inheritence4();
		inheritence5 obj2 = new inheritence5();
		inheritence3 obj3 = new inheritence3();
		obj1.display1();
	
		obj2.display2();

		obj3.display3();
		
		obj1.display4();
		obj2.display5();
		
		
		
		// TODO Auto-generated method stub

	}

}
