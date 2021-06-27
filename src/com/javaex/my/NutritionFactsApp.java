package com.javaex.my;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class NutritionFactsApp {

	public static void main(String[] args) throws IOException {
		
		Reader rd = new FileReader("C:\\JavaStudy\\file\\yogurt.txt");
		BufferedReader br = new BufferedReader(rd);
		List<NutritionFacts> yList = new ArrayList<NutritionFacts> ();
		List<Double> dList = new ArrayList<Double> ();
		
		String yogurtInfo = new String();
		 
		while(true) {
			int y = 0;
			yogurtInfo = br.readLine();
			
			if(yogurtInfo.equals(null)) {
				br.close();
				break;
			} 
			
			String[] info = yogurtInfo.split(" ");
			
			while(y == 0) {
				if(info.length == 1) {
					yList.get(y).setName(yogurtInfo);
				} else if(info.length == 2){
					yList.get(y).setKcal(Double.parseDouble(info[0]));
				} else if(info.length == 3){
					dList.add(Double.parseDouble(info[1]));
				} else if(yogurtInfo.equals("")) {
					break;
				}
			}
			yList.get(y).setInfo(dList);
			y++;
		}
		
		for(int i = 0; i < yList.size(); i++) {
			System.out.println(yList.get(i));
		}
		
	}

}
