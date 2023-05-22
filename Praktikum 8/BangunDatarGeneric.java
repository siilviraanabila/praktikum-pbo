/** 
File : BangunDatarGeneric.java
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 17 Mei 2023
Lab : B1
Deskripsi : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Mengganti karakter 'T' dengan karakter yang lain seperti T1, T2, T1234 merupakan suatu metode untuk memberikan nama yang 
//lebih deskripstif kepada parameter generik, dimana parameter generik ini digunakan untuk memberikan fleksibilitas dalam penggunaan data
//dan digunakan sebagai pembeda ketika digunakan lebih dari satu parameter generik dalam kelas tersebut.