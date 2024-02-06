package Multilevel;

class test {
	public static void main(String[] args) {
		District d = new District();
		System.out.println(d.districtName);
		System.out.println(d.stateName);  
		System.out.println(d.countryName);
		d.electCM();
		d.electPm();
		d.enjoy();
	}
	

}
