/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Gerbong {
    private String namaGerbong;
    private int nPenumpang;
    
    public Gerbong(String nama){
        setNama(nama);
    }public Gerbong(String nama, int n){
        setNama(nama);
        setNPenumpang(n);
    }public void setNama(String nama){
        namaGerbong=nama;
    }public String getNama(){
        return namaGerbong;
    }public int getNPenumpang(){
        return nPenumpang;
    }public void setNPenumpang(int n){
        nPenumpang=n;
    }
}
