package linkedlist;

import java.util.LinkedList;

public class BaiTapLinkedList {
    private LinkedList<String> names = new LinkedList<>();

    @Override
    public String toString()
    {
        return names.toString();
    }

    public void addFirst(String name)
    {
        names.addFirst(name);
    }

    public void addLast(String name)
    {
        names.addLast(name);
    }

    public String getFirst()
    {
        return names.getFirst();
    }

    public String getLast(){
        return names.getLast();
    }

    public void removeFirst(){
        names.removeFirst();
    }

    public void removeLast(){
        names.removeLast();
    }

    public static void main(String[] args)
    {
        BaiTapLinkedList list = new BaiTapLinkedList();

        // 1. Thêm đầu và cuối
        System.out.println("==========================================");
        System.out.println("1. Thêm đầu và cuối");
        list.addFirst("Minh");
        list.addLast("Phong");
        System.out.println("Danh sách hiện tại: " + list);
        System.out.println("==========================================");

        // 2. Lấy đầu và cuối
        System.out.println("2. Lấy phần tử đầu và cuối");
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        System.out.println("==========================================");

        // 3. Xoá phần tử ở đầu và cuối
        System.out.println("3. Xoá phần tử đầu và cuối");
        list.removeFirst();
        list.removeLast();
        System.out.println("Danh sách sau khi xoá đầu và cuối: " + list);
        System.out.println("==========================================");
    }
}
