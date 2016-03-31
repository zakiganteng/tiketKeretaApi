/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Rute {
    private String namaRute;
    private int totalStasiun;
    private int nStasiun=0;
    private Stasiun[] g;
    private int maxStasiun;
    
    public Rute(String namaRute){
        this.namaRute=namaRute;
        g=new Stasiun[3];
        totalStasiun=3;
    }public Rute(String namaRute, int totalStasiun){
        this.namaRute=namaRute;
        this.totalStasiun=totalStasiun;
        g=new Stasiun[totalStasiun];
    }public String getNamaRute(){
        return namaRute;
    }public void addStasiun(Stasiun g){
        if(nStasiun<totalStasiun){
            this.g[nStasiun]=g;
            nStasiun++;
        }
    }public int getJumlahStasiun(){
        return nStasiun;
    }public Stasiun getStasiun (int i){
        return g[i];
    }public void removeStasiun(){
            nStasiun--;
    }public String toString(){
        String s = "Nama Rute : "+ getNamaRute() +
                   "\nJumlah Statsiun yang dilewati : "+getJumlahStasiun();
        return s;
    }
    
}
