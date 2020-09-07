package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
public class Oppgavenr6 {
public static void main(String[] args) {
		
		
		
		int t = Integer.parseInt(showInputDialog("Heltal"));
		
		
		int p = 1;
		
			while (t>=1) {
				p *=t;
				t--;
				
			System.out.println(p);
			
			}
		
		
		
}
}