package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class BaiTapArrayList {
   static List<Integer> numbers = new ArrayList<>();

   public static void main(String[] args)
   {
       // 1. Thêm các số 10, 20, 30, 40, 50 vào danh sách
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(40);
       numbers.add(50);
       System.out.println("1. Mảng gốc:");
       System.out.println(numbers + "\n");

       // 2. In phần tử tại index 2
       int phanTuI2 = numbers.get(2);
       System.out.println("2. In phần tử tại index 2");
       System.out.println(phanTuI2 + "\n");

       // 3. Đổi phần tử tại index 1 thành 25
       numbers.set(1, 25);
       System.out.println("3. Đổi phần tử tại index 1 thành 25");
       System.out.println(numbers + "\n");

       // 4. Xoá phần tử tại index 3.
       numbers.remove(3);
       System.out.println("4. Xoá phần tử tai index 3");
       System.out.println(numbers + "\n");

       // 5. In ra số lượng phần tử
       int soLuongPhanTu = numbers.size();
       System.out.println("5. Danh sách hiện tại: " + numbers);
       System.out.println("In ra số lượng phần tử: " + soLuongPhanTu + "\n");

       // 6. Kiểm tra danh sách có chứa 30 hay không
       System.out.println("Kiểm tra danh sách có phần tử 30?");

       if (numbers.contains(30))
       {
           System.out.println("Danh sách có chứa phần tử 30\n");
       }
       else
       {
           System.out.println("Danh sách không chứa phần tử 30\n");
       }

       // 7. Tìm index của phần tử 50
       System.out.println("7. Tìm index của phần tử 50");
       System.out.println(numbers);
       if (numbers.indexOf(50) == -1)
       {
           System.out.println("Danh sách không có phần tử 50");
       }
       else
       {
           System.out.println("Index của phần tử 50: " + numbers.indexOf(50));
       }
   }
}
