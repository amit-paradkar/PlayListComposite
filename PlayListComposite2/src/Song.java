
public class Song implements IComponent {
	private String songName;
	private String artist;
	private float speed = 1;

	public Song(String songName, String artist) {
		this.songName = songName;
		this.artist = artist;
	};
	
	@Override
	public void play() {
		System.out.println("Now playing song " + songName);
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String getName() {
		return this.songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return (this.songName + this.speed);
	}

}
