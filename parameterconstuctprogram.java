package third_program;

public class Parameterconstruct {
	String name ;
	int age ;
	char section ;
	char gender ;
	int subject1;
	int subject2;
	int subject3;
	int t;float s1,s2,s3;
	
	public Parameterconstruct(int a,String n){
		age=a;
		name=n;
		
		
		// TODO Auto-generated constructor stub
	}
	public Parameterconstruct(char s,char g){
		section=s;
		gender=g;
		
		// TODO Auto-generated constructor stub
	}
	
	public Parameterconstruct(int i, int j, int k) {
		subject1=i;
		subject2=j;
		subject3=k;
		s1=(i*100)/300;
		s2=(j*100)/300;
		s3=(k*100)/300;
		t=subject1+subject2+subject3;
		
		// TODO Auto-generated constructor stub
	}
	public void display(){
		System.out.println("subject1:"+subject1+"subject2:"+subject2 +"subject3:"+subject3 );
		System.out.println("totalmarks:"+t+"   "+"out of total subjects:300");
		System.out.println("each students percentage");
		
		System.out.println("s1%:"+s1+"  "+"s2%:"+s2+"  "+"s3%:"+s3 );
		
	}
	public void display2(){
		System.out.println("name:"+name     + "     "+"age:"+age);
		
	}
	public void display3(){
		System.out.println("section:"+section+"      " +"gender:"+gender);
		
	}
	
	public static void main(String[] args) {
		Parameterconstruct l1 = new Parameterconstruct(20,"akhil");
		Parameterconstruct l2 = new Parameterconstruct('B','M');
        Parameterconstruct l3= new Parameterconstruct(90,80,70);
        l1.display2();
        l2.display3();
        l3.display();
		

	}

}
