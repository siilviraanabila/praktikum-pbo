/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 8 Maret 2023
Deskripsi : Driver class untuk poligon dan Segitiga
Lab : B1
**/
package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args) {
		Segitiga segitiga = new Segitiga(20,10,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}