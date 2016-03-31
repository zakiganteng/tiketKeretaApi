/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Tiket {
    private  Rute r;
    private int jumlahRute=0;
    
    public Tiket(Rute r){
        this.r=r;
    }
    
    public String hargaTiket(int i){
        int s =i*50000;
        return Integer.toString(s);
    }
    public String toString(int y, int z){// y stasiun tujuan
        String s = "Harga Tiket : " + hargaTiket(z)+
                   "\nKodeTukar Tiket : "+r.getNamaRute()+r.getStasiun(y).getNama()+z;
        return s;
    }
}
