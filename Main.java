package school.management.system;
import java.util.List;
import java.util.ArrayList;

public class Main
{
 public static void main(String[] args){
     Teacher shivani = new Teacher(1,"Shivani",200);
     Teacher ashu = new Teacher(2,"Ashu",400);
     Teacher komal = new Teacher(3,"Komal",600);
     List<Teacher> teacherList = new ArrayList<>();
     teacherList.add(shivani);
     teacherList.add(ashu);
     teacherList.add(komal);
     
     Student bhavya = new Student(1,"Bhavya",5);
     Student gauri = new Student(2,"Gauri",12);
     Student mishika = new Student(3,"Mishika",7);
     List<Student> studentList = new ArrayList<>();
     studentList.add(bhavya);
     studentList.add(gauri);
     studentList.add(mishika);
     
     School ghs = new School(teacherList,studentList);
     bhavya.payFees(7000);
     System.out.println("ABC has earned $"+ghs.getTotalMoneyEarned());
     
     System.out.println("----Making School Pay Salary----");
     shivani.receiveSalary(shivani.getSalary());
     System.out.println("ABC has spent for salary to "+shivani.getName()+" and now has $"+ghs.getTotalMoneyEarned());
     
     System.out.println(gauri);
     ashu.receiveSalary(ashu.getSalary());
     System.out.println(ashu);
    }
}