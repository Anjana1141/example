package org;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int a = 10;
		double b = 1.2;
		
		ArrayList l = new ArrayList();
		l.add(a);//l.add(new Integer(10));
		l.add(b);//l.add(new Integer(1.2));
		l.add('A');//l.add(new Character('A');
		
		for(Object i : l) {
			System.out.println(i);
	}

}
}


/**
to traverse heterogenous Objects , we should use Object Type reference.8
**/