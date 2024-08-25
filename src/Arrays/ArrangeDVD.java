package Arrays;

public class ArrangeDVD {
	public static void main(String[] args) {
		DVD[] newcollectiondvd = new DVD[5];
		System.err.println("Number of dvd's you can arrange : "+ newcollectiondvd.length);
		DVD avengersDVD = new DVD("Avengers", 2018, "RUSSO BROTHERS");
		DVD rrrDVD = new DVD("RRR", 2022, "SSR");
		DVD salaarDVD = new DVD("Salaar", 2023, "Prashanth Neel");
		DVD Kalki2896AD = new DVD("kALKI2898AD", 2024, "NAG ASHWIN");
		DVD deveraDVD = new DVD("DEVARA", 2025, "KORATALA SIVA");
		newcollectiondvd[0] = avengersDVD;
		newcollectiondvd[1] = rrrDVD;
		newcollectiondvd[2] = salaarDVD;
		newcollectiondvd[3] = Kalki2896AD;
		newcollectiondvd[4] = deveraDVD;
		for(DVD DVDname : newcollectiondvd) {
			System.out.println("Dvd stored : "+ DVDname);
		}
		
	}

}
