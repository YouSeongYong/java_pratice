
public class Music {

	// 뮤직플레이어에 대한 설계도를 작성하는 Model 부분!
	// Mode==value Object (VO) == Data Transfer object :DTO

	private String songName;
	private String singer;
	private int playTime;

	// 음악 파일의 경로를 저장할 수 있는 필드!
	private String musicpath;

	// 생성자 메소드
	public Music(String songName, String singer, int playTime, String musicpath) {

		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.musicpath = musicpath;
	}
	public String getmusicpath() {
		return musicpath;
	}

	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public int getPlayTime() {
		return playTime;
	}

}
