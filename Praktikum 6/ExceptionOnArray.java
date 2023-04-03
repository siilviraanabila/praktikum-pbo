/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 25 Maret 2023
Deskripsi : Program penggunaan eksepsi menggunakan class library Java
Lab : B1
**/

public class ExceptionOnArray{
	public static void main(String[] args) {
		//instansisasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}