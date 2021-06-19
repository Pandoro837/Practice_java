package com.javaex.my;

public class Bmr {
	
	//필드
	private String name;
	private float height, weight, bmr, diet;
	private int age;
	
	//생성자
	public Bmr(String name, int age, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	//메소드 일반
	public void diet() {
		this.bmr = 665 + (this.weight * 9.6F) + (this.height * 1.8F) - (this.age * 4.7F);
		this.diet = this.bmr * 0.7F;
	}
	
	public void print() {
		this.diet();
		System.out.println(this.name + "님의 기초 대사량은 " + this.bmr + "이며, 다이어트 시 권장 섭취 칼로리는 " + this.diet + "입니다.");
	}
	
}
