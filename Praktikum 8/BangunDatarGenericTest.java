/** 
File : BangunDatarGenericTest.java
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 17 Mei 2023
Lab : B1
Deskripsi : main class untuk generic bangun datar
**/

public class BangunDatarGenericTest{
    public staticvoid main(String[] args){
        Lingkaran 1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("keliling lingkaran : "
                                    +bdg.hitungKeliling());
        System.out.println("tipe generic : "
                            +bdg.get().getClass().getName());
    }
}