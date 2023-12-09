public class Random{
    public static void main(String[] args){
        System.out.println(dice(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    public static int dice(int a, int b){
        int ergebnis = 0;
        if(a==b){
            ergebnis = a;
        }
        else{
            ergebnis = a + (int) (Math.random() * b);
        }
        return ergebnis;
    }
}
