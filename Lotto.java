public class Lotto{

	public static void main(String[] args){
		if(args.length != 2 || Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > Integer.parseInt(args[1])){
			System.out.println("ERRROR: Gib 2 ganze Zahlen n und m ein, wobei n > 1 und n < m.");
		} else{
			lotto(args);
		}
	}
		
	public static void lotto(String[] arg){
		int arr[] = new int[Integer.parseInt(arg[0])];
		for(int i=0; i<=arr.length; i++){
			int rnd = (int) (Math.random() * Double.parseDouble(arg[1]));
			for(int y=0; y<arr.length; y++){
				if(arr[y] == rnd){
					i--;
					break;
				} else if(arr[y] == 0){
					arr[y] = rnd;
					break;
				}
			}
		}
		for(int i = 0; i<arr.length; i++){
			if(i == arr.length-1){
				System.out.print(arr[i]);
			} else{
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
