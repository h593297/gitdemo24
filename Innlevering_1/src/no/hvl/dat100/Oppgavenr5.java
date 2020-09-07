package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Oppgavenr5 {

	public static void main(String[] args) {
		

		int studenter = 10;
		
		for (int i=1; i <= studenter; i++) {
		
		int poengsum = parseInt(showInputDialog(" Poengsum student: " + i));
			
		if (poengsum >= 90 && poengsum <=100 ) {
			showMessageDialog(null, "Karakter: A");
		
		} else if (poengsum >= 80 && poengsum <= 89  ) {
			showMessageDialog(null, "Karakter: B");
		
	}     else if (poengsum >= 60 && poengsum <=79 ) {
			showMessageDialog(null, "Karakter: C" );
			
	}	  else if (poengsum >= 50 && poengsum <=59) {
			showMessageDialog(null, " Karakter: D ");
			
	}	  else if (poengsum >= 40 && poengsum <= 49) {
			showMessageDialog(null, " Karakter E ");
			
	}	  else if (poengsum >=0 && poengsum <= 39) {
			showMessageDialog(null, " Karakter F: ");
	
	}     else if (poengsum < 0 || poengsum > 100) {
			i--;
			showMessageDialog(null, " Error ! ");
	
		
			}
			}
	
		
		
		
	}

}
