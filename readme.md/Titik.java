//MTitik.java 22/02/2023
//Nama : Alfarizi Hidayah
//Deskripsi :kelas yang berisi titik yang sudah dibuat 


class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y) {
		absis = x;
		ordinat = y;
		counterTitik++;
	}

	void setAbsis(double x) {
		absis = x;
	}
	
	void setOrdinat(double y){
		ordinat = y;
	}

	double getAbsis() {
		return absis;
	}

	double getOrdinat() {
		return ordinat;
	}

	int getCounterTitik(){
		return counterTitik;
	}
}
