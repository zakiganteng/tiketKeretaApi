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
    private int noGerbong;
    private int nPenumpang;
    
    public Gerbong(int no){
        setNo(no);
        nPenumpang=50;
    }public Gerbong(int no, int n){
        setNo(no);
        setNPenumpang(n);
    }public void setNo(int no){
        noGerbong=no;
    }public int getNo(){
        return noGerbong;
    }public int getNPenumpang(){
        return nPenumpang;
    }public void setNPenumpang(int n){
        nPenumpang=n;
    }public String toString(){
        String s = "No Gerbong "+ getNo() +
                   "\nKursi kosong : "+nPenumpang;
        return s;
    }public void tiketTerjual(int i){
        nPenumpang=nPenumpang - i;
    }
}
