public class Book {
	private String ISBN;
	private String title;
	private boolean available;
	private MyQueue<String> reservedQueue = new MyQueue<String>();
	
	public Book() {
	}
	
	public void setISBN(String isbn) {
		this.ISBN = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAvailable(boolean state) {
		this.available = state;
	}
	
	public MyQueue<String> getReservedQueue() {
		return this.reservedQueue;
	}
	
	public boolean isAvailable() {
		return this.available;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public String getTitle() {
		return this.title;
	}
}
