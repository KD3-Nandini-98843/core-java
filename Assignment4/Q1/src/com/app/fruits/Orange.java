package com.app.fruits;
public class Orange extends fruit 
{
	public Orange(String color, double weight) 
{
   super("Orange", color, weight);
}
@Override
public String taste()
{
   return "sour";
}
}
