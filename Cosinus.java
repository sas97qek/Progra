public class Cosinus{

    public static void main(String[] args){

        double x = 0;

        if(args.length > 0){
            x = Double.parseDouble(args[0]);
        }else{
            System.out.println("ERROR");
        }

        System.out.println("Input: " +x);;

        double sum = 0;

        for(int i=0; i<= 10; i++){
            double zaehler = -1;
            int counter = 1;

            // Zaehler berechnen
            if(i == 0){ // case 1: i=0
                zaehler = 1;
            } else if (i > 1){ // case 3: i>1
                while(counter<i){
                    zaehler *= (-1);
                    counter++;
                }
            } else { // case 2: i=1

            }

            System.out.println(i + "ter Zaehler: " +zaehler);

            double fakultaetZuMultiplizieren = 1; // z.B. 4! = 4 * [3*2*1] <-
            counter = 1;
            double nenner = 2*i;

            if(nenner == 0){
                nenner = 1;
            }

            while(nenner > 2 && counter < nenner){
                fakultaetZuMultiplizieren *= (double) counter;
                counter++;
            }

            nenner *= fakultaetZuMultiplizieren;

            System.out.println(i + "ter Nenner: " +nenner);

            double bruch = zaehler/nenner;

            System.out.println(i + "ter Bruch: " +bruch);

            double potenz = x;
            double faktor = x;

            counter = 1;

            int n = 2*i;
            // Potenz berechnen
            if(n == 0){ // case 1: i=0
                potenz = 1;
            } else if (n > 1){ // case 3: i>1
                while(counter<n){
                    potenz *= faktor;
                    System.out.println(potenz);
                    counter++;
                }
            } else { // case 2: i=1

            }

            System.out.println(i + "te Potenz: " +potenz);

            System.out.println("Rechnung fuer Sum: " + bruch + " * " + potenz);

            sum = sum + (bruch * potenz);

            System.out.println(i + "te Summe: " +sum);
        }

        System.out.println("Ergebnis: " + sum);
    }

}
