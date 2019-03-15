import java.util.Scanner;
public class QueueMain{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		QueueL queue = new QueueL();
		int choice, value;
		boolean flag = true;
		while(flag){
			printMenu();
			choice = input.nextInt();
			switch(choice) {
				
				case 0:
				flag = false;
				break;
				case 1: // add
					System.out.println(); 
					System.out.println("Please enter your name:");
					String name = input.next();
					System.out.println("Please enter your transaction:");
					int price = input.nextInt();
					queue.add(name,price);       
					pause();
					break;
					case 2: // remove
					queue.dequeue();
					System.out.println("Transaction complete. Removing...");
					pause();
					break;
					case 3: //search
					System.out.println("Is your transaction here?");
					name = input.next();
					if (queue.search(name)){
					System.out.println("Your transaction is here");
					}
					else{
						System.out.println("Invalid, no transaction exists");
					}
					pause();
					break;
					case 4: // priority
					System.out.println(); 
					System.out.println("Please enter your name:");
					 name = input.next();
					System.out.println("Please enter your transaction:");
					price = input.nextInt();
					queue.addprio(name,price);       
					pause();
					break;
					case 5: //display
					System.out.println(); 
					if(!queue.isEmpty()){
						queue.display();
					}
					else System.out.println("It's empty! ");
					pause();
					break;
					default:
					System.out.println("Select your action."); 
					pause();
					
					
			}
		}
		System.out.println();
		System.out.println("================================");
		System.out.println("Program terminated.");
	}
	private static void printMenu(){
		System.out.println("================================");
		System.out.println("Sterling Cooper Transaction Program");
		System.out.println("================================");
		System.out.println();
		System.out.println("0 - Exit the program");
		System.out.println("1 - Create account and transaction");
		System.out.println("2 - Dequeue");
		System.out.println("3 - Search");
		System.out.println("4 - Priority transaction!");
		System.out.println("5 - Display queue");
		System.out.println();
		System.out.println("================================");
		System.out.println("================================");
		System.out.print("Select your action: "); 
	}
	public static void pause(){ 
	Scanner input = new Scanner(System.in); 
	System.out.println();
	System.out.println("================================");
	System.out.print("Press enter to continue . . .");
	String c = input.nextLine(); 
	} 
}

		