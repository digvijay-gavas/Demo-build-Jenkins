package com.demo.helloapp.pojo;

public class Options {
	private String name;
    private String description;
    private String link;
 
    public Options() {
        super();
    }
 
    public Options(String name, String description, String link) {
        super();
        this.name = name;
        this.description = description;
        this.link = link;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
    
    
}
