package GameZone;
import javax.swing.JOptionPane;
public class RandomGuessLoop {

	public static void main(String[] args) 
	{
		
			int guess;
			int result;
			String resultString;
			String msg;
			int low = 1;
			int high = 100;
			int score = 10;
			result = low + (int)(Math.random() * high);
			do {
				
			resultString = JOptionPane.showInputDialog(null, " Try to guess my number between " + low + " and " + high);
			guess = Integer.parseInt(resultString);
			score--;
			if(guess==result)
			{
				msg = "You win!!!";
			}
			else
				if(guess<result)
				{
					msg = "Your guess was to low";
		
				}
				else
					msg = "Your guess was to high";
					
			JOptionPane.showMessageDialog(null, msg + " Your Score was " + score);
			
			
	}while( result !=guess||score == 0);
	
	
		
	}
}
