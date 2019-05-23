/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan56;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class BarangAntik {
    protected int umur;

//object
public int getBarangAntik(){
    return umur;
}
public void setBarangAntik (int umur){
       this.umur = umur;
}
//methode
   public void tampilUmur(){
        System.out.println("umur barang antik ini adalah "+umur+" tahun");
    }
}
