public class M_data {

	public String category;
	public String name;
	public String author;
	public float price;
	
	public M_data(String category, String name, String author, float price) {
		
		this.category = category;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}