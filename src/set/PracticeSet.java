package set;

import java.util.*;

public class PracticeSet {
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(3, 5, 2, 3, 7, 5, 1)
        );

        // Câu 1. Loại phần tử trùng, không quan tâm thứ tự
        Set<Integer> numHashSet = new HashSet<>(numbers);
        System.out.println(numHashSet);

        // Câu 2. Loại bỏ phần tử trùng nhưng quan tâm thứ tự xuất hiện ban đầu
        Set<Integer> numLinkedHashSet = new LinkedHashSet<>(numbers);
        System.out.println(numLinkedHashSet);

        // Câu 3. Loại bỏ phần tử trùng và sắp xếp tăng dần
        Set<Integer> numTreeSet = new TreeSet<>(numbers);
        System.out.println(numTreeSet);

        // Câu 4. Kiểm tra set có chứa số 5 không
        boolean checkNumHashSet = numHashSet.contains(5);
        System.out.println(checkNumHashSet);
        boolean checkNumLinkedHashSet = numLinkedHashSet.contains(5);
        System.out.println(checkNumLinkedHashSet);
        boolean checkNumTreeSet = numTreeSet.contains(5);
        System.out.println(checkNumTreeSet);

        // Câu 5. Xoá số 3 bằng remove
        numHashSet.remove(3);
        numLinkedHashSet.remove(3);
        numTreeSet.remove(3);
        System.out.println(numHashSet);
        System.out.println(numLinkedHashSet);
        System.out.println(numTreeSet);
    }
}
