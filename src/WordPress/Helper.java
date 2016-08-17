package WordPress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Helper {
	
	public static List <Page> pages = new ArrayList<>();
	public static List <Post> posts = new ArrayList<>();
	
	public static Iterator<Page> getIterator() {
		
		return pages.iterator();
	}
	

	public static void addPage(Page newPage) {
		
		 pages.add(newPage);
		
	} 
	public static void addPost(){
		
		
	}
	public static void addcomment(){
		
	}
	public static void showPage(){
		
	}
	public static void showPost(){
		
	}


	



}
