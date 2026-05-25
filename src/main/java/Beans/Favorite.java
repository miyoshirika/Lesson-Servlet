package Beans;

public class Favorite implements java.io.Serializable{
	
	private String name;
	private String url;
	
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setUrl(String url) {
		this.url=url;
	}
}