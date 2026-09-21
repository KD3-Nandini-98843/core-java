package com.app.fruits;
public class Apple extends fruit
{
	public Apple(String color, double weight) 
 {
     super("Apple", color, weight);
 }

 @Override
 public String taste() 
 {
     return "sweet and sour";
 }
}

