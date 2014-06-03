package Notes;

public class AmazonNote implements Note{
	public String title;
	public String author;
	public String isbn;
	public double price;
	
	public AmazonNote(String title, String author, String isbn, double price){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public void accept(NoteVisitor visitor){
		visitor.visit(this);
	}
}
