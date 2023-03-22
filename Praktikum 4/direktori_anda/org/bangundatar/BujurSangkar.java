/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 8 Maret 2023
Deskripsi : Representasi dari objek persegi panjang, turunan kelas poligon
Lab : B1
**/
package org.bangundatar;
  
  import org.poligon.Poligon;
  
  public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}
	public double hitungLuas(){
	return panjangSisi * panjangSisi;
}
	public double getPanjangSisi(){
		return this.panjangSisi;
    }
  }