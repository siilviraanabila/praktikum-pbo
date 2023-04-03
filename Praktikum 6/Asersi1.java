/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Program untuk menunjukan asersi
Lab : B1
**/

public class Asersi1{
 public static void main(String[] args) {
	int x = 0;
	if (x>0) {
	  System.out.println("x bilangan positif");
	}else{
	  assert(x<0) :"ada kesalahan kode";
	  System.out.println("x bilangan negatif");
	}
 }
}
