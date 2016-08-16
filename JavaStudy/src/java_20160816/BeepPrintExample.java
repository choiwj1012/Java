package java_20160816;

import java.awt.Toolkit;

public class BeepPrintExample {
	
	public static void main(String[] args){
	
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			
			toolkit.beep();
			
			try {
				
				Thread.sleep(500);
				
			}catch(Exception e){}
			
		} // for end
		
		for(int i=0; i<5; i++){
			
			System.out.println("띵");
			
			try{
				Thread.sleep(500);
			}catch(Exception e){}
			
		}
		
	} // main() end
	
}