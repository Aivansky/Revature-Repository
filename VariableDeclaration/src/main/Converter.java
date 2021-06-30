package main;
import java.util.Scanner;

public class Converter {

		  public void display_menu() {
		    System.out.println ( 
		    		"Please select an option:\r\n"
		    		+ "1.Volume Conversions\r\n"
		    		+ "2.Distance Conversions\r\n"
		    		+ "3. Quit" );
		  }
		  
		  public Converter() {
		    Scanner scan = new Scanner ( System.in );
		    display_menu();
		    int menuSelection = scan.nextInt();
		    while(menuSelection!=3) {
		    switch (menuSelection ) {
		      case 1:
		        System.out.println (
		        		"1.Teaspoons to Tablespoons\r\n"
		        		+ "2.Teaspoons to Cups" );
		        Scanner scan2 = new Scanner ( System.in );
		        int menuSelectionVol = scan2.nextInt();
		        switch (menuSelectionVol ) {
		        case 1:
		        	System.out.println ( "How many Teaspoons to Tablespoons?" );
		        	TeaspoonstoTablespoons();
		        	display_menu();
		        	menuSelection = scan.nextInt();
		            break;
		        case 2:
		        	System.out.println ( "How many Teaspoons to Cups?" );
		        	TeaspoonstoCups();
		        	display_menu();
		        	menuSelection = scan.nextInt();
		            break;
		        }
		        break;
			case 2:
		        System.out.println ( 
		        		"1.Feet to Meters\r\n"
		        		+ "2.Miles to Kilometers" );
		        Scanner scan3 = new Scanner ( System.in );
		        int menuSelectionDis = scan3.nextInt();
		        switch (menuSelectionDis ) {
		        case 1:
		        	System.out.println ( "How many Feet to Meters?" );
		        	FeettoMeters();
		        	display_menu();
		        	menuSelection = scan.nextInt();
		            break;
		        case 2:
		        	System.out.println ( "How many Miles to Kilometers?" );
		        	MilesToKilometers();
		        	display_menu();
		        	menuSelection = scan.nextInt();
		            break;
		        }
		        break;
		      default:
		    	  System.out.println ( "Could not Understand" );
		    	  menuSelection = scan.nextInt();
			        break;
		    }
		    }
		  }
		  
		  private double MilesToKilometers() {
			  Scanner Miles = new Scanner ( System.in );
			  double convert4 = Miles.nextInt();
			  double sol4;
			  sol4=convert4* 1.609;
			  System.out.println(sol4+" Kilometers");
			  return sol4;	
		}

		private double FeettoMeters() {
			Scanner Feet = new Scanner ( System.in );
			  double convert2 = Feet.nextInt();
			  double sol3;
			  sol3=convert2/3.281;
			  System.out.println(sol3+" Meters");
			  return sol3;
		}

		private double TeaspoonstoCups() {
			  Scanner Tea2 = new Scanner ( System.in );
			  double convert2 = Tea2.nextInt();
			  double sol2;
			  sol2=convert2/48;
			  System.out.println(sol2+" Cups");
			  return sol2;
		}

		private double TeaspoonstoTablespoons() {
			  Scanner Tea1 = new Scanner ( System.in );
			  double convert1 = Tea1.nextInt();
			  double sol1;
			  sol1=convert1/3;
			  System.out.println(sol1+" tablespoons");
			  return sol1;
		}



		public static void main ( String[] args ) {
		    new Converter();
		  }
}
