package CTP;

public class Mainclass {
	public static void main(String[] args) {
		Amazon a = new Amazon();

		a.purchase(2000);
		a.purchase("mobile");
		a.purchase("mobile", 300000);
		a.purchase(300000, "mobile");
	}

}
