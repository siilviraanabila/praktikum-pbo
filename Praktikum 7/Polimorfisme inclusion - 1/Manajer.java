/**
Nama File : Manajer.java
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 3  Mei 2023
Lab : B1
**/

public class Manajer extends Pegawai {
	private int tunjangan = 700000;

	public Manajer(String nama) {
		setNama(nama);
	}

	public void tampilData() {
		super.tampilData();
		System.out.println("Tunjangan: "+tunjangan);
	}
}