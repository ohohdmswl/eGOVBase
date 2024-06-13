package projectNm.cmmn.model;

import java.io.Serializable;

public class BoardVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6013846130663269445L;

	private String board_id;
	private String wrtr;
	private String cnt;
	private String created;
	public String getBoard_id() {
		return board_id;
	}
	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}
	public String getWrtr() {
		return wrtr;
	}
	public void setWrtr(String wrtr) {
		this.wrtr = wrtr;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	@Override
	public String toString() {
		return "BoardVO [board_id=" + board_id + ", wrtr=" + wrtr + ", cnt=" + cnt + ", created=" + created + "]";
	}
	
	
	
}
