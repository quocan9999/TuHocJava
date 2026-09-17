package collection;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PracticeCollection {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(7, 2, 9, 2, 1, 5, 2)
        );
        System.out.println("Danh sách gốc: " + numbers);

        // 1. Sắp xếp tăng dần
        Collections.sort(numbers);
        System.out.println("\nDanh sách sau sort: " + numbers);

        // 2. Đảo ngược danh sách
        Collections.reverse(numbers);
        System.out.println("\nDanh sách đảo ngược: " + numbers);

        // 3. Tìm max
        int max = Collections.max(numbers);
        System.out.println("\nMax của danh sách: " + max);

        // 4. Tìm min
        int min = Collections.min(numbers);
        System.out.println("\nMin của danh sách: " + min);

        // 5. Đếm số 2 xuất hiện bao nhiêu lần
        int count = Collections.frequency(numbers, 2);
        System.out.println("\nSố 2 xuất hiện: " + count + " lần");

        // 6. Đổi vị trí phần tử index 0 và 2
        System.out.println("\nDanh sách trước khi đổi: " + numbers);
        Collections.swap(numbers, 0, 2);
        System.out.println("Danh sách sau khi đổi index 0 và 2: " + numbers);

        // 7. Xáo trộn danh sách ngẫu nhiên
        System.out.println("\nDanh sách trước khi xáo trộn: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Danh sách sau khi xáo trộn: " + numbers);


    }
}
