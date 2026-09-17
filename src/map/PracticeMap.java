package map;
import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
    public static void main(String[] args)
    {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "An");
        students.put(2, "Bình");
        students.put(3, "Cường");
        students.put(4, "Dũng");

        // 1. In toàn bộ danh sách
        System.out.println(students);
        System.out.println("\n");

        // 2. Lấy tên (value) của sinh viên có id = 3
        System.out.println(students.get(3));
        System.out.println("\n");

        // 3. Kiểm tra có key = 5 không
        System.out.println(students.containsKey(5));
        System.out.println("\n");

        // 4. Kiểm tra có value = An không
        System.out.println(students.containsValue("An"));
        System.out.println("\n");

        // 5. Đổi value của key 2 thành Minh
        students.put(2, "Minh");
        System.out.println(students);
        System.out.println("\n");

        // 6. Xoá key = 4
        students.remove(4);
        System.out.println(students);
        System.out.println("\n");

        // 7. Duyệt map bằng entrySet
        for (Map.Entry<Integer, String> entry : students.entrySet())
        {
            System.out.println(
                    "ID: " + entry.getKey() + ", Name: " + entry.getValue()
            );
        }
    }
}
