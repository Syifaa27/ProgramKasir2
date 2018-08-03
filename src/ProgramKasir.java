import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[] args) {
        // Deklarasi
        String namaPembeli;
        int anggota, JmlhBrng;
        double HargaBrngSatuan, TotalHargaBrng, TotalHarga, diskon = 0.1, diskon1, diskon2, total;
        Scanner baru = new Scanner(System.in);
        
        // Deskripsi
        System.out.print("Nama Pembeli = ");
        namaPembeli = baru.next();
        System.out.print("Banyak Brang = ");
        JmlhBrng = baru.nextInt();
        System.out.print("Harga Satuan Barang = Rp");
        HargaBrngSatuan = baru.nextInt();
        System.out.println("Ada kartu anggota, 1 untuk yes, 2 untuk No");
        anggota = baru.nextInt();
        TotalHargaBrng = JmlhBrng * HargaBrngSatuan;
        if (TotalHargaBrng > 1000000){
            diskon1 = TotalHargaBrng * diskon;
            if (anggota == 1){
                diskon2 = TotalHargaBrng * diskon;
                total = TotalHargaBrng-diskon1-diskon2;
                System.out.println("TotalHarga = Rp" + total);
            } else
            total = TotalHargaBrng - diskon1;
            System.out.println("Total = Rp" + total);
        } else
            System.out.println("Total = Rp" + TotalHargaBrng);
            
        }
        
    }
    
}
