package Notes;

public class GoggleNote implements Note{
	public String heading;
	public String excerpt;
	public String url;
	
	public GoggleNote(String heading, String excerpt, String url){
		this.heading = heading;
		this.excerpt = excerpt;
		this.url = url;
	}
	
	public void accept(NoteVisitor visitor){
		visitor.visit(this);
	}
}
