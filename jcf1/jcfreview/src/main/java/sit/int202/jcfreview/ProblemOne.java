package sit.int202.jcfreview;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProblemOne {
    public static void main(String[] args) {
        //When we have 100 students
        Set<Student> studentSet = new HashSet<>(125, 0.75f);
        //Set<Student> students = new HashSet<>(200,0.5f);
        studentSet.add(new Student(10001,"Somsri",3.25));
        studentSet.add(new Student(10002,"Somsak",3.00));
        studentSet.add(new Student(10009,"Somchai",3.26));
        studentSet.add(new Student(10007,"Somsiri",3.25));
        studentSet.add(new Student(10037,"Sirisopa",3.25));

        for (Student s : studentSet) {
            System.out.println(s + " -> " + s.hashCode()); //non order to put data
        }

        Set<Student> studentSet2 = new TreeSet<>(); //length is not constrains
        studentSet2.add(new Student(10001,"Somsri",3.25));
        studentSet2.add(new Student(10002,"Somsak",3.00));
        studentSet2.add(new Student(10009,"Somchai",3.26));
        studentSet2.add(new Student(10007,"Somsiri",3.25));
        studentSet2.add(new Student(10037,"Sirisopa",3.25));
        System.out.println("*------------------------------------------*");
        for (Student s : studentSet2) {
            System.out.println(s + " -> " + s.hashCode());
        }


        List<Student> tmpList =  studentSet.stream().sorted(Student.SORT_BY_GPAX_DESC/*.reversed()*/).toList();
        System.out.println("*------------------------------------------*");
        for (Student s : tmpList) {
            System.out.println(s + " -> " + s.hashCode());
        }
    }
}
