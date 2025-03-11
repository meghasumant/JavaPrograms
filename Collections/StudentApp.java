import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentApp {
	static Scanner sc;
	static ArrayList<Student> studentlist;
	
	public static void addstudent() {
		int r,f,p;
		String n,a,e,m,c;
		System.out.println("Enter the students roll number ");
		r=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the students name ");
		n=sc.nextLine();
		
		
		System.out.println("Enter the student address:");
        a = sc.nextLine();
 
        System.out.println("Enter the student email:");
        e = sc.nextLine();
 
        System.out.println("Enter the student mobile:");
        m = sc.nextLine();
 
        System.out.println("Enter the student course:");
        c = sc.nextLine();
 
        System.out.println("Enter the student fees:");
        f = sc.nextInt();
 
        System.out.println("Enter the student pending fees:");
        p = sc.nextInt();
 
		Student s1 = new Student(r,n,a,e,m,c,f,p);
		studentlist.add(s1);
	}
	public static void main(String[] args) {
		int opt=0;
		studentlist = new ArrayList();
		sc = new Scanner(System.in);
		do {
			System.out.println("1. Add a new Student ");
			System.out.println("2. Show all students ");
			System.out.println("3. Delete any student ");
			System.out.println("4. Update student details ");
			System.out.println("5. Show total pending fees ");
			System.out.println("6. Show total paid fees ");
			System.out.println("7. Show list of Java course students");
			System.out.println("8. Show Python students list ");
			System.out.println("9. Show all students living in Pune");
			System.out.println("10. Exit ");
			System.out.println("Enter your option ");
			opt=sc.nextInt();
			switch(opt) {
			case 1:addstudent();
					break;
			case 2:showstudents();
					break;
			case 3: deletestudent();
					break;
			case 4: updatestudent();
					break;
			case 7: showjavastudents();
					break;
			}
		}while(opt!=10);
	}
	private static void showjavastudents() {
		for(Student s1 : studentlist) {
			if(s1.getCourse().contains("java")) {
				//System.out.println(s1);
				System.out.println(s1.getRoll() + "  "+ s1.getName());
			}
		}
		
	}
	private static void updatestudent() {
		System.out.println("Enter the roll number of student to update ");
		int r = sc.nextInt();
		
		sc.nextLine();
		
		int f,p;
		String n,a,e,m,c;
		for(Student s : studentlist) {
			if(s.getRoll() == r) {
				//updation functionality
				System.out.println("Enter the students updated name ");
				s.setName(sc.nextLine());
				
				System.out.println("Enter the student updated address:");
		        s.setAddress(sc.nextLine());
		 
		        System.out.println("Enter the student updated email:");
		        s.setEmail(sc.nextLine());
		 
		        System.out.println("Enter the student updated mobile:");
		        m = sc.nextLine();
		        s.setMobile(m);
		 
		        System.out.println("Enter the student updated course:");
		        c = sc.nextLine();
		        s.setCourse(c);
		        
		        System.out.println("Enter the student updated fees:");
		        f = sc.nextInt();
		        s.setFees(f);
		        
		        System.out.println("Enter the student updated pending fees:");
		        p = sc.nextInt();
		        s.setPendingfees(p);
		        System.out.println("The student data is updated");
			}
		}
		
	}
	private static void deletestudent() {
		System.out.println("Enter the roll number of student to delete ");
		int r = sc.nextInt();
		/*Iterator i1 = studentlist.iterator();
		while(i1.hasNext()) {
			Student s1 = (Student) i1.next();
			if(s1.roll==r) {
				i1.remove();
				System.out.println("The Student is deleted");
			}
		}*/
		for(Student s : studentlist) {
			if(s.getRoll() == r) {
				studentlist.remove(s);
				System.out.println("The student is deleted");
			}
		}
		
	}
	public static void showstudents() {
		//System.out.println(studentlist);
		/*for(Student s1 : studentlist) {
			System.out.println(s1);
		}*/ 
		System.out.println("\n Roll   Name    Address    Email   Mobile   Course   Fees paid  Pending Fees ");
		System.out.println("\n------------------------------------------------------------------------------");
		Iterator<Student> i1 = studentlist.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
