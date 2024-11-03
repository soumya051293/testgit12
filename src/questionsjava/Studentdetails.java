package questionsjava;


interface Person {
void showDetails();  
}

class Student implements Person {
 private String name;
 private int marks;

 
 public Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 
 public void mark(int newMarks) {
     this.marks = newMarks;
 }

 
 @Override
 public void showDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Marks: " + marks);
 }
}


class Teacher extends Student {
String department;

 
 public Teacher(String name, int marks, String department) {
     super(name, marks);
     this.department = department;
 }

 
 public void department() {
     System.out.println("Teacher Department: " + department);
 }

 
 @Override
 public void showDetails() {
     super.showDetails(); 
  
 }
}


class Principal implements Person {
 private String name;

 
 public Principal(String name) {
     this.name = name;
 }

 
 public void resign() {
     System.out.println(name + " has resigned.");
 }

 
 public void rejoin() {
     System.out.println(name + " has rejoined.");
 }

 
 @Override
 public void showDetails() {
     System.out.println("Principal Name: " + name);
 }
}

public class Studentdetails {

	public static void main(String[] args) {
		

	        
	     Teacher teacher = new Teacher("Susi", 70, "Maths");
	     teacher.showDetails();
	     teacher.department();

	        
	        Principal principal = new Principal("Krishnan");
	        principal.showDetails();
	        principal.resign();
	        principal.rejoin();


	}

}
