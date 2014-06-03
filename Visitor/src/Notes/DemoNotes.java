package Notes;

public class DemoNotes {
	public static void main(String[] args){
		Note amazonNote = new AmazonNote("Costa ardiente","Wilbur Smith", "ISBN:99898989", 190);
		Note googleNote = new GoggleNote("cosa", "cosa", "http://cosas.com");
		Note newsNote = new NewsNote("Mercado bursatil", "John Smith, Staff Writer", "Suba de la bolsa, de activos a mediano plazo");
		
		

		System.out.println("Visiting element list with SumVisitor");
		System.out.println("");
		NoteVisitor noteDetalisPrinter = new NoteDetalisPrinter();

		amazonNote.accept(noteDetalisPrinter);
		googleNote.accept(noteDetalisPrinter);
		newsNote.accept(noteDetalisPrinter);
		
		System.out.println("Visiting element list with SumVisitor");
		System.out.println("");
		NoteVisitor noteHeaders = new NoteRawPrinter();

		amazonNote.accept(noteHeaders);
		googleNote.accept(noteHeaders);
		newsNote.accept(noteHeaders);
	}
}
