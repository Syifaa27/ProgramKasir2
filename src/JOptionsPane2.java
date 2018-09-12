  import javax.swing.JOptionPane;

public class JOptionsPane2 {
    public static void main(String[] args) {
        System.out.println("Syifa' Auliya Ash-Sholihah/39/XR6");
String data[] = new String[5];
int i; 
String nama_jajan, cari;
boolean ketemu;

for(i=0;i<data.length;i++){
    nama_jajan=String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Jajan ke-"+(i+1)));
    data[i]=nama_jajan;
}
System.out.print("Nama Jajan yang Dimasukkan={");
for(i=0;i<data.length;i++){
        System.out.print(data[i]+" ");
}
System.out.println("}");
cari=String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Jajan Yang Ingin Dicari : "));
System.out.println("Nama Jajan Dicari:"+cari);
ketemu=false;
for(i=0;i<data.length;i++){
    if(data[i] == cari){
        ketemu=true;
        break;
    }
}
if(ketemu){
    System.out.println("Nama Jajan ditemukan dalam urutan ke-"+(i+1));
}else{
    
    System.out.println("Nama Jajan tidak ditemukan");
}
    }
}
  

