package WordPress;

public class VideoPost extends Post {
	
	private String url;

	public VideoPost(String title, String body, String category) {
		super(title, body, category);
		
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
}
