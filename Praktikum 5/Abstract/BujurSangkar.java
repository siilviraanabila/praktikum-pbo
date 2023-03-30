/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar
Lab : B1
**/

public class BujurSangkar extends BangunDatar {
	public double hitungLuas(double sisi) {
		luas = sisi * sisi;
		return luas;
	}
}

//Apabila BujurSangkar tidak membuat implementasi metode abstrak pada kelas BangunDatar, maka kelas BujurSangkar harus dijadikan kelas abstrak juga
//Jika tidak dijadikan kelas abstrak maka akan terjadi kesalahan kompilasi dan error 
