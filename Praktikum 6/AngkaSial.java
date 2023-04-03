/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Program penggunaan exception buatan sendiri
	    Pengenalan klausa 'throw' and throws'
Lab : B1
**/

public class AngkaSial {

	public void cobaAngka(int angka) throws AngkaSialException {
		if(angka == 13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}

	public static void main(String[] args) {
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase) {
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukan angka!!!");
		}
	}
}
//Ketika eksepsi terjadi, baris 12 tidak akan dieksekusi. Karena apabila nilai argumen yang diberikan pada 
//pemanggilan method cobaAngka adalah 13, maka eksepsi AngkaSialException akan dibuat dan dilemparkan pada baris ke 7.
//Baris 12 hanya akan dieksekusi apabila nilai argumen yang diberikan bukan 13. Oleh karena itu, program akan melanjutkan
//pada blok catch untuk menangani eksepsi jika terjadi.

//Baris 21 akan selalu dieksekusi setekah program selesai dieksekusi. Apabila terjadi eksepsi AngkaSialException, program akan
//melompat ke blok catch baris 19 untuk menangani eksepsi tersebut dan setelah blok catch selesai akan melanjutkan eksekusi pada baris 21
//Namun jika tidak terjadi eksepsi AngkaSialException, program akan terus dieksekusi sampai selesai dan setelah program selesai dieksekusi maka
//baris 21 akan dieksekusi dan menampilkan pesan "hati-hati memasukan angka!!!".