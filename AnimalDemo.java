//Multilevel inheritance
package Java;
class Animal
{
	public String species;
	public String sound;
	
	public Animal(String species,String sound) 
	{
		this.species=species;
		this.sound=sound;
	}
	public void makesound()
	{
		System.out.println("The"+species+"makes a"+sound+"sound.");
	}
}

class Dog extends Animal
{
	public String breed;
	
	public Dog(String species,String sound,String breed) 
	{
		super(species,sound);
		this.breed=breed;
	}
	public void displayInfo() 
	{
		System.out.println("Species: "+species);
		System.out.println("Sound: "+sound);
		System.out.println("Breed: "+breed);
	}
}
class Bulldog extends Dog
{
	public Bulldog(String species,String sound,String breed)
	{
		super(species,sound,breed);
	}
}
public class AnimalDemo 
{
	public static void main(String[]args)
	{
		Bulldog bg=new Bulldog("Dog","Woof","Bulldog");
		bg.displayInfo();
		bg.makesound();
	}
}