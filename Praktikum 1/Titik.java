/**
* Titik.java 22/02/2023
* Penulis : Silvira Nabila Anggita Giraldi
* Deskripsi : overload konstruktor pada kelas titik.
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
