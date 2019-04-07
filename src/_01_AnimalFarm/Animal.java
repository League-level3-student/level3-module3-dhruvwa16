package _01_AnimalFarm;

public abstract class Animal {
	String name;
	int age;
	public abstract void makeNoise();	
	public void birthday() {
		age++;
		System.out.println(age);
	}
	
}
