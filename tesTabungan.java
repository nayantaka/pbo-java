public class tesTabungan {
public static void main(String args[]) {
Tabungan t=new Tabungan(5000);
System.out.println("Saldo awal Tabungan Anda : "+t.saldo);
t.ambiluang(1500);
System.out.println("Jumlah uang yang diambil : 1500");
System.out.println("Saldo Tabungan Anda sekarang adalah : " + t.saldo);}
}
