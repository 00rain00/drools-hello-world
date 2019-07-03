package com.javainuse.model;

public class Character {
	private  String name;
	private String position;
	private int hp;
	private int sp;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSp() {
		return sp;

	}

	public void setSp(int sp) {
		this.sp = sp;
	}
}