package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal>farm = new ArrayList<Animal>();
	Pig p = new Pig();
	p.name = "BOB";
	p.age = 1;
	farm.add(p);
	
	Pig p2 = new Pig();
	p2.name = "JOHN";
	p2.age = 2;
	farm.add(p2);
	
	Cow c = new Cow();
	c.name = "Matt";
	c.age = 3;
	farm.add(c);
		
	Cow c2 = new Cow();
	c2.name = "Matt2";
	c2.age = 4;
	farm.add(c2);
	
	Horse h = new Horse();
	h.name = "Matt3";
	h.age = 5;
	farm.add(h);
	
	Chicken ch = new Chicken();
	ch.name = "Matt4";
	ch.age = 6;
	farm.add(ch);
	
	for (Animal a : farm) {
		a.makeNoise();
	    a.birthday();
		System.out.println("");
	}
	
}
}
