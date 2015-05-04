import java.util.ArrayList;

public class Player {
	public Song currentSong;
	
	public ArrayList<Song> songs;
	private NextSongBehavior next;
	
	public Player(Song song, NextSongBehavior next)
	{
		songs = new ArrayList<Song>();
		songs.add(song);
		currentSong = song;
		this.next = next;
	}
	
	public void next(){
		Integer posicionProxima = next.next(songs.indexOf(currentSong), songs.size());
		currentSong = songs.get(posicionProxima);
	}

	public Song getCurrentSong() {
		return currentSong;
	}

	public void setCurrentSong(Song currentSong) {
		this.currentSong = currentSong;
	}
	
	public void AddSong(Song song){
		songs.add(song);
	}
	
	public void SetNextSongBehavior(NextSongBehavior next){
		this.next = next;
	}
	
}
