// Bài tập ArrayList với Object
package quanlysinhvien;
import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        QuanLySinhVien ql = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);

        // 1. Thêm 5 sinh viên
        ql.themSinhVien(1, "An", 9);
        ql.themSinhVien(2, "Bình", 8);
        ql.themSinhVien(3, "Cường", 7);
        ql.themSinhVien(4, "Dũng", 7.5);
        ql.themSinhVien(5, "Đạt", 8.5);

        // 2. In danh sách sinh viên
        System.out.println("Danh sách sinh viên: " + ql.getSinhVien() + "\n");
        System.out.println("==================================================\n");

        // 3. Tìm sinh viên theo id
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        sc.nextLine();
        ql.timSinhVienTheoID(id);
        System.out.println("==================================================\n");

        // 4. Tìm sinh viên có điểm cao nhất
        if (ql.timSinhVienCoDiemCaoNhat() == null)
        {
            System.out.println("Không có sinh viên nào trong danh sách");
        }
        else
        {
            System.out.println("Sinh viên có điểm cao nhất trong danh sách: " + ql.timSinhVienCoDiemCaoNhat() + "\n");
        }

        System.out.println("==================================================\n");

        // 5. Tìm tất cả sinh viên có điểm >= 8
        System.out.println("Danh sách sinh viên có điểm cao hơn hoặc bằng 8: " + ql.timDSSVDiemHon8() + "\n");
        System.out.println("==================================================\n");

        // 6. Cập nhật sinh viên theo id
        System.out.println("Nhập id sinh viên cần cập nhật tên: ");
        int idCapNhat = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên cần thay đổi: ");
        String tenThayDoi = sc.nextLine();
        ql.capNhatTenTheoID(idCapNhat, tenThayDoi);
        System.out.println("Danh sách sinh viên hiện tại: " + ql.getSinhVien() + "\n");
        System.out.println("==================================================\n");

        // 7. Xoá sinh viên theo id
        System.out.println("Nhập id sinh viên cần xoá: ");
        int idCanXoa = sc.nextInt();
        sc.nextLine();
        ql.xoaSinhVienTheoID(idCanXoa);
        System.out.println("Danh sách sinh viên hiện tại: " + ql.getSinhVien() + "\n");
    }
}
