package com;



class Hotel {
	/**
	 * factory design pattern is a process of returning different types of object
	 * ---we achieve factory design pattern by having generalized return type
	 * ---if the return type was idly the method can return only idly object
	 * (specialization)likewise for other objects.
	 * ---therefore if the return type is food, the method can return either idly,
	 * biryani or dosa object (Generalization)
	 * 
	 */
	static Food  orderFood(int choice) {
		if (choice == 1) {
			Food i = new Idly();//return new Idly()
			//System.out.println("delivering idly");
			return i;
		}
		else if (choice==2) {
			Food b = new Biryani();
			return b;
		}
		else if(choice ==3) {
			Food d=new Dosa();
			return d;
		}
		else {
			return null;

		}


	}
	public static void main(String[] args) {
		
		Food obj= orderFood(2);
		if(obj instanceof Idly) {
			System.out.println("eating idli");
		}
		else if (obj instanceof Biryani) {
			System.out.println("eating briyani");
		}
		else if(obj instanceof Dosa) {
			System.out.println("eating dosa");
		}
		else {
			System.out.println("invalid counter");
		}

	}
}
