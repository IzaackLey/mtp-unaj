package Notes;

public interface Note {
	void accept(NoteVisitor visitor);
}
