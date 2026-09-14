package quanlysinhvien;

public class SinhVien {
    private int id;
    private String name;
    private double score;

    public SinhVien(){};
    public SinhVien(int id, String name, double score)
    {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getScore()
    {
        return score;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + ", Name: " + name + ", Score: " + score;
    }
}
