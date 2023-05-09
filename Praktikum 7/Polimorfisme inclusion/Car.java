/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 3  Mei 2023
Lab : B1
**/

public class Car extends Vehicle {
	void calRent(int jarak, float harga) {
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}