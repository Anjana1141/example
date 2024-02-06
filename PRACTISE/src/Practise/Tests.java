package Practise;

class SingleInheritance {

	int age = 45;
}
class Sons extends SingleInheritance{
	int sonAge=15;
	
}

class Tests {

	public static void main(String [] args){
		Sons s = new Sons();
		System.out.println("age of father : "+ s.age);
		System.out.println("age of son : " +s.sonAge);

	}
}


