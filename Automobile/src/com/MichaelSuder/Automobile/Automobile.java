package com.MichaelSuder.Automobile;

class Automobile {

	  private String make;
	  private int price, salesTax;


	  public Automobile (String make, int price) {
	      this.make = make;
	      this.price = price;
	      this.salesTax = salesTax(price);
	  }

	  public int salesTax(int price) {
	      return (int) (price * 0.05);
	  }

	  public String toString() {
	    return "Make: "+make+ " \nPrice: "+price+" \nSales Tax: "+salesTax;
	  }

	}
