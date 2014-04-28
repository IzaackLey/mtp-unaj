public class NextWithLoop implements NextSongBehavior{
	public Integer next(int currentSong, int cantidad) {
		if (currentSong < cantidad-1)
			return currentSong+1;
		else
			return 0;
	}
}
