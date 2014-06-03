package Notes;

public class NoteDetalisPrinter implements NoteVisitor{

	public void visit(GoggleNote note) {
		System.out.println("Nota de google");
		System.out.println("Cabecera: " + note.heading);
		System.out.println("Extracto" + note.excerpt);
		System.out.println("URL: " + note.url);
		System.out.println("");
	}

	public void visit(AmazonNote note) {
		System.out.println("Nota de Amazon");
		System.out.println("Titulo: " + note.title);
		System.out.println("Precio: " + note.price);
		System.out.println("Autor: " + note.author);
		System.out.println("ISBN: " + note.isbn);
		System.out.println("");
	}

	public void visit(NewsNote note) {
		System.out.println("Nota de Noticias");
		System.out.println("Cabecera:" + note.headline);
		System.out.println("Autor: " + note.byline);
		System.out.println("Extracto: " + note.excerpt);
		System.out.println("");
	}
}
