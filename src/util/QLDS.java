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
public class QLDS implements IQLDS {
    private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
    @Override
    public int them(CaNhan cn) {
      dsCaNhan.add(cn);
      return 1;
    }

    @Override
    public int xoa(String ten) {
      if (dsCaNhan.removeIf(cn -> cn.hoTen.equals(ten))) {
        return 1;
      }
      return 0;
    }

    @Override
    public void inDS() {
      dsCaNhan.forEach(cn -> System.out.println(cn.hienThiTT()));
    }
}
