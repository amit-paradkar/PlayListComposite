
public class PlayListComposite {

	public static void main(String[] args) {
		
		PlayList studyPlayList = new PlayList("Study");
		
		PlayList syncPopPlayList = new PlayList("Sync Pop");
		
		Song syncPopSong1 = new Song("Girl Like you", "Toro Yo Moi");
		Song syncPopSong2 = new Song("Outside", "TOPS");
		syncPopPlayList.add(syncPopSong1);
		syncPopPlayList.add(syncPopSong2);
		
		PlayList experimentalPlayList = new PlayList("Experimental");
		
		Song experimentalSong1 = new Song("About you", "XXXXYYXX");
		Song experimentalSong2 = new Song("Motivation", "Casino");
		Song experimentalSong3 = new Song("Computer Vision", "One Direction");
		
		float slowSpeed = 0.5f;
		
		experimentalPlayList.add(experimentalSong1);
		experimentalPlayList.add(experimentalSong2);
		experimentalPlayList.add(experimentalSong3);
		
		experimentalPlayList.setPlaybackSpeed(slowSpeed);
		
		experimentalPlayList.add(syncPopPlayList);
		
		studyPlayList.add(experimentalPlayList);
		
		Song glitchSong = new Song("Text", "owl");
		
		float fasterSpeed = 1.25f;
		
		glitchSong.setPlaybackSpeed(fasterSpeed);
		glitchSong.play();
		
		String name = glitchSong.getName();
		String artist = glitchSong.getArtist();
		
		System.out.println("The Song is " + name);
		System.out.println("The artist is " + artist);
		
		studyPlayList.add(glitchSong);
		
		studyPlayList.setPlaybackSpeed(fasterSpeed);
		
		
		studyPlayList.play();
		
		System.out.println("The Playlist name is " + studyPlayList.getName());
		System.out.println("The Playlist name is " + studyPlayList.getName());		
		
		System.out.println(studyPlayList.toString());
	}

}
