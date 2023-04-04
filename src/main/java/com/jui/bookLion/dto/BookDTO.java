package com.jui.bookLion.dto;

public class BookDTO {

	private int id;
	private int c_id;
	private String c_name;
	private String img;
	private String title;
	private String author;
	private String publisher;
	private String pubdate;
	private int price;
	private int sale;
	private int quantity;

	public BookDTO(String c_name) {
		this.c_name = c_name;
	}

	public BookDTO(int id, int c_id, String c_name, String img, String title, String author, String publisher,
			String pubdate, int price, int sale, int quantity) {
		this.id = id;
		this.c_id = c_id;
		this.c_name = c_name;
		this.img = img;
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

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
		return "BookDTO [id=" + id + ", c_id=" + c_id + ", c_name=" + c_name + ", img=" + img + ", title=" + title
				+ ", author=" + author + ", publisher=" + publisher + ", pubdate=" + pubdate + ", price=" + price
				+ ", sale=" + sale + ", quantity=" + quantity + "]";
	}

}