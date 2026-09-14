package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
    private List<SinhVien> sinhViens = new ArrayList<>();

    public List<SinhVien> getSinhVien()
    {
        return sinhViens;
    }

    public void themSinhVien(int id, String name, double score)
    {
        sinhViens.add(new SinhVien(id, name, score));
    }

    public void timSinhVienTheoID(int id)
    {
        boolean timThay = false;
        for (SinhVien sv : sinhViens)
        {
            if (id == sv.getId())
            {
                System.out.println("Sinh viên có id " + id + " là: " + sv + "\n");
                timThay = true;
            }
        }

        if (!timThay) System.out.println("Không có sinh viên " + id + " trong danh sách\n");
    }

    public SinhVien timSinhVienCoDiemCaoNhat()
    {
        SinhVien svDiemCaoNhat = sinhViens.get(0);
        double maxScore = svDiemCaoNhat.getScore();
        for (SinhVien sv : sinhViens)
        {
            if (maxScore < sv.getScore())
            {
                maxScore = sv.getScore();
                svDiemCaoNhat = sv;
            }
        }
        return svDiemCaoNhat;
    }

    public List<SinhVien> timDSSVDiemHon8(){
        List<SinhVien> dssvCaoHon8 = new ArrayList<>();

        for (SinhVien sv : sinhViens)
        {
            if (sv.getScore() >= 8.0)
            {
                dssvCaoHon8.add(sv);
            }
        }
        return dssvCaoHon8;
    }

    public void capNhatTenTheoID(int id, String name)
    {
        boolean timThay = false;
        for (SinhVien sv : sinhViens)
        {
            if (id == sv.getId())
            {
                sv.setName(name);
                timThay = true;
            }
        }
        if (timThay)
        {
            System.out.println("Đã thay đổi tên sinh viên có id " + id + " thành " + name);
        }
        else
        {
            System.out.println("Không tìm thấy sinh viên có id " + id + " trong danh sách");
        }
    }

    public void xoaSinhVienTheoID(int id)
    {
        boolean timThay = false;
        // Duyệt ngược để tránh bỏ sót phần tử khi xoá
        // Dùng for bình thường để tránh lỗi ConcurrentModificationException khi add/remove phần tử trong loop
        for (int i = sinhViens.size() - 1; i >= 0; i--)
        {
            if (id == sinhViens.get(i).getId())
            {
                sinhViens.remove(i);
                timThay = true;
                break;
            }
        }
        if (timThay) System.out.println("Đã xoá sinh viên có id " + id + "\n");
        else System.out.println("Không tìm thấy sinh viên có id " + id + " trong danh sách\n");
    }
}
