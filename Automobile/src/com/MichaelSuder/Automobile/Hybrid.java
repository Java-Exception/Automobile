package com.MichaelSuder.Automobile;

class Hybrid extends Automobile {

	  private String make, model;
	  private int price, salesTax;
	  private double milesPerGalon;

	  public Hybrid (String make, String model, int price, double milesPerGalon)
	  {
	      super(make, price);
	      this.make = make;
	      this.model = model;
	      this.price = price;
	      this.milesPerGalon = milesPerGalon;
	      this.salesTax = salesTax(price, milesPerGalon);
	  }

	  public int salesTax(int price, double milesPerGalon)
	  {
	    if (milesPerGalon < 40)
	      return (int) (price * 0.05) - 100;
	    else
	      return (int) (price * 0.05) - (int) (100 + (2 * ( milesPerGalon - 40)));
	  }

	  public String toString() {
	    return "Make: "+make+" Model: "+model +" Price: "+price+" Sales Tax: " + salesTax + " Miles Per Galon: " + milesPerGalon;
	    }

	}
