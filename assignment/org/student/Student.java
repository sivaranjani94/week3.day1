package week3.day1.assignment.org.student;
import week3.day1.assignment.org.department.*;
public class Student extends Department {
	public void studName() {
	System.out.println("student name_Siva");

	}
public void studentDept() {
		System.out.println("student department_Computer science");

	}
public void studentID() {
	System.out.println("student id_1005");

}
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studName();
		student.studentDept();
		student.studentID();

	}

}
