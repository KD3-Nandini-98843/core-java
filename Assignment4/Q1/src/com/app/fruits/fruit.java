package com.app.fruits;

public abstract class fruit {
 private String name;
 private String color;
 private double weight;
 private boolean isFresh; 

 public fruit(String name, String color, double weight) {
     this.name = name;
     this.color = color;
     this.weight = weight;
     this.isFresh = true; 
 }
 public abstract String taste();

 public String getName() { return name; }
 public String getColor() { return color; }
 public double getWeight() { return weight; }
 public boolean isFresh() { return isFresh; }
 public void setFresh(boolean isFresh) { this.isFresh = isFresh; }
 @Override
 public String toString() {
     return "Name: " + name + ", Color: " + color + ", Weight: " + weight + "kg, Taste: " + taste();
 }
}
