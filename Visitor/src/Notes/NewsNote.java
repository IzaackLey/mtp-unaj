package Notes;

public class NewsNote implements Note{
	public String headline;
	public String byline;
	public String excerpt;
	
	public NewsNote(String headline, String byline, String excerpt){
		this.headline = headline;
		this.byline = byline;
		this.excerpt = excerpt;
	}
	
	public void accept(NoteVisitor visitor){
		visitor.visit(this);
	}
}
