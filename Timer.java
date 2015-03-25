
public class Timer {
	private int minute;
	private int seconde;
	
	public Timer()
	{
		minute = 0;
		seconde = 0;
	}
	
	public Timer(int time)
	{
		
		minute = time/60;
		seconde = time%60;
    }


	public int getMinute()
	{
		return this.minute;
	}
	
	public int getSeconde()
	{
		return this.seconde;
	}
	
	
	    /* à mettre dans le main du jeu 
	      public static void main(String [] args) {
	     

	        int leTempsEnMillisecondes=1000;
	        int i = 0;

	        while(i<200) {
	            try {
	                Thread.sleep (leTempsEnMillisecondes);
	            } 
	            catch (InterruptedException e) {
	                System.out.print("erreur");
	            }
	            
	            Timer timer1 = new Timer(i);
	            int minute = timer1.getMinute();
	            int seconde = timer1.getSeconde();
	            
	            System.out.println(minute +" : " +seconde);
	            
	            i++;
	            
	            
	        } 
	    
	}
	*/

}
