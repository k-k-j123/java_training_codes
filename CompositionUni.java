import java.util.*;

class Course {
    String name;
    int credits;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
}

class Professor {
    ArrayList<Course> courses = new ArrayList<>();
    String name;

    public Professor(String name) {
        this.name = name;
    }

    void addCourse(Course c) {
        courses.add(c);
    }

    void printCourse(Professor p) {
        System.out.println();
        System.out.print("   Courses: ");
        for (Course c : p.courses) {
            System.out.print(c.name + ", ");
        }
        System.out.println("\n");
    }
}

class Department {
    String name;
    ArrayList<Professor> professors = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    void addProfessor(Professor p) {
        professors.add(p);
    }

    void printProf() {
        
        System.out.println("\n\nProfessors in the Departemnt : \n");
        for (Professor p : professors) {
            System.out.print(p.name);
            if(p.courses.size() == 0){
                System.out.println("\t\nNo courses assigned yet");
                continue;
            }
                p.printCourse(p);
        }
        System.out.println("\n---------------------------------");
        
    }

}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void printDepartemnt() {
        System.out.println("\n******************************");
        System.out.println("\nDepartments in the university : " + name);
        for (Department d : departments) {
            System.out.print("\nDepartment Name: " + d.name);
            d.printProf();
        }
       
    }
}

public class CompositionUni {
    public static void main(String args[]) {
        // create the Courses
        Course java = new Course("Java Programming", 4);
        Course AI = new Course("Artificial Intelligence", 5);
        Course dbms = new Course("Database Management Systems", 3);
        Course DS = new Course("Data Science", 4);
        Course ML = new Course("Machince Learning", 4);

        // create professor and assign Courses
        Professor p1 = new Professor("Dr.Sharma");
        p1.addCourse(java);
        p1.addCourse(dbms);

        Professor p2 = new Professor("Dr.Mehta");
        p2.addCourse(AI);

        Professor p3 = new Professor("Dr.Verma");
        p3.addCourse(ML);
        p3.addCourse(DS);

        // create Department adn assign Professor
        Department d1 = new Department("Computer Science");
        d1.addProfessor(p1);
        d1.addProfessor(new Professor("Dr.Kaushik"));

        Department d2 = new Department("Aritifcial Intelligence and Machince Learning");
        d2.addProfessor(p2);
        d2.addProfessor(p3);

        Department d3 = new Department("Data Science");
        d3.addProfessor(p3);

        // d1.printProf();
        // d2.printProf();
        // d3.printProf();

        // create university and add department
        University u1 = new University("DYP");
        u1.addDepartment(d1);
        u1.addDepartment(d2);
        u1.addDepartment(d3);

        u1.printDepartemnt();

    }
}
