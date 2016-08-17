package WordPress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Post extends Page {
	
	public Post(String title, String body, String category) {
		super(title, body, category);
			}

	private List <Comment> comments = new ArrayList<>();
	
	public Iterator <Comment> getComments(){
		return this.comments.iterator();
	}
	
	public void addComments (Comment comments){
		this.addComments(comments);
	}

}
