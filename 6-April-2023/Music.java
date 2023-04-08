/*Create an interface called "Playable" with a method called "play". Create two classes called 
 *"Song" and "Video" that implements playable interface and implement the "play" method.
 *Create objects of both the Song and Video classes and call their respective "play" method.*/
package Practical;

interface Playable
{
   public void play();	
}

class Song implements  Playable //Implementing the Playable interface
{
	public void play() //body to abstract method
	{
		System.out.println("I am play method of Song class");
	}
	
}

class Video implements Playable //Implementing the Playable interface
{
	public void play() // body to abstract method
	{
		System.out.println("I am play method of Video class");
	}
}
public class Music //Main class
{

	public static void main(String[] args) 
	{
		Song s = new Song(); //Creating the object of song class
		s.play(); //Calling method
		
		Video v = new Video(); //Creating the object of video class
		v.play(); //Calling method

	}

}
