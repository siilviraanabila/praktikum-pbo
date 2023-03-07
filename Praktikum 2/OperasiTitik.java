/**
Pembuat : Silvira Nabila Anggita Giraldi
NIM : 24060121120011
Tanggal : 1 Maret 2023
Deskripsi : Program yang berisi operasi titik.
Lab : B1
**/
class OperasiTitik {
	public void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat(); 
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiSumbuY(Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}
