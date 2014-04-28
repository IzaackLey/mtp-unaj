public class Test {

	public static void main(String[] args) {
		Player player = new Player(new Song("Enter Sandman","Metallica"), new NextWithLoop());
		player.AddSong(new Song("Thunderstruck","ACDC"));
		player.AddSong(new Song("Paranoid","Black Sabbath"));
		
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		System.out.println();
		//cambio de estrategia de proxima cancion
		System.out.println("cambio de estrategia de proxima cancion");
		player.SetNextSongBehavior(new RandomSong());
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		player.next();
		System.out.println("nombre: "+player.getCurrentSong().songName+"-- cancion: "+player.getCurrentSong().artistName);
		
	}

}
