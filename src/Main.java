import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        StudentIntrf studentIntrf = new StudentImpl();

        String username = "admin";
        String password = "admin";

        System.out.print("Enter user name: ");
        String uname = input.next();
        System.out.print("Enter password: ");
        String pword = input.next();

        if(uname.equals(username) && pword.equals(password)){
            System.out.println("login Success!!..\n");
            showMenu();
        }else{
            System.out.println("Try again..");
        }
    }

    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        StudentIntrf studentIntrf = new StudentImpl();

        do {
            System.out.println("\n 01. Add Student     02. Add Course      03. Show All Students   04. Update Students     " +
                    "05. Delete Student     06. Exit");
            System.out.print("\n Select the option: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    student = createStudent(student);
                    studentIntrf.createStudent(student);
                    break;
                case 2:
                case 3:
                    studentIntrf.showAllStudents();
                    break;
                case 4:
                    System.out.println("Enter Student ID to update:  ");
                    int id = input.nextInt();
                    student = updateStudentDetails(student);
                    studentIntrf.updateStudent(student, id);
                    break;
                case 5:
                    System.out.println("Enter Student ID to delete:  ");
                    id = input.nextInt();
                    studentIntrf.deleteStudent(id);
                    break;
                case 6:
                    System.out.println("Thank you....");
                    System.exit(0);
                default:
                    System.out.println("Invalid Entry..");
            }
        }while(true);
    }

    public static Student createStudent( Student student){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter Student ID: ");
        int id = input.nextInt();
        System.out.print("Enter Student name: ");
        String name = input.next();
        System.out.print("Enter student age: ");
        int age = input.nextInt();
        System.out.print("Enter address: ");
        String address = input.next();
        System.out.print("Enter contact: ");
        int contact = input.nextInt();

        student.setStudentID(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        student.setContact(contact);

        return student;
    }

    public static Student updateStudentDetails(Student student){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student new name: ");
        String name = input.next();
        System.out.print("Enter student new age: ");
        int age = input.nextInt();
        System.out.print("Enter new address: ");
        String address = input.next();
        System.out.print("Enter new contact: ");
        int contact = input.nextInt();

        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        student.setContact(contact);

        return student;
    }

}
