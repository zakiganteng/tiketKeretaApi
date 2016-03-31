/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Stasiun {
    private String namaStasiun;
    private int nJalur;
    
    public Stasiun(String nama){
        setNama(nama);
        nJalur=3;
    }public void setNama(String nama){
        namaStasiun=nama;
    }public String getNama(){
        return namaStasiun;
    }public int getNJalur(){
        return nJalur;
    }public void setNJalur(int n){
        nJalur=n;
    }public String toString(){
        String s = "Stasiun : "+ getNama() +
                   "  ";
        return s;
    }
}
