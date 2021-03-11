package com.cg.lb4.model;
public abstract class WrittenItem extends Item {

	private String author;
	
	/**
	 * @param id
	 * @param title
	 * @param nocopies
	 */
	public WrittenItem(Integer id, String title, Integer nocopies,String author) {
		super(id, title, nocopies);
		// TODO Auto-generated constructor stub
		this.author=author;
	}

	/**
	 * 
	 */
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
