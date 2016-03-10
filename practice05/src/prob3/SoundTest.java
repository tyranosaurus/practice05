package prob3;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	public static void printSound(Object animal)
	{
		System.out.println(((Soundable)animal).sound());
	}

/*	public static void printSound(Soundable animal)
	{
		System.out.println(animal.sound());
	}*/
	
	
}