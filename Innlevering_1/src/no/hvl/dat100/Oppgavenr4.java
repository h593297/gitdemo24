package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Oppgavenr4 {
	public static void main(String[] args) {
		
		
		

		
		 int trinnskatt = parseInt(showInputDialog("Brutto"));
		 
		 double trinn1 = (67850 * 0.0093);
		 double trinn2 = (349700 * 0.0241);
		 double trinn3 = (354400 * 0.1152);
		 
		 
		 
		 if ( trinnskatt <= 164100 ) {
			 showMessageDialog(null, "Du betaler ikke skatt"); 
		
		 } else if (trinnskatt <= 230950) {
			 showMessageDialog(null, " Du betaler: " + (trinnskatt - 164100 )  
					 * 0.0093 + " kr ");
			 
		 } else if (trinnskatt <=580650 ) {
			 showMessageDialog(null, " Du betaler: " + ((trinnskatt - 230950)
					 * 0.0241 + trinn1 + " kr "));
			 
		 } else if (trinnskatt <= 935050 ) {
			 showMessageDialog(null, " Du betaler; " + ((trinnskatt - 580650)
					 *0.115 + trinn1 + trinn2) + " kr ");	
			 
		 } else if (trinnskatt >= 935050) {
			 showMessageDialog(null, " Du betaler; " + ((trinnskatt-935050)
					 *0.1452 + trinn1 + trinn2 + trinn3) + " kr ");
			
		
		
		
		
		 }
		
		
		
		
}
}
