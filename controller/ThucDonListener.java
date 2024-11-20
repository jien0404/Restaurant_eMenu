package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

import view.Bill;
import view.ThucDonView;

public class ThucDonListener implements ActionListener{
    private ThucDonView thucDonView;



    public ThucDonListener(ThucDonView thucDonView, Bill bill) {
        this.thucDonView = thucDonView;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Enumeration <AbstractButton> buttons_chinh = thucDonView.buttonGroup_chinh.getElements();
        String monChinh = "";
        String src = e.getActionCommand();

        if (src.equals("THANH TOÁN")) {
        while (buttons_chinh.hasMoreElements()) {
            AbstractButton b = buttons_chinh.nextElement();
            if (b.isSelected()) {
                monChinh = b.getText();
            }
        }
        if (monChinh.equals("Cơm trộn (20k)")) {
            thucDonView.changeTongTien(thucDonView.getComPrice());
        } else if (monChinh.equals("Phở (30k)")) {
            thucDonView.changeTongTien(thucDonView.getPhoPrice());
        } else if (monChinh.equals("Bún (25k)")) {
            thucDonView.changeTongTien(thucDonView.getBunPrice());
        } else if (monChinh.equals("Bánh mì (25k)")) {
            thucDonView.changeTongTien(thucDonView.getBanhMiPrice());
        }

        if (thucDonView.jCheckBox_kimchi.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getKimchiPrice());
        }
        if (thucDonView.jCheckBox_duaMuoi.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getDuaMuoiPrice());
        }
        if (thucDonView.jCheckBox_trungChien.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getTrungChienPrice());
        }
        if (thucDonView.jCheckBox_ngoChien.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getNgoChienPrice());
        }
        if (thucDonView.jCheckBox_duaChuot.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getDuaChuotPrice());
        }
        if (thucDonView.jCheckBox_mienTron.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getMienTronPrice());
        }

        if (thucDonView.jCheckBox_cola.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getColaPrice());
        }
        if (thucDonView.jCheckBox_7up.isSelected()) {
            thucDonView.changeTongTien(thucDonView.get7UpPrice());
        }
        if (thucDonView.jCheckBox_panta.isSelected()) {
            thucDonView.changeTongTien(thucDonView.getPantaPrice());
        }

        thucDonView.setTongTien();
        thucDonView.resetBillPanel();
    }
    }
}
