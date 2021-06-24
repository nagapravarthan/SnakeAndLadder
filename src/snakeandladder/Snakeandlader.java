package snakeandladder;

public class Snakeandlader
{
	public static void main(String[] args)
	{

		int Position=0;
		System.out.println("Welcome to Snake-Ladder Program Problem");
		System.out.println("You are at Starting Position::"+Position);
	}
		public static void Die()
		{
			int DieCheck = 1 +(int) Math.floor(Math.random()*6);
			System.out.println("Dice Value::"+ DieCheck);
		}

}