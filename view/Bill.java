package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modul.ThucDonModul;

public class Bill extends JFrame{
    private ThucDonModul thucDonModul;

    private JLabel jLabel_comTron = new JLabel("Cơm trộn", JLabel.LEFT);
    private JLabel jLabel_comTron_price = new JLabel("20.000", JLabel.RIGHT);
    private JLabel jLabel_pho = new JLabel("Phở", JLabel.LEFT);
    private JLabel jLabel_pho_price = new JLabel("30.000", JLabel.RIGHT);
    private JLabel jLabel_bun = new JLabel("Bún", JLabel.LEFT);
    private JLabel jLabel_bun_price = new JLabel("25.000", JLabel.RIGHT);
    private JLabel jLabel_banhMi = new JLabel("Bánh mì", JLabel.LEFT);
    private JLabel jLabel_banhMi_price = new JLabel("25.000", JLabel.RIGHT);
    private JLabel jLabel_kimchi = new JLabel("Kimchi", JLabel.LEFT);
    private JLabel jLabel_kimchi_price = new JLabel("15.000", JLabel.RIGHT);
    private JLabel jLabel_duaMuoi = new JLabel("Dưa muối", JLabel.LEFT);
    private JLabel jLabel_duaMuoi_price = new JLabel("10.000", JLabel.RIGHT);
    private JLabel jLabel_trungChien = new JLabel("Trứng chiên", JLabel.LEFT);
    private JLabel jLabel_trungChien_price = new JLabel("10.000", JLabel.RIGHT);
    private JLabel jLabel_ngoChien = new JLabel("Ngô chiên", JLabel.LEFT);
    private JLabel jLabel_ngoChien_price = new JLabel("15.000", JLabel.RIGHT);
    private JLabel jLabel_duaChuot = new JLabel("Dưa chuột", JLabel.LEFT);
    private JLabel jLabel_duaChuot_price = new JLabel("5.000", JLabel.RIGHT);
    private JLabel jLabel_mienTron = new JLabel("Miến trộn", JLabel.LEFT);
    private JLabel jLabel_mienTron_price = new JLabel("20.000", JLabel.RIGHT);
    private JLabel jLabel_cola = new JLabel("Cola", JLabel.LEFT);
    private JLabel jLabel_cola_price = new JLabel("15.000", JLabel.RIGHT);
    private JLabel jLabel_7Up = new JLabel("7 Up", JLabel.LEFT);
    private JLabel jLabel_7Up_price = new JLabel("15.000", JLabel.RIGHT);
    private JLabel jLabel_panta = new JLabel("Panta", JLabel.LEFT);
    private JLabel jLabel_panta_price = new JLabel("15.000", JLabel.RIGHT);
    private JPanel jPanel_center;
    private JLabel jLabel_tongBill;

    public Bill(){
        this.thucDonModul = new ThucDonModul();
        this.inIt();
    }

    public void inIt(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bill");
        this.setSize(680, 750);
        this.setLocationRelativeTo(null);

        Font font20 = new Font("Arial", Font.BOLD, 20);
        Font font40 = new Font("Arial", Font.BOLD, 40);

        this.setLayout(new BorderLayout());
        
        JPanel jPanel_header = new JPanel();
        JLabel jLabel_hoaDon = new JLabel("HÓA ĐƠN", JLabel.CENTER);
        jLabel_hoaDon.setFont(font40);
        JLabel jLabel_empty = new JLabel("-----------------", JLabel.CENTER);
        jLabel_empty.setFont(font20);
        jPanel_header.setLayout(new GridLayout(2, 1));
        jPanel_header.add(jLabel_hoaDon);
        jPanel_header.add(jLabel_empty);

        // jLabel_comTron = new JLabel("Cơm trộn", JLabel.LEFT);
        // jLabel_comTron_price = new JLabel("20.000", JLabel.RIGHT);


        jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(20, 2));


        JPanel jPanel_footer = new JPanel();
        JLabel jLabel_tong = new JLabel("Tổng:", JLabel.CENTER);
        jLabel_tong.setFont(font40);
        jLabel_tongBill = new JLabel();
        jLabel_tongBill.setFont(font40);
        jLabel_tongBill.setHorizontalAlignment(JLabel.CENTER);
        jPanel_footer.setLayout(new GridLayout(1, 2));
        jPanel_footer.add(jLabel_tong);
        jPanel_footer.add(jLabel_tongBill);

        this.add(jPanel_header, BorderLayout.NORTH);
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public void setTextTongBill(String s){
        this.jLabel_tongBill.setText(s);
    }

    public void addCom(){
        jPanel_center.add(jLabel_comTron);
        jPanel_center.add(jLabel_comTron_price);
    }
    public void addPho(){
        jPanel_center.add(jLabel_pho);
        jPanel_center.add(jLabel_pho_price);
    }
    public void addBun(){
        jPanel_center.add(jLabel_bun);
        jPanel_center.add(jLabel_bun_price);
    }
    public void addBanhMi(){
        jPanel_center.add(jLabel_banhMi);
        jPanel_center.add(jLabel_banhMi_price);
    }
    public void addKimchi(){
        jPanel_center.add(jLabel_kimchi);
        jPanel_center.add(jLabel_kimchi_price);
    }
    public void addDuaMuoi(){
        jPanel_center.add(jLabel_duaMuoi);
        jPanel_center.add(jLabel_duaMuoi_price);
    }
    public void addTrungChien(){
        jPanel_center.add(jLabel_trungChien);
        jPanel_center.add(jLabel_trungChien_price);
    }
    public void addNgoChien(){
        jPanel_center.add(jLabel_ngoChien);
        jPanel_center.add(jLabel_ngoChien_price);
    }
    public void addDuaChuot(){
        jPanel_center.add(jLabel_duaChuot);
        jPanel_center.add(jLabel_duaChuot_price);
    }
    public void addMienTron(){
        jPanel_center.add(jLabel_mienTron);
        jPanel_center.add(jLabel_mienTron_price);
    }
    public void addCola(){
        jPanel_center.add(jLabel_cola);
        jPanel_center.add(jLabel_cola_price);
    }
    public void add7Up(){
        jPanel_center.add(jLabel_7Up);
        jPanel_center.add(jLabel_7Up_price);
    }
    public void addPanta(){
        jPanel_center.add(jLabel_panta);
        jPanel_center.add(jLabel_panta_price);
    }


    public void setBill() {
        this.jLabel_tongBill.setText(thucDonModul.getTongTien() + "");
    }

    // public static void main(String[] args) {
    //     new Bill();
    // }
}
