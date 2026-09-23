import java.util.Scanner;
import model.Student;
import service.StudentManager;
import util.InputHelper;
import java.util.InputMismatchException;
public class Main{
       private static void addStudent(Scanner sc, StudentManager manager) {
              int id=InputHelper.readInt(sc, "Enter ID: ") ;
              sc.nextLine();
              String name=InputHelper.readString(sc, "Enter Name: ");
              int age=InputHelper.readInt(sc, "Enter Age: ");
              sc.nextLine();
              String department=InputHelper.readString(sc ,"Enter Department: ");
              double marks = InputHelper.readDouble(sc, "Enter Marks: ");
              sc.nextLine();
              Student s1=new Student(id,name,age,department,marks);
              manager.addStudentToDatabase(s1);
       }
       private static void updateStudent(Scanner sc, StudentManager manager){
              int id=InputHelper.readInt(sc, "Enter ID to update: ");
              sc.nextLine();
              String name=InputHelper.readString(sc, "Enter new name to update: ");
              int age=InputHelper.readInt(sc ,  "Enter new age to update: ");
              sc.nextLine();
              String dept=InputHelper.readString(sc, "Enter dept_name to update: ");
              double marks=InputHelper.readDouble(sc, "Enter the new marks to update: ");
              Student s1=new Student(id,name,age,dept,marks);
              manager.updateStudentInDatabase(s1);
       }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       StudentManager manager = new StudentManager();
       while(true){
           try{
           System.out.println("......Student Management System......");
           System.out.println("1. Add Student");
           System.out.println("2. Display Students");
           System.out.println("3. Search Student by ID");
           System.out.println("4. Update Student");
           System.out.println("5. Delete Student");
           System.out.println("6. Sort by ID");
           System.out.println("7. Sort by Name");
           System.out.println("8. Sort by Department");
           System.out.println("9. Sort by Age");
           System.out.println("10. Sort by Marks");
           System.out.println("11. Exit");
           System.out.print("Enter Your Choice: ");
              int choice = sc.nextInt();
              switch(choice)  { 
              case 1:addStudent(sc, manager);
                     break;
              case 2:manager.displayStudentsFromDatabase();
                     break;
              case 3:int idd=InputHelper.readInt(sc, "Enter ID to search: ");
                     manager.searchStudentById(idd);
                     break;
              case 4:updateStudent(sc, manager);
                     break;
              case 5:int idToDelete=InputHelper.readInt(sc, "Enter Id of the student to delete: ");
                     manager.deleteStudentFromDatabase(idToDelete);
                     break;
              case 11:System.out.println("Thank you!");
                     sc.close();
                     return;
              case 6:manager.sortById();
                     System.out.println("Students sorted by ID successfully.");
                     break;
              case 7:manager.sortByName();
                     System.out.println("Students sorted by Name successfully.");
                     break;
              case 8:manager.sortByDepartment();
                     System.out.println("Students sorted by Department successfully.");
                     break;
              case 9:manager.sortByAge();
                     System.out.println("Students sorted by Age successfully.");
                     break;
              case 10:manager.sortByMarks();
                     System.out.println("Students sorted by Marks successfully.");
                     break; 
              default:System.out.println("Invalid Choice!");
              }
           }
            catch(InputMismatchException e) {
            System.out.println("Invalid input Entered! Please enter a number.");
            sc.nextLine();
            }
       }
}
}