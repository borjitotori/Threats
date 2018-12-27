public class Customer {

	private String name;
	private int[] cart;
	
	public Customer(String name, int[] cart) {

		this.name = name;
		this.cart = cart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getCart() {
		return cart;
	}
	public void setCart(int[] cart) {
		this.cart = cart;
	}	
}