package set.setwithobject;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    };

    @Override
    public String toString()
    {
        return "ID: " + id + " Tên: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;

        return id == student.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    public static void main(String[] args)
    {
        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "An"));
        students.add(new Student(1, "An"));

        System.out.println("Size = " + students.size());
        System.out.println(students);
    }
}
