package com.xseagullx.angel.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class ElizabethTower {
	@Autowired private BigBen bigBen;

	public final String name = "touristAttraction";

	@PostConstruct
	void init() {
		System.out.println("ElizabethTower is being built");
	}

	@PreDestroy
	void destroy() {
		System.out.println("ElizabethTower is being demolished");
	}

	public void be() {
		for (int i = 1; i < 12; i++) {
			System.out.println(bigBen.ding());
		}
	}
}
