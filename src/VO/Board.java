package VO;

public class Board {

	private String boardNum;
	private String userid;
	private String title;
	private String content;
	private int hitcount;
	private String regdate;

	public Board() {
		super();
	}

	public Board(String boardNum, String userid, String title, String content, int hitcount, String regdate) {

		this.boardNum = boardNum;
		this.userid = userid;
		this.title = title;
		this.content = content;
		this.hitcount = hitcount;
		this.regdate = regdate;
	}

	public String getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Board [boardNum=" + boardNum + ", userid=" + userid + ", title=" + title + ", content=" + content
				+ ", hitcount=" + hitcount + ", regdate=" + regdate + "]";
	}

}
