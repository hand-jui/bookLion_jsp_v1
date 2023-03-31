package com.jui.bookLion.dto;

public class BookDTO {

	private int id;
	private String category;
	private String title;
	private String author;
	private String publisher;
	private String pubdate;
	private int price;
	private int sale;
	private int quantity;

	public BookDTO(int id, String category, String title, String author, String publisher, String pubdate, int price,
			int sale, int quantity) {
		this.id = id;
		this.category = category;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.price = price;
		this.sale = sale;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", category=" + category + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", pubdate=" + pubdate + ", price=" + price + ", sale=" + sale
				+ ", quantity=" + quantity + "]";
	}

}