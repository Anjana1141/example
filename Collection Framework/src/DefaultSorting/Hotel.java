package DefaultSorting;

public class Hotel implements Comparable<Hotel> {
	
	String name;
	Double rating;
	
	Hotel(String name,double rating){
		this.name=name;
		this.rating=rating;
		
	}
	@Override
	public String toString() {
		return name+" -name "+ " the rating is "+rating;
		
	}
	
	@Override
	public int compareTo(Hotel h) {
		return this.rating.compareTo(h.rating);
		
	}
	

}
