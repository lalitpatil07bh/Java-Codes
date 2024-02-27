package com.app.core;

public enum Color {

	WHITE(5000), BLACK(10000), GREY(6500), SILVER(8000);

	private int additionalCost;

	private Color(int additionalCost) {
		this.additionalCost = additionalCost;
	}

	public int getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(int additionalCost) {
		this.additionalCost = additionalCost;
	}

	public String toString() {
		return name() + " with additional cost " + additionalCost;
	}
}
