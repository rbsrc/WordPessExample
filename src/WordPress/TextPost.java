package WordPress;

public class TextPost extends Post {
	private String summary;
	
	
	public TextPost(String title, String body, String category) {
		super(title, body, category);
		this.summary = this.getBody().substring(0, 11);
		// TODO Auto-generated constructor stub
	}

	public String getSummary(){
		return summary;
	}
	
}
