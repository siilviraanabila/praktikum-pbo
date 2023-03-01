/**
* Nama File : Titik.java 22/02/2023
* Pembuat : Silvira Nabila Anggita Giraldi 
* NIM : 24060121120011
* Deskripsi : Program yang berisi kelas Titik.
*
*
*/
class Titik{
    double absis;
    double ordinat;
    static int counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    void setAbsis(double a){
        absis =a;
    }

    double getAbsis(){
        return absis;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
}
