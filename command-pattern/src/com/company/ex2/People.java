package com.company.ex2;

import java.util.ArrayList;
import java.util.List;

public class People {
	List<Commend> commends = new ArrayList<>();

	public void addCommend(Commend commend) {
		commends.add(commend);
	}

	public double execute(int index, double n1, double n2) {
		return commends.get(index).execute(n1, n2);
	}
}
