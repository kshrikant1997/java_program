package Inheritance;

public class Classp {
	int p,q;
	void display(){
		int x;
		x=(p+q)*(p-q);
		System.out.println("Answer is "+x);
	}
	int multiplyme(int k,int p){
		return k*p;
	}
	Classp(){
		p=20;q=15;
		System.out.println("I am Constructor from PARENT class");
	}
	Classp(int y){
		p=20;q=15;
		System.out.println("I am another cunstructor" + y);
	}
	public static void main(String[] args) {
		Classp obj= new Classp();
		obj.display();
	}

}
