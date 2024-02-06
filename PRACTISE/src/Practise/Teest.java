package Practise;

class Father{
    void bike(){
        System.out.println("fb");
    }
}
class Vv extends Father{
	void bike() {
		System.out.println("ib");
	}
	
}
class Teest{
	public static void main(String[] args) {
		Vv v = new Vv();
		v.bike();
	}
}
