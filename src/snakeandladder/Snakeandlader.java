package snakeandladder;

public class Snakeandlader
{
	public static void main(String[] args)
	{

		int position = 0;
			  while(position<=93)
			  {		
				 int die= 1 + (int) (Math.random() *6);
				 System.out.println("dice value is " + die);
				 position =(position + die);
				 System.out.println("position is " + position);
				 int value= 1  + (int) (Math.random() * 3);
			   switch(value) 
			   {
			   case 1:
			   System.out.println( "No Play....You are in the same position" );
			   break;
			  
			   case 2:
			   position = (position + die);
			  
			   System.out.println( "your position after ladder is :" + position );
			   break;
			   
			   case 3: 
			   position = (position - die);
			   System.out.println( "Your Position after snake is" + position );
			  
			  if(position<0)
			  {
				  position = 0;
			  }
			   break;
			   }
		  }
	}

}