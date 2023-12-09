public class PQ{
	public static void main(String[] args){
		if(args.length == 2){
			pq(args);
		} else {
			System.out.println("ERROR: Bitte genau 2 Argumente eingeben.");
		}
	}

	public static void pq(String[] arr){
		double p = Double.parseDouble(arr[0]);
		double q = Double.parseDouble(arr[1]);
		int anzahlNullstellen = 3; // nur um's initialisiert zu haben
		double unterDerWurzel = (p*p)/4-q;

		double x1 = 0; // nur um's initialisiert zu haben
		double x2 = 0; // nur um's initialisiert zu haben

		if (unterDerWurzel < 0) {
			anzahlNullstellen = 0;
		} else if (unterDerWurzel == 0) {
			anzahlNullstellen = 1;
			x1 = -(p/2) - Math.sqrt(unterDerWurzel);
		} else if (unterDerWurzel > 0) {
			anzahlNullstellen = 2;
			x1 = -(p/2) - Math.sqrt(unterDerWurzel);
			x2 = -(p/2) + Math.sqrt(unterDerWurzel);
		}
		
		

		switch(anzahlNullstellen){
			case 2:
				System.out.println(x1);
				System.out.println(x2);
				System.out.println("Es gibt 2 Nullstellen.");
				break;
			case 1:
				System.out.println(x1);
				System.out.println("Es gibt 1 Nullstelle.");  
				break;
			case 0:
				System.out.println("Es gibt 0 Nullstellen.");
				break; 
			default:

		}	
	}
}
