package com.xseagullx.angel.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BigBen {
	private int dongCount = 1;

	@Autowired private ElizabethTower tower;

	public String ding() {
		String res = "";
		for (int i = 0; i < dongCount; i++) {
			res += "dong from " + tower.name;
		}
		return res;
	}

	public void setDongCount(int dongCount) {
		this.dongCount = dongCount;
	}
}
