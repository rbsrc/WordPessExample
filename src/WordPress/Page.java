package WordPress;

import java.time.LocalDate;

public class Page {
	
	String title, body, category;
	LocalDate date;
//	Set <Comment> comments = 
	
	public Page(String title, String body, String category){
		this.title = title;
		this.body = body;
		this.category = category;
		this.date = LocalDate.now();
	}
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

	
	
}
