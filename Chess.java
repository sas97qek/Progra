public class Chess{

	public static void main(String[] args){
		if(args.length > 0){
			for(int i = 1; i <= Integer.parseInt(args[0]); i++){ // n lines
				if(i % 2 != 0){
					for(int r = 1; r <= Integer.parseInt(args[0]); r++){ // n characters, werden gefüllt mit "*" dann " "
						System.out.print("*");
							if(r <= Integer.parseInt(args[0])){ // kann wahrscheinlich besser gelöst werden
								r++;
								System.out.print(" ");
							}
					}
					System.out.println();
				} else {
					for(int r = 1; r < Integer.parseInt(args[0]); r++){ // n characters, werden gefüllt mit " " dann "*"
						System.out.print(" ");
						if(r <= Integer.parseInt(args[0])){ // kann wahrscheinlich besser gelöst werden	
							r++;
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		} else{
			System.out.println("ERROR: Bitte eine (gültige) Zahl eingeben.");
		}	
	}	
}
