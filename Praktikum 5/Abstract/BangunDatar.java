/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
Lab : B1
**/

public abstract class BangunDatar {
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double l){
		luas = l;
	}

	public double getLuas() {
		return luas;
	}
}