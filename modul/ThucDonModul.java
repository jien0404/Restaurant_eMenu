package modul;

public class ThucDonModul {
    private String monChinh;
    private String monPhu;
    private int tongTien;
    public ThucDonModul() {
        this.monChinh = "";
        this.monPhu = "";
        this.tongTien = 0;
    }
    public String getMonChinh() {
        return monChinh;
    }
    public void setMonChinh(String monChinh) {
        this.monChinh = monChinh;
    }
    public String getMonPhu() {
        return monPhu;
    }
    public void setMonPhu(String monPhu) {
        this.monPhu = monPhu;
    }
    public int getTongTien() {
        return tongTien;
    }
    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public void changeTongTien(int tien) {
        tongTien += tien;
    }
}
