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
