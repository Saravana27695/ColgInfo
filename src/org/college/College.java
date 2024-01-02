package org.college;

public class College {
	private void collegeName() {
		System.out.println("greens institute");

	}
private void collegeCode() {
	System.out.println("1108");

}
private void collegeRank() {
	System.out.println("2nd Rank");

}
public static void main(String[] args) {
	College c=new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	Student s=new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	Hostel h=new Hostel();
	h.hostelName();
	Dept d=new Dept();
	d.deptName();
}
}
