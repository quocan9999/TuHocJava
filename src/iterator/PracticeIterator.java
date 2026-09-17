package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PracticeIterator {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 12, 7, 20, 3, 18, 10)
        );

        Iterator<Integer> iterator = numbers.iterator();

        // 1. Dùng Iterator để in toàn bộ phần tử
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("\n");

        // 2. Dùng Iterator để xoá tất cả các số chẵn
        iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            int number = iterator.next();

            if (number % 2 == 0)
            {
                iterator.remove();
            }
        }

        // 3. In danh sách sau xoá dùng Iterator
        iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
