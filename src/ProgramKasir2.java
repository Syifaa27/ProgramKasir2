
import java.util.Scanner;

public class ProgramKasir2 {
    public static void main(String[] args) {
        System.out.println("---Toko Berkah---");
        // Deklarasi
        String namaKasir, namaBarang;
        int kodeBarang, banyakBarang;
        double HargaBarangSatuan, TotalHargaBarang, TotalHarga, diskon1 = 0.1, diskon2 = 0.2,diskon3 = 0.5, total;
        Scanner baru = new Scanner(System.in);
        
        // Deskripsi
        System.out.print("Nama Kasir = ");
        namaKasir = baru.next();
        System.out.print("Nama Barang = ");
        namaBarang = baru.next();
        System.out.print("Kode Barang = ");
        kodeBarang = baru.nextInt();
        System.out.print("Harga Barang Satuan = Rp");
        HargaBarangSatuan = baru.nextInt();
        System.out.print("Banyak Barang = ");
        banyakBarang = baru.nextInt();
        TotalHargaBarang = banyakBarang * HargaBarangSatuan;
        if (TotalHargaBarang > 100000){
            diskon1 = TotalHargaBarang * diskon1;
            if (TotalHargaBarang > 200000){
                diskon2 = TotalHargaBarang * diskon2;
                if (TotalHargaBarang > 500000){
                    diskon3 = TotalHargaBarang * diskon3;
                total = TotalHargaBarang-diskon1-diskon2-diskon3;
                System.out.println("TotalHarga = Rp" + total);
            } else
            total = TotalHargaBarang - diskon1;
            System.out.println("Total = Rp" + total);
        } else
            System.out.println("Total = Rp" + TotalHargaBarang);
            
        }
        
    }
    
    }

    