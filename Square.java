public class Square{
    public static void main(String[] args){
        System.out.println(square(Integer.parseInt(args[0])));
    }

    public static int square(int zahl){
        return zahl * zahl;
    }
}
