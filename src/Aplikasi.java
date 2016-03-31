
import java.util.Scanner;;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaki
 */
public class Aplikasi {
    private Kereta[] daftarKereta = new Kereta[2];
    private int nKereta = 0;
    private Tiket[] daftarTiket = new Tiket[2];
    private int nTiket = 0;
    private Rute[] daftarRute = new Rute[2];
    private int nRute = 0;
    
    Scanner user_input = new Scanner( System.in );
    Scanner in = new Scanner(System.in);
    
    public void addKereta(String nama, int nGerbong ){//masukkan nama dan banyak gerbong kereta
        daftarKereta[nKereta]=new Kereta(nama,nGerbong);
        for(int i=1;i<= nGerbong;i++){
            Gerbong g =new Gerbong(i);
            daftarKereta[nKereta].addGerbong(g);
        }nKereta++;    
    }public void addRute(String s, int n){//masukkan nama rute dan banyak stasiun
        daftarRute[nRute]= new Rute(s,n);
         for(int i=1;i<= n;i++){
            String nama;
            System.out.print("Masukkan Nama Stasiun : ");
            nama = user_input.next( ); //  nanti diinputkan nama stasiunnya
            Stasiun g =new Stasiun(nama);
            daftarRute[nRute].addStasiun(g);
        } addTiket(daftarRute[nRute]);
         nRute++;
       
    }public void addTiket(Rute r){//menginputkan rute
        daftarTiket[nTiket]= new Tiket(r);
        nTiket++;
    }public Tiket getTiket(int i){
        return daftarTiket[i];
    }public Kereta getKereta(int i){
        return daftarKereta[i];
    }public Rute getRute(int i){
        return daftarRute[i];
    }public void showTiket(int i, int y, int z){// int i adalah tiket untuk rute ke i, int y adalah stasiun tujuan, int z adalah banyak penumpang
        System.out.println(daftarTiket[i].toString(y,z));
    }public void showRute(){
        for(int i =0;i<nRute;i++){
        int x=i+1;
        System.out.println("Rute : "+x+"\n"+daftarRute[i].toString());
            for(int j =0;j<daftarRute[i].getJumlahStasiun();j++){
                System.out.println(daftarRute[i].getStasiun (j).toString());
            }
        }
    }public void showRute(int y){
        System.out.println("Rute : "+y+"\n"+daftarRute[y-1].toString());
            for(int j =0;j<daftarRute[y-1].getJumlahStasiun();j++){
                int x= j+1;
                System.out.println(x+". "+daftarRute[y-1].getStasiun (j).toString());
            }
        
    }public void showKereta(int n){
        System.out.println(daftarKereta[n].toString());    
        
    }public void showGerbong(int n){
        for(int i =0;i< daftarKereta[n].getJumlahGerbong();i++){
             System.out.println(daftarKereta[n].getGerbong(i).toString()); 
        }
    }
    
    public void menuPesanTiket(){
        System.out.println("========================\nMENU PesanTiket");
        showRute();
        System.out.println("MENU: "
                            +"\n1.Pilih Rute "
                            +"\n2.Keluar"
                             +"\n");
        System.out.print("Input : ");
        int no = in.nextInt();
        if(no==1){
            System.out.print("Input no Rute : ");
            no = in.nextInt();
            showRute(no);
            no--;
            System.out.print("Input Stasiun Keberangkatan : ");
            int noxx = in.nextInt();
            System.out.print("Input No Stasiun Tujuan : ");
            int nox = in.nextInt();
            showKereta(no);
            showGerbong(no);
            System.out.print("Input No Gerbong : ");
            int noxxx = in.nextInt();
            System.out.print("Input Banyak Tiket : ");
            nox = in.nextInt();
            daftarKereta[no].tiketTerjual(noxxx, nox);
            showTiket(no, noxx, nox);
            nox = in.nextInt();
        }else{
            
        }
    }public void menuTambahKereta(String nama, int i){
        addKereta(nama, i);
        menuEdit();
    }public void menuTambahRute(String s, int n){
        addRute(s,n);
        //System.out.println("::::::"+nRute);
        menuEdit();
    }public void menuEdit(){
            System.out.println("MENU Edit: "
                            +"\n1.Tambah Kereta "
                            +"\n2.Tambah Rute "
                            +"\n3.Keluar \n");
            System.out.print("Input : ");
            int no = in.nextInt();
            if (no==1){
                System.out.print("Nama Kereta : ");String s = user_input.next( );
                System.out.print("Jumlah Gerbong : ");int n = in.nextInt();
                menuTambahKereta(s,n);
            }else if(no==2){
                System.out.print("Nama Rute : ");String s = user_input.next( );
                System.out.print("Jumlah Stasiun : ");int n = in.nextInt();
                menuTambahRute(s,n);
            }
            
    }public void mainMenu(){
        
        int x=0; 
        while (x!=3){
        System.out.println("Selamat Datang di Aplikasi Pemesanan Tiket!!");
        System.out.println("================================================");
        System.out.println("MAIN MENU : "
                            +"\n1.Pesan Tiket "
                            +"\n2.Update Aplikasi "
                            +"\n3.Keluar \n");
        System.out.print("Input : ");
        int num = in.nextInt();
        x=num;
        if (x==1){
            menuPesanTiket();
        }else if(x==2){
            menuEdit();
        }
    }
    
}
}