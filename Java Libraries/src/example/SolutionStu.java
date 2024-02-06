package example;

public class SolutionStu {
	public static void main(String[] args) {
		Student s1= new Student("anjana",100);
		Student s2 = new Student("aji " , 99);
		Student s3 = new Student("manju",89);
		
		/*
		 * student[] s= new Student[3];
		 * s[0]=s1;
		 * s[1]=s2;
		 * s[2]=s3;
		 */

		Student[]stu = {s1,s2,s3};
		for(int i = 0; i<stu.length;i++) {
			System.out.println(stu[i]);
		}
	}

}
