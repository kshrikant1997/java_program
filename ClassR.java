package Inheritance;

public class ClassR extends Classp {
	String Printme(String p){
		return p;
	}

	public static void main(String[] args) {
		ClassR gobj= new ClassR();
		gobj.p=55;
		System.out.println("Print "+gobj.p);
		System.out.println("Print Name "+gobj.multiplyme(15, 16));
		//gobj.divideme(30);
		
	
	}


}
