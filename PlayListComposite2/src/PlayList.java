import java.util.ArrayList;

public class PlayList implements IComponent{
	
	private String playListName;
	private ArrayList<IComponent> playList = new ArrayList<IComponent>();
	
	public PlayList(String name) {
		this.playListName = name;
	}

	@Override
	public void play() {
		for(IComponent component : this.playList){
			component.play();
		}
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for(IComponent component : this.playList){
			component.setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.playListName;
	}

	public void add(Song song) {
		this.playList.add(song);// TODO Auto-generated method stub
	}
	
	public void add(PlayList playList) {
		this.playList.add(playList);// TODO Auto-generated method stub
	}
	
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		for(IComponent component : this.playList){
			str.append(component.toString());
		}
		
		return str.toString();
	}
}
