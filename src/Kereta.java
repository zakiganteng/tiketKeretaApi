/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Kereta {
    private String namaKereta;
    private int maxGerbong;
    private int nGerbong=0;
    private Gerbong[] g;
    
    public Kereta(String namaKereta){
        this.namaKereta=namaKereta;
        g=new Gerbong[10];
        maxGerbong=10;
    }public Kereta(String namaKereta, int maxGerbong){
        this.namaKereta=namaKereta;
        this.maxGerbong=maxGerbong;
        g=new Gerbong[maxGerbong];
    }public String getNamaKereta(){
        return namaKereta;
    }public void addGerbong(Gerbong g){
        if(nGerbong<maxGerbong){
            this.g[nGerbong]=g;
            nGerbong++;
        }
    }public int getJumlahGerbong(){
        return nGerbong;
    }public Gerbong getGerbong (int i){
        return g[i];
    }public void removeGerbong(){
            nGerbong--;
    }
    
}
