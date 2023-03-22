/*
Nama File 	: Kubus.java 
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Deskripsi 	: Representasi dari objek Kubus, turunan kelas poligon
Lab		: B1
*/

package org.bangunruang;

import org.bangundatar.PersegiPanjang;

public class Kubus{
    private PersegiPanjang permukaan;

    public Kubus(PersegiPanjang permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
