public class Book extends Tangibleasset{
	private String osbn;
	public Book(String name,int price,String color, String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getIsbn(){
		return this.Isbn;
	}

