public class StartingOrder{
	
		public static void main(String[] args){
			// Ansatz 3 (Reihenfolge innerhalb des Arrays zufällig oft ändern)
			int[] arr = {1, 2, 3, 4};
			
			for(int i = 0; i<= (int) 100*Math.random(); i++){
				int index1 = (int) (3*Math.random());
				int index2 = (int) (3*Math.random());
				if(index1 != index2){
					int tmp = arr[index1];
					arr[index1] = arr[index2];
					arr[index2] = tmp;
				}
			}
			
			
			for(int zahl: arr){
				System.out.println(zahl);
			}
		}
	
		
	
}

