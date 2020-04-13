/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author TRONG
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh() {
      super();
      this.lop = "";
      this.nangKhieu = "";
    }

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
      super(hoTen, tuoi, diaChi, sdt);
      this.lop = lop;
      this.nangKhieu = nangKhieu;
    }

    public void setLop(String lop) { this.lop = lop; }
    public void setNangKhieu(String nangKhieu) { this.nangKhieu = nangKhieu; }
    public String getLop() { return this.lop; }
    public String getNangKhieu() { return this.nangKhieu; }

    @Override
    public String hienThiTT() {
      String thongTin = "";
      thongTin = "ho ten: " + this.hoTen + ", tuoi: " + this.tuoi + ", dia chi: " + this.diaChi
        + ", sdt: " + this.sdt + ", lop: " + this.lop + ", nang khieu: " + this.nangKhieu;

      return thongTin;
    }
    
}
