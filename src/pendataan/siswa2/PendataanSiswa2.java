package pendataan.siswa2;
import java.util.ArrayList;
import java.util.Scanner;

public class PendataanSiswa2 {

    //JOBSHEET 5
    public static void Welcome() {
        System.out.println("APLIKASI SEDERHANA PENDATAAN SISWA");
    }
    //JOBSHEET 5
    
    //ARRAY
    static ArrayList<String> data1 = new ArrayList<>();
    static ArrayList<String> data2 = new ArrayList<>();
    static ArrayList<String> data3 = new ArrayList<>();
    //ARRAY
    
    static Scanner scanner = new Scanner(System.in);

    //JOBSHEET 2
    static boolean isRunning = true;
    //JOBSHEET 2
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("==================================");
        //JOBSHEET 5
        Welcome();
        //JOBSHEET 5
        System.out.println("=======================");
        System.out.println("");
        
        //JOBSHEET 4
        while (isRunning) {
        System.out.println("MENU PILIHAN:");
        System.out.println("1. PENAMBAHAN DATA SISWA");
        System.out.println("2. DAFTAR DATA SISWA");
        System.out.println("3. LULUSKAN SISWA");
        System.out.println("4. TUTUP");
        System.out.print("pilih: ");
        
        //PRIMITIF
        int pilih = s.nextInt();
        //PRIMITIF
        
        s.nextLine();
        
        //JOBSHEET 3
        switch(pilih){
            case 1:
                kasus1();
                break;
            case 2:
                kasus2();
                break;
            case 3:
                kasus3();
                break;
            case 4:
                System.out.println("Selamat tinggal! ");
                isRunning = false;
                break;
            default:
                System.out.println("pilih yang bener dong! ");
        //JOBSHEET 3        
    }
        }  
        //JOBSHEET 4
        scanner.close();
    }
    
    static void kasus1() {
        System.out.println("");
        System.out.println("=====PEMASUKKAN DATA=====");
        //OBJEKTIF
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        data1.add(nama);    
        System.out.print("Masukkan kelas: ");
        String klas = scanner.nextLine();
        data2.add(klas);    
        System.out.print("Masukkan tanggal lahir: ");
        String umur = scanner.nextLine();
        data3.add(umur);  
        //OBJEKTIF
        System.out.println("DATA BERHASIL DIPERBARUI!");
        System.out.println();
    }
    
    static void kasus2() {
        if (data1.isEmpty()) {
            System.out.println("Belum ada data siswanya kak!");
            System.out.println();
        } else {
            System.out.println("");
            System.out.println("=====DATA SISWA=====");
            //JOBSHEET 4
            for (int i = 0; i < data1.size(); i++) {
                System.out.println("Data siswa ke "+ (i + 1) + ":");
                System.out.println("Nama: " + data1.get(i));
                System.out.println("Jurusan: " + data2.get(i));
                System.out.println("Lahir pada tanggal: " + data3.get(i));
                System.out.println("");
            }
            //JOBSHEET 4
            System.out.println("=============================");
            System.out.println();
        }
    }
    
        static void kasus3() {
        if (data1.isEmpty()) {
            System.out.println("");
            System.out.println("Tidak ada siswa yang bisa diluluskan");
            System.out.println("");
        } else {
            System.out.println("=====DATA SISWA=====");
            for (int i = 0; i < data1.size(); i++) {
                System.out.println("Data siswa ke "+ (i + 1) + ":");
                System.out.println("Nama: " + data1.get(i));
                System.out.println("Jurusan: " + data2.get(i));
                System.out.println("Lahir pada tanggal: " + data3.get(i));
                System.out.println("");
            }
            System.out.println("===============================");
            System.out.print("Pilih siswa yang mau diluluskan: ");
            int taskIndex = scanner.nextInt();
            scanner.nextLine();

            if (taskIndex >= 1 && taskIndex <= data1.size()) {
                data1.remove(taskIndex - 1);
                System.out.println("");
                System.out.println("Siswa berhasil diluluskan! ");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Pilihan ini tidak ada");
                System.out.println("");
            }
        }
    }
    
}
