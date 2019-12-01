class ATM implements Runnable{ 
   private long Balance = 10000; 
   public void run( ){ 
      synchronized(this){ 
      for(int i=0; i < 10; i++){ 
            if(getBalance( ) <= 0 ) break; 
            withDraw(1000); 
            if(getBalance( ) ==2000 ||  getBalance( ) ==4000 || 
              getBalance( ) ==6000 ||  getBalance( )==8000){ 
                try{  System.out.println("this.wait( ) 호출\n"); 
                     this.wait( ); 
                 }catch(InterruptedException e){ 
                     e.printStackTrace( ); 
                 } 
            }else{ System.out.println("this.notify( ) 호출");  this.notify( );  } 
         } //end for
      } //end synchronized 
   } //end run

   public void withDraw(long howMuch){ 
	      if(getBalance( ) > 0){ 
	      Balance -=howMuch; 
	         System.out.println(Thread.currentThread( ).getName( )+" : "); 
	         System.out.println("잔액 : " +getBalance( ) + " 원"); 
	      }else{ 
	         System.out.println(Thread.currentThread( ).getName( ) +" , " ); 
	         System.out.println("잔액이 부족합니다."); 
	      } 
	 } 

	  public long getBalance( ){     return Balance;   } 
	}// end class

public class ATMTest{
	public static void main(String[] args){ 
	ATM atm = new ATM( ); 
	Thread hong = new Thread(atm,"홍길동"); 
	Thread lee = new Thread(atm, "이순신"); 
	hong.start( ); 
	lee.start( ); 
	}
}

