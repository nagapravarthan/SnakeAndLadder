package snakeandladder;

public class Snakeandlader
{
	public static void main(String[] args)
	{
				
				int count = 0;
			    int position = 0;
			    while(position<=99){
				System.out.println("position is " + position);
				int die=(int) (Math.random() * 10) % 6+1;
				position = (position + die);
				count =(count + 1);
				System.out.println("die value is " + die);
				int value=(int) (Math.random() * 10) % 3+1;
				
				 switch(value) {
				   case 1:
				   System.out.println( "No Play You are in the same position!!!" );
				   break;
				  
				   case 2:
				   position = (position + die);
				   if(position>100){
					   position = (position - die);
					   continue;
				   }
				   System.out.println( "your position after ladder is ::" + position );
				   break;
				   
				   case 3: 
				   position = (position - die);
				  
				  if(position<0){
					  position = 0;
				  }
					 System.out.println( "Your Position after snake is::" + position );
				   break;
				   }
				 }
					System.out.println( "die play number:: " + count );

		  }
}