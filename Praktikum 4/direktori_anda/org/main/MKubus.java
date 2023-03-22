/*
Nama File 	: MKubus.java 
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Deskripsi 	: Driver class untuk Kubus
Lab		: B1
*/

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
  public static void main(String[] args) {
    Kubus kubus = new Kubus(new BujurSangkar(4));

    double luasAlas = kubus.hitungLuasAlas();
    System.out.println("Luas Alas Kubus: " + luasAlas);

    double volumeKubus = kubus.hitungVolume();
    System.out.println("Volume Kubus : " + volumeKubus);

  }
}