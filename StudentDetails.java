import java.util.ArrayList;

class Student {
    String name;
    int marks;

    public Student() {

    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}

public class StudentDetails {

    static void highestScorer(ArrayList<Student> al) {
        Student h = new Student();
        int highest = 0;
        for (Student s : al) {
            if (s.marks > highest) {
                highest = s.marks;
                h = s;
            }
        }
        System.out.println(h.name);
    }

    static void AverageMarks(ArrayList<Student> al) {
        int total = 0;
        int count = al.size();

        for (Student s : al) {
            total += s.marks;
        }

        System.out.println("average: " + (total / count));
    }

    static void failed(ArrayList<Student> al) {
        for (Student s : al) {
            if (s.marks < 40) {
                System.out.println(s.name + ":" + s.marks);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();

        al.add(new Student("kaushik", 45));
        al.add(new Student("harsh", 43));
        al.add(new Student("hemant", 47));
        al.add(new Student("Pravin", 30));

        highestScorer(al);
        AverageMarks(al);
        failed(al);

    }

}
