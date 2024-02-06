package DefaultSorting;

class Student implements Comparable<Student> {
	

	int age;

	Student(int age){
		this.age=age;
	}
	public String toString() {
	return "age : "+age;


	}
	@Override
	public int compareTo(Student s) {
		return this.age-s.age;//-->ascending (return s.age-this.age----> descending)
		
	}
}

//this->current object to be inserted 
//s->ALready existing object


