package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonListener;
import modul.ThucDonModul;

public class ThucDonView extends JFrame { 
    private Bill bill;
    private ThucDonModul thucDonModul;

    private JButton jButton_thanhToan;
    public ButtonGroup buttonGroup_chinh;
    public JCheckBox jCheckBox_kimchi;
    public JCheckBox jCheckBox_duaMuoi;
    public JCheckBox jCheckBox_trungChien;
    public JCheckBox jCheckBox_ngoChien;
    public JCheckBox jCheckBox_duaChuot;
    public JCheckBox jCheckBox_mienTron;
    public JCheckBox jCheckBox_cola;
    public JCheckBox jCheckBox_7up;
    public JCheckBox jCheckBox_panta;
    private JLabel jLabel_bill;
    private JButton jButton_hoaDon;
    private JPanel jPanel_bill;

    public ThucDonView() {
        this.thucDonModul = new ThucDonModul();
        this.inIt();
    }

    public void inIt() {
        this.setTitle("THỰC ĐƠN");
        this.setSize(680, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font20 = new Font("Arial", Font.BOLD, 20);
        Font font30 = new Font("Arial", Font.BOLD, 30);
        Font font40 = new Font("Arial", Font.BOLD, 45);


        ThucDonListener thucDonListener = new ThucDonListener(this, bill);



        // Tạo header
        JLabel jLabel_header = new JLabel("THỰC ĐƠN NHÀ HÀNG", JLabel.CENTER);
        jLabel_header.setFont(font40);
        jLabel_header.setBackground(Color.LIGHT_GRAY);
        jLabel_header.setOpaque(true);



        // Tạo Center
        JPanel jPanel_center = new JPanel();


        // Món chính
        JPanel jPanel_chinh = new JPanel();
        JPanel jPanel_chinh_center = new JPanel();

        JRadioButton jRadioButton_com = new JRadioButton("Cơm trộn (20k)");
        jRadioButton_com.setFont(font20);
        jRadioButton_com.setHorizontalAlignment(JRadioButton.CENTER);
        JRadioButton jRadioButton_pho = new JRadioButton("Phở (30k)");
        jRadioButton_pho.setFont(font20);
        jRadioButton_pho.setHorizontalAlignment(JRadioButton.CENTER);
        JRadioButton jRadioButton_bun = new JRadioButton("Bún (25k)");
        jRadioButton_bun.setFont(font20);
        jRadioButton_bun.setHorizontalAlignment(JRadioButton.CENTER);
        JRadioButton jRadioButton_banhMi = new JRadioButton("Bánh mì (25k)");
        jRadioButton_banhMi.setFont(font20);
        jRadioButton_banhMi.setHorizontalAlignment(JRadioButton.CENTER);

        buttonGroup_chinh = new ButtonGroup();
        buttonGroup_chinh.add(jRadioButton_com);
        buttonGroup_chinh.add(jRadioButton_pho);
        buttonGroup_chinh.add(jRadioButton_bun);
        buttonGroup_chinh.add(jRadioButton_banhMi);

        jPanel_chinh_center.setLayout(new GridLayout(2, 2, 0, 25));
        jPanel_chinh_center.add(jRadioButton_banhMi);
        jPanel_chinh_center.add(jRadioButton_pho);
        jPanel_chinh_center.add(jRadioButton_com);
        jPanel_chinh_center.add(jRadioButton_bun);

        JLabel jLabel_chinh = new JLabel("MÓN CHÍNH", JLabel.CENTER);
        jLabel_chinh.setFont(font30);
        
        jPanel_chinh.setLayout(new GridLayout(3, 1));
        jPanel_chinh.add(jLabel_chinh);
        jPanel_chinh.add(jPanel_chinh_center);


        // Món phụ
        JPanel jPanel_phu = new JPanel();
        
        JLabel jLabel_phu = new JLabel("MÓN PHỤ", JLabel.CENTER);
        jLabel_phu.setFont(font30);

        JPanel jPanel_phu_center = new JPanel();

        jCheckBox_kimchi = new JCheckBox("Kimchi (15k)");
        jCheckBox_kimchi.setFont(font20);
        jCheckBox_kimchi.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_duaMuoi = new JCheckBox("Dưa muối (10k)");
        jCheckBox_duaMuoi.setFont(font20);
        jCheckBox_duaMuoi.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_trungChien = new JCheckBox("Trứng chiên (10k)");
        jCheckBox_trungChien.setFont(font20);
        jCheckBox_trungChien.setHorizontalAlignment(JCheckBox.RIGHT);
        jCheckBox_ngoChien = new JCheckBox("Ngô chiên (15k)");
        jCheckBox_ngoChien.setFont(font20);
        jCheckBox_ngoChien.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_duaChuot = new JCheckBox("Dưa chuột (5k)");
        jCheckBox_duaChuot.setFont(font20);
        jCheckBox_duaChuot.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_mienTron = new JCheckBox("Miến trộn (20k)");
        jCheckBox_mienTron.setFont(font20);
        jCheckBox_mienTron.setHorizontalAlignment(JCheckBox.CENTER);

        jPanel_phu_center.setLayout(new GridLayout(2, 3, 0, -20));
        jPanel_phu_center.add(jCheckBox_trungChien);
        jPanel_phu_center.add(jCheckBox_duaMuoi);
        jPanel_phu_center.add(jCheckBox_ngoChien);
        jPanel_phu_center.add(jCheckBox_kimchi);
        jPanel_phu_center.add(jCheckBox_mienTron);
        jPanel_phu_center.add(jCheckBox_duaChuot);

        jPanel_phu.setLayout(new BorderLayout());
        jPanel_phu.add(jLabel_phu, BorderLayout.NORTH);
        jPanel_phu.add(jPanel_phu_center, BorderLayout.CENTER);
        JLabel jLabel_empty_phu = new JLabel();
        jPanel_phu.add(jLabel_empty_phu, BorderLayout.SOUTH);


        // Đồ uống
        JPanel jPanel_doUong = new JPanel();

        JLabel jLabel_doUong = new JLabel("ĐỒ UỐNG", JLabel.CENTER);
        jLabel_doUong.setFont(font30);

        JPanel jPanel_doUong_center = new JPanel();

        jCheckBox_cola = new JCheckBox("Cola (15k)");
        jCheckBox_cola.setFont(font20);
        jCheckBox_cola.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_7up = new JCheckBox("7 UP (15k)");
        jCheckBox_7up.setFont(font20);
        jCheckBox_7up.setHorizontalAlignment(JCheckBox.CENTER);
        jCheckBox_panta = new JCheckBox("Panta (15k)");
        jCheckBox_panta.setFont(font20);
        jCheckBox_panta.setHorizontalAlignment(JCheckBox.CENTER);

        jPanel_doUong_center.setLayout(new GridLayout(1, 3));
        jPanel_doUong_center.add(jCheckBox_cola);
        jPanel_doUong_center.add(jCheckBox_7up);
        jPanel_doUong_center.add(jCheckBox_panta);

        jPanel_doUong.setLayout(new GridLayout(3, 1));
        jPanel_doUong.add(jLabel_doUong);
        jPanel_doUong.add(jPanel_doUong_center);
        JLabel jLabel_empty_doUong = new JLabel();
        jLabel_empty_doUong.setHorizontalAlignment(JLabel.CENTER);
        jPanel_doUong.add(jLabel_empty_doUong);



        // Thêm vào center
        jPanel_center.setLayout(new BorderLayout());
        JPanel jPanel_center_center = new JPanel();
        jPanel_center_center.setLayout(new GridLayout(3, 1));

        jPanel_center_center.add(jPanel_chinh);
        jPanel_center_center.add(jPanel_phu);
        jPanel_center_center.add(jPanel_doUong);

        JLabel jLabel_empty = new JLabel("---------------------", JLabel.CENTER);
        jLabel_empty.setFont(font20);

        jPanel_center.add(jLabel_empty, BorderLayout.NORTH);
        jPanel_center.add(jPanel_center_center, BorderLayout.CENTER);



        // Tạo footer
        JPanel jPanel_footer = new JPanel();


        jPanel_bill = new JPanel();

        jLabel_bill = new JLabel("tổng bill hiển thị ở đây", JLabel.CENTER);
        jLabel_bill.setFont(font20);
        jButton_hoaDon = new JButton("HÓA ĐƠN");
        jButton_hoaDon.setFont(font20);
        jButton_hoaDon.setBackground(Color.RED);
        jButton_hoaDon.setOpaque(true);

        jPanel_bill.setLayout(new GridLayout(1, 2));
        jPanel_bill.add(jLabel_bill);


        jButton_thanhToan = new JButton("THANH TOÁN");
        jButton_thanhToan.addActionListener(thucDonListener);
        jButton_thanhToan.setFont(font30);

        jPanel_footer.setLayout(new GridLayout(1, 2));
        jPanel_footer.add(jPanel_bill);
        jPanel_footer.add(jButton_thanhToan);



        // Thêm vào giao diện chính
        this.setLayout(new BorderLayout());
        this.add(jLabel_header, BorderLayout.NORTH);
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public int getComPrice(){
        return 20000;
    }
    public int getPhoPrice(){
        return 30000;
    }
    public int getBunPrice(){
        return 25000;
    }
    public int getBanhMiPrice(){
        return 25000;
    }
    public int getKimchiPrice(){
        return 15000;
    }
    public int getDuaMuoiPrice(){
        return 10000;
    }
    public int getTrungChienPrice(){
        return 10000;
    }
    public int getNgoChienPrice(){
        return 15000;
    }
    public int getDuaChuotPrice(){
        return 5000;
    }
    public int getMienTronPrice(){
        return 20000;
    }
    public int getColaPrice(){
        return  15000;
    }
    public int get7UpPrice(){
        return 15000;
    }
    public int getPantaPrice(){
        return 15000;
    }

    public void changeTongTien(int tien) {
        this.thucDonModul.changeTongTien(tien);
    }

    public void setTongTien() {
        this.jLabel_bill.setText("Tổng: " + this.thucDonModul.getTongTien());
    }

    public void resetBillPanel() {
        this.jPanel_bill.add(jButton_hoaDon);
    }

    // public String groupChinh_getElements(){
    //     return buttonGroup_chinh.getElements();
    // }
}
