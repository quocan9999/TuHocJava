package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuyetVaXuLyArrayList {
    static List<Integer> numbers = new ArrayList<>(
            Arrays.asList(5, 12, 7, 20, 3, 18, 10)
    );

    public static void main(String[] args)
    {
        System.out.println("Mảng gốc: " + numbers + "\n");
        // 1. Duyệt bằng for
        System.out.println("Duyệt bằng for");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
        System.out.println("\n");

        // 2. Duyệt bằng enhanced for
        System.out.println("Duyệt bằng enhanced for");
        for (int num : numbers)
        {
            System.out.println(num);
        }
        System.out.println("\n");

        // 3. In các số chẵn
        System.out.println("In các số chẵn");
        for (int num : numbers)
        {
            if (num % 2 == 0)
            {
                System.out.println(num);
            }
        }
        System.out.println("\n");

        // 4. Tính tổng tất cả các phần tử
        System.out.println("Tính tổng tất cả các phần tử");
        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        System.out.println("Tổng tất cả phần tử: " + sum);
        System.out.println("\n");

        // 5. Tìm số lớn nhất
        int max = numbers.get(0);
        for (int num : numbers)
        {
            if (max < num) max = num;
        }
        System.out.println("5. Số lớn nhất trong danh sách là: " + max + "\n");

        // 6. Đếm có bao nhiêu số lớn hơn 10
        int count = 0;
        List<Integer> largerThan10 = new ArrayList<>();
        for (int num : numbers)
        {
            if (num > 10)
            {
                count++;
                largerThan10.add(num);
            }

        }
        System.out.println("6. Có " + count + " số lớn hơn 10 trong danh sách: " + largerThan10);
    }
}
