
import java.util.Scanner;

public class FootballMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Scanner inputs for football statistics
		double touchdown;
		do{
			System.out.print("Number of touchdowns: ");
			 touchdown = input.nextDouble();
			 if(touchdown < 0.00)
					System.out.println("Error, please enter a number of touchdowns.");}
			while(touchdown < 0.00);
		
		double yards;
		do{
			System.out.print("Number of yards: ");
			 yards = input.nextDouble();
			 if(yards < 0.00)
					System.out.println("Error, please enter a number of yards.");}
			while(yards < 0.00);
		
		double inters;
		do{
			System.out.print("Number of interceptions: ");
			inters = input.nextDouble();
			 if(inters < 0.00)
					System.out.println("Error, please enter a number of interceptions.");}
			while(inters < 0.00);
		
		double compls;
		do{
			System.out.print("Number of completions: ");
			compls = input.nextDouble();
			 if(compls < 0.00)
					System.out.println("Error, please enter a number of completions.");}
			while(compls < 0.00);
	
		
		double att;
		do{
			System.out.print("Number of attempted passes: ");
			att = input.nextDouble();
			 if(att < 0.00)
					System.out.println("Error, please enter a number of attempted passes.");}
			while(att < 0.00);
		
		//Formulas to compute score
		double a = (((compls / att) - 0.3) * 0.5);
		
		double afixed;
		if(a > 2.375){
			afixed = 2.375;}
		else if(a < 0.00){
			afixed = 0.00;}
		else {
		afixed = a;}
			
		double b = (((yards / att) - 3) * 0.25);
		
		double bfixed;
		if(b > 2.375){
			bfixed = 2.375;}
		else if(b < 0.00){
			bfixed = 0.00;}
		else {
			bfixed = b;}
		
		double c = ((touchdown / att) * 20);
		
		double cfixed;
		if(c > 2.375){
			cfixed = 2.375;}
		else if(c < 0.00){
			cfixed = 0.00;}
		else {
			cfixed = c;}
		
		double d = (2.375 - (inters/att) * 25);
		
		double dfixed;
		if(d > 2.375){
			dfixed = 2.375;}
		else if(d < 0.00){
			dfixed = 0.00;}
		else {
			dfixed = d;}
		
		double passrate = ((afixed + bfixed + cfixed + dfixed) / 6) * 100;
		
		System.out.println(passrate);
						
	}
		
}
	
