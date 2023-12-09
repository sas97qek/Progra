import java.util.Scanner;

public class TwentyQuestions{

	public static void main(String[] args){
		int myNumber = (int) (Math.random() * 100);

		Scanner standardInput = new Scanner(System.in);
		int userInput;

		userInput = standardInput.nextInt();
		
		do {
			if(userInput > myNumber){
				System.out.println("Meine Zahl ist kleiner.");
			} else if(userInput < myNumber){
				System.out.println("Meine Zahl ist groesser.");
			} else{
				System.out.println("Richtig geraten, die Zahl lautet: " + myNumber);
			}
		} while(userInput == myNumber);

	}
}
