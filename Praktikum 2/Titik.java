/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 22 Februari 2023
Deskripsi : program yang berisi kelas Titik
Lab : B1
**/ 
class Titik{
    private double absis;
    private double ordinat;
    private static int counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    public void setAbsis(double a){
        absis =a;
    }

    public double getAbsis(){
        return absis;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }
}
