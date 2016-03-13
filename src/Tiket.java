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
    private static Rute[] r=new Rute[4];
    private int jumlahRute=0;
	
    public void createRute(String nama){
	if(jumlahRute<4){
            r[jumlahRute]=new Rute(nama);
            jumlahRute++;
        }
    }public void createRute(String nama, int jumlahStasiun){
	if(jumlahRute<4){
            r[jumlahRute]=new Rute(nama, jumlahStasiun);
            jumlahRute++;
        }
    }public int getJumlahRute(){
	return jumlahRute;
    }public Rute getRute(int i){
	return r[i];
    }
}
