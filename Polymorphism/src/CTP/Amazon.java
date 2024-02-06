package CTP;

public class Amazon {
	void purchase(int cost) {
		System.out.println("COST : " +cost);

	}
	void purchase(String product) {
		System.out.println("PRODUCT : " +product);

	}
	void purchase(int cost , String product) {
		System.out.println("COST : " +cost + " PRODUCT  :  " + product );

	}
	void purchase(String product, int cost) {
		System.out.println(  " PRODUCT  :  " + product+"COST : " +cost );


	}
}



/** Documentation comment
 * ---------------------------------------------------------------------------
 * method overloading is a process off having multiple methods with the same name but 
but difference in argument
 *--------------------rules-----------------------------------------
 *1.there should be change in argument
 *2.there should be change in the data type of the argument
 *3.There should in change in the order/sequence of the database
 */

