package WordPress;

import java.util.Iterator;

public class Menu {
	
	public static void printMenu() {
		StringBuilder menu = new StringBuilder(50);


		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Page\n");
		menu.append("(2) Add Post\n");
		menu.append("(3) Add Comment\n");
		menu.append("(4) Show Pages\n");
		menu.append("(5) Show Posts\n");
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());

	}
	
	public static void printPostMenu(){
		
		StringBuilder menu = new StringBuilder(20);


		menu.append("\n");
		menu.append("POST MENU\n");
		menu.append("=====\n");
		menu.append("(0) Back\n");
		menu.append("(1) Add Text Post\n");
		menu.append("(2) Add video Post\n");
		
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());

	}
	public static void printCommentMenu(){
		
	
		StringBuilder menu = new StringBuilder(20);
		
		Iterator<Page> it = Helper.getIterator();
		while (it.hasNext()) {
			Page pages = it.next();
			
		menu.append("\n");
		menu.append("COMMENT MENU\n");
		menu.append("=====\n");
		
	
		
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());
	}
	}
}
