import java.util.Random;

public class RandomSong implements NextSongBehavior{

	public Integer next(int currentSong, int cantidad) {
		return new Random().nextInt(cantidad);
	}
}
