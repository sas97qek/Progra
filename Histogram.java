import java.util.Scanner;

public class Histogram{

    public static void main(String[] args){

        if(args.length < 3){
            System.out.println("Usage: java Histogram <min> <max> <n>");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        if(min >= max || n < 1 || ((max - min) % n != 0)){
            System.out.println("Error: Invalid arguments");
            return;
        }

        int[] bins = new int[n];
        int groesse = (max - min) / n;


        System.out.println("Groesse: " + groesse);

        Scanner standardInput = new Scanner(System.in);

        while(standardInput.hasNext()){
            int nextNumber = standardInput.nextInt();
            int index;

            if(nextNumber >= min && nextNumber <= max){
                int upperBound = groesse-1;
                index = 0;

                while(nextNumber > upperBound){
                    if(index == n-1){
                        break;
                    } else {
                        upperBound += groesse;
                        index++;
                    }
                }
            } else{
                System.out.println("ERROR: Zahl out of range");
                return;
            }

            bins[index]++;
        }

        for(int anzahl: bins){
            System.out.print(anzahl + " ");
        }
    }
}
