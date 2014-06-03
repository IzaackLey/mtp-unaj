package Notes;

public interface NoteVisitor {
	void visit(GoggleNote note);
	void visit(AmazonNote note);
	void visit(NewsNote note);
}
