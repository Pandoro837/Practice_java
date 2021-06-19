package com.javaex.my;

import java.util.List;

public class NutritionFacts {
//	필드
	private String name;
	private double size;
	private double kj;
	private double kcal;
	private double carbohydrates;
	private double sugar;
	private double protein;
	private double fat;
	private double saturatedFat;
	private double transFat;
	private double cholesterol;
	private double sodium;
	
//	생성자
	
	public NutritionFacts() {
	}
	
	public NutritionFacts(String name) {
		this.name = name;
	}
	
	public NutritionFacts(int[] _info) {
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getKcal() {
		return kcal;
	}

	public void setKcal(double kcal) {
		this.kcal = kcal;
	}

	public void setInfo(List<Double> _info) {
		
		this.size = _info.get(0);
		this.kj = _info.get(1);
		this.carbohydrates = _info.get(3);
		this.sugar = _info.get(4);
		this.protein = _info.get(5);
		this.fat = _info.get(6);
		this.saturatedFat = _info.get(7);
		this.transFat = _info.get(8);
		this.cholesterol = _info.get(9);
		this.sodium = _info.get(10);
	}
	
	@Override
	public String toString() {
		return "NutritionFacts [name=" + name + ", size=" + size + ", kj=" + kj + ", kcal=" + kcal + ", carbohydrates="
				+ carbohydrates + ", sugar=" + sugar + ", protein=" + protein + ", fat=" + fat + ", saturatedFat="
				+ saturatedFat + ", transFat=" + transFat + ", cholesterol=" + cholesterol + ", sodium=" + sodium + "]";
	}
	
//	메소드 일반 
//	public void compare(NutritionFacts nf) {
//		String good = "good: ";
//		if(this.kcal > nf.kcal) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.carbohydrates > nf.carbohydrates) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.sugar > nf.sugar) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.protein < nf.protein) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.fat > nf.fat) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.saturatedFat > nf.saturatedFat) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.transFat > nf.transFat) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.cholesterol > nf.cholesterol) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//		if(this.sodium > nf.sodium) {
//			System.out.println(good + nf.name);
//		} else {
//			System.out.println(good + this.name);
//		}
//	}
	
	
}
