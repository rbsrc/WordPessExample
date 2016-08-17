package WordPress;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Menu.printMenu();
			input = scanner.nextLine();
		
			processInput(input);
		}

	}

	private static void processInput(String input) {
		
		input = input.trim();
		
		if(input.length() == 0){
			System.out.println("ERROR: ");
			return;
		}

		String[] inputParams = input.split(",");
		
		int action  ;
		try {
			action = Integer.parseInt(inputParams[0].trim());
		} catch (NumberFormatException e) {
			
			System.out.println("**********HATALI GİRİŞ ! TEKRAR DENEYİNİZ...Örnek(1,cümle)******** ");
			return ;
		}
		

		
		int index;
		switch (action) {
		case 0:
			System.out.println("Exiting...");
			System.exit(0);
		case 1:

			Page newPage = new Page ();
			Helper.addPage(newPage);
			break;
		case 2:
			
			break;
		case 3:

			break;
		case 4:
			
			break;
			
		case 5:
		
			break;

		default:
			break;
		}
	

	}
}
