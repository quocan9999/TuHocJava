package map.mapwithobject;

import java.util.HashMap;
import java.util.Objects;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    };

    @Override
    public String toString()
    {
        return " ID: " + id + ", Tên: " + name + ", Điểm: " + score;
    }

    public int getId()
    {
        return id;
    }

    public static void main(String[] args)
    {
        Map<Integer, Student> students = new HashMap<>();

        Student s1 = new Student(1, "An", 8.5);
        Student s2 = new Student(2, "Bình", 7.5);

        students.put(s1.getId(), s1);
        students.put(s2.getId(), s2);

        System.out.println("Size = " + students.size());
        System.out.println(students);

        // Tìm nhanh sinh viên có id/key = 2
        Student student = students.get(2);
        System.out.println(student);
    }
}
