/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Program untuk demo asersi yang akan menolak input 
	    jari - jari lingkaran yang bernilai nol
Lab : B1
**/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}
	public double hitungKeliling() {
		double keliling = 2*Math.PI*jariJari;
		return keliling;

	}
}
//class Asersi2
public class Asersi2{
	public static void main(String[] args) {
		double jariJari = 0;
		assert(jariJari>0) :"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "
			+kelilingLingkaran);
	}
}
//Secara konsep program Asersi2 memiliki sebuah asersi untuk memeriksa apakah nilai jari-jari
//lingkaran lebih besar dari 0 sebelum objek lingkaran dibuat. Tetapi, pada program nilai variabel
//jari-jari diinisialisasi dengan 0 sebelum objek lingkaran dibuat. Maka asersi tersebut akan selalu gagal 
//dan program akan berhenti pada saat dijalankan. Oleh karena itu, nilai variabel jari-jari harus diubah 
//ke nilai yang valid dan lebih besar dari 0 untuk memastikan bahwa asersi tersebut berhasil.