public class Newton {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("ERROR: keine Argumente übergeben");
        }
        else if (Double.parseDouble(args[0]) <= 0) {
            System.out.println("ERROR: kann keine Wurzel aus negativen Zahlen ziehen");
        } else {
            double c = Double.parseDouble(args[0]);
            double t = c;

            while(Math.abs((t * t) - c) > 0.0001) {
                t = (t + c / t) / 2;
            }
            System.out.println(t);
        }


    }

}
