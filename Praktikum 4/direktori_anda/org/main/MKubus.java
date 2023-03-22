/*
Nama File 	: MKubus.java 
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Deskripsi 	: Driver class untuk Kubus
Lab		: B1
*/

package org.main; 
 
import org.bangunruang.*; 
import org.bangundatar.*; 
 
public class MKubus{ 
	public static void main(String[] args){ 
		BujurSangkar bujurSangkar = new BujurSangkar(6); 
		Kubus kubus = new Kubus(bujurSangkar); 
		System.out.println("Luas Alas Kubus dengan panjang sisi 6 satuan adalah : "+kubus.hitungLuasAlas()); 
		System.out.println("Volume Kubus dengan panjang sisi 6 satuan adalah : "+kubus.hitungVolume()); 
	} 
}