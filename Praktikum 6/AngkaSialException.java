/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
Lab : B1
**/

public class AngkaSialException extends Exception{
	public AngkaSialException() {
		super("jangan masukan angka 13 karena angka sial !!!");
	}
}