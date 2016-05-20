package com.inferno.springcore;

public class Restuarant {
	
	IHotDrink iHotDrink;

	
	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}

	/*public Restuarant(IHotDrink iHotDrink) {
		// TODO Auto-generated constructor stub
		this.iHotDrink = iHotDrink;
	}*/

	public void prepareHotDrink() {
		iHotDrink.prepareTea();
	}

}
