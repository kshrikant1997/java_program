package Inheritance;

public class ClassQ extends Classp {
	
		int divideme(int o){
			return o/5;
		}
		ClassQ(){
			System.out.println("I am constructor from CHILD class");
		}
		
		public static void main(String[] args) {
			ClassQ cobj= new ClassQ();
			System.out.println("Division is "+cobj.divideme(515));
			System.out.println("Multiplication is "+cobj.multiplyme(35,25));
			cobj.display();
		}

	}

