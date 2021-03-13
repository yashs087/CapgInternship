package com.skill.capg.assig3;

public class Profit {
	static float calculateProfit(float x, float y, float z) {
		float price_per_toy=y/12;
		float profit = ((z-price_per_toy)/price_per_toy)*100;
		return profit;
	}
}
