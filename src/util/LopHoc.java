/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import interfacee.IQLDS;
import java.util.ArrayList;
/**
 *
 * @author TRONG
 */
public class LopHoc {
    private GiaoVien giaoVienCN = null;
    private ArrayList<CaNhan> dsHocSinh = null;
    private ArrayList<CaNhan> dsGVGD = null;
    
    private IQLDS qlDsGVGD = null;
    private IQLDS qlDsHS = null;


    public  LopHoc() {
        this.giaoVienCN = new GiaoVien();
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }

    public LopHoc(GiaoVien gvChuNhiem) {
        this.giaoVienCN = gvChuNhiem;
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }

    public void setGiaoVienCN(GiaoVien giaoVienCN) { this.giaoVienCN = giaoVienCN; } 
    public GiaoVien getGiaoVienCN() { return giaoVienCN; }
    
    public int themHocSinh(HocSinh hs) {
      if (qlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }

    public int themGVGD(GiaoVien gv) {
      if (qlDsGVGD.them(gv) == 1) {
        return 1;
      }
      return 0;
    }

    public int inDSHS() {
        System.out.println("ds hoc sinh:");
        qlDsHS.inDS();

        return 1;
    }

    public int inDSGVGD() {
        System.out.println("ds giao vien:");
        qlDsGVGD.inDS();

        return 1;
    }
}
