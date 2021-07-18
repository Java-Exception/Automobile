package com.MichaelSuder.Automobile;

class Electric extends Automobile {

	  private String make, model;
	  private int price, salesTax, weight;

	  public Electric (String make, String model, int price, int weight) {
	    super(make, price);
	    this.make = make;
	    this.model = model;
	    this.price = price;
	    this.weight = weight;
	    this.salesTax = salesTax(price, weight);
	  }

	  public int salesTax(int price, int weight)
	  {
	    if(weight < 3000)
	      return (int) (price * 0.05) - 200;
	    else
	      return  (int) ( price * 0.05) - 150;

	  }

	  public String toString() {
	    return "Make and Model: "+make+" "+model +"\nPrice: "+price+" \nSales Tax: "+salesTax +
	    " \nWeight: " + weight;
	    }

	}
