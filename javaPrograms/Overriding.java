package javaPrograms;

import february2023.Animal;
import february2023.Dog;
import february2023.Pig;

public class Overriding {
	public void animalSound() {
		System.out.println("Animals makes sound");
	}
public static void main(String[] args) {
	Animal myanimal=new Animal();
	Animal mypig=new Pig();
	Animal mydog=new Dog();
	myanimal.animalSound();
	mypig.animalSound();
	mydog.animalSound();
	}

}
