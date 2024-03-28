package com.board.domain;

public class BoardVo {
	private  int     bno;
	private  String  menu_id;
	private  String  title;
	private  String  writer;
	private  String  regdate;
	private  int     hit;
	
	public String getMenu_id() {
		
		return null;
	}
	public String getContent() {
		
		return null;
	}
	public void setContent(String content) {
		
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
