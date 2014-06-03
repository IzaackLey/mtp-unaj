package Notes;

public class NoteRawPrinter implements NoteVisitor{

	public void visit(GoggleNote note) {
		System.out.println("Nota de google");
		System.out.println("Cabecera: " + note.heading);
		System.out.println();
	}

	public void visit(AmazonNote note) {
		System.out.println("Nota de Amazon");
		System.out.println("Titulo: " + note.title);
		System.out.println();
	}

	public void visit(NewsNote note) {
		System.out.println("Nota de Noticias");
		System.out.println("Cabecera:" + note.headline);
		System.out.println("");
	}
}
