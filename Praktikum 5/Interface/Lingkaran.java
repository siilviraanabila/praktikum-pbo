/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
Lab : B1
**/

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea {
	private double jejari;

	public Lingkaran(double r) {
		jejari = r;
	}

	public double hitungLuas() {
		return PI*jejari*jejari;
	}
}
