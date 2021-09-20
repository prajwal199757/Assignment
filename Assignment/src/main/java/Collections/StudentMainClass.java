package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StudentMainClass {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "prajwal", "Bangalore"));
        students.add(new Student(2, "sagar", "Banglore"));
        students.add(new Student(3, "sachin", "Hyderabad"));
        students.add(new Student(4, "ajit", "Chennai"));
        students.add(new Student(5, "bharat", "Chennai"));
        students.add(new Student(6, "prakash", "Pune"));

        /** Display all the students **/
        for (Student st : students) {
            System.out.println(st);
        }
        /** students in a particular city **/
        System.out.println(students.stream().filter(s -> s.getName().equals("Bangalore")));

        /** sorted by Name using collection **/
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorted by Name" + students);

        /** sorted by city using collection **/

        Collections.sort(students, (t1, t2) -> t1.getCity().compareTo(t2.getCity()));
        System.out.println("After sorted by city " + students);

        /** find By id using collections **/
        System.out.println("found by ID " + students.stream().filter(s -> s.getId() == 3).collect(Collectors.toList()).get(0));


    }
}
