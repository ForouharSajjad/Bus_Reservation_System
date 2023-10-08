package BusReservationSystem;

import java.io.*;
import java.util.Scanner;
import java.util.Date;
public  class BusReservationSystem{
	private static int[] seats = new int[12];
	public static void main(String args[]) throws IOException {
		System.out.println("\n-----Welcome to the BUS RESERVATION AND TICKETING SYSTEM -----");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user_id,password,yn,search,again,choice;
		int to=0,y=1,z=0,end=0,r=1;
		int seat[] = new int[20];
		int ticketI[][] = new int [100][3];
	    String ticketS[][] = new String[100][3];
	    double ticketD[][] = new double [100][3];
	    double ticketT[][] = new double [100][3];
	    double pay[] = new double[20];
	    double change[] = new double[20];
	    
	    for(int i=1;i<4;){
	    	System.out.print("Enter UserID: ");
	    	user_id = in.readLine();
	    	System.out.print("Enter Password: ");
	    	password = in.readLine();
	    	
	    	for(int o=1; o<=5; o++){
	    		seat[o]=20;
	    	} 
	     //if user and password are correct proceed to MAIN MENU//
	    	if(user_id.equals("1") && password.equals("1")){
	    		for(int x=1; x==1;){
	    			//the MAIN MENU//
	    			 System.out.println("********************************************");
	    	    	 System.out.println("** BUS RESERVATION AND TICKETING SYSTEM   **");
	    	    	 System.out.println("********************************************");
	    	    	 System.out.println("** [1] Destinations And Timings   **");
	    	    	 System.out.println("** [2] Booking                    **");
	    	    	 System.out.println("** [3] Billing                    **");
	    	    	 System.out.println("** [4] View                       **");
	    	    	 System.out.println("** [5] Cancelation                **");
	    	    	 System.out.println("** [6] Exit                       **");
	    	    	 System.out.println("************************************");
	    	    	 System.out.println("**********************************\n");
	    	    	 
	    	    	 for(x=1; x==1;){
	    	    		 System.out.print("ENTER CHOICE: ");
	    	    		 choice=in.readLine();
	    	    		  //if CHOICE is "1" display the DESTINATION//
	    				  if (choice.equals("1")){
	    					  //the DESTINATION DETAILS//
	    					//display the "Destination", every destination "Price",Timings and the "Seat" available//
	    					  System.out.println("***************************************");
	   						  System.out.println("**   DESTINATION     | PRICE  |     TIMEINGS       | SEAT  **");
	   	    				  System.out.println("***************************************");
	   						  System.out.println("** 1.)KARACHI CITY   | Rs1000 |  11:00am - 01:00pm | "+seat[1]+"   **");
	   	    				  System.out.println("** 2.)LAHORE CITY    | Rs1500 |  08:30am - 10:30am | "+seat[2]+"   **");
	   	    				  System.out.println("** 3.)ISLAMABAD CITY | Rs1600 |  07:00am - 08:00am | "+seat[3]+"   **");
	   	    				  System.out.println("** 4.)MULTAN CITY    | Rs1200 |  09:00am - 10:00am | "+seat[4]+"   **");
	   	    				  System.out.println("** 5.)FAISLABAD CITY | Rs1300 |  02:00pm - 03:00pm | "+seat[5]+"   **");
	   	    				  System.out.println("***************************************");
	   						  System.out.println("***************************************\n");
	    	    			  System.out.println(" STUDENT's & SENIOR CITIZEN's with 20% DISCOUNT!!!\n");	
	    	    			  x=0;
	    				  }
	    				   //if CHOICE is "2" proceed to Ticket Booking//
	    				  else if (choice.equals("2")){
	    					  int print=1;
	    					 //display first the Destination Details and Timings//
   							  System.out.println("***************************************");
   							  System.out.println("**   DESTINATION     | PRICE  |       TIMEINGS     | SEAT   **");
   	    					  System.out.println("***************************************");
   							  System.out.println("** 1.)KARACHI CITY   | Rs1000 |  11:00am - 01:00pm | "+seat[1]+"   **");
   	    					  System.out.println("** 2.)LAHORE CITY    | Rs1500 |  08:30am - 10:30am | "+seat[2]+"   **");
   	    					  System.out.println("** 3.)ISLAMABAD CITY | Rs1600 |  07:00am - 08:00am | "+seat[3]+"   **");
   	    					  System.out.println("** 4.)MULTAN CITY    | Rs1200 |  09:00am - 10:00am | "+seat[4]+"   **");
   	    				 	  System.out.println("** 5.)FAISLABAD CITY | Rs1300 |  02:00pm - 03:00pm | "+seat[5]+"   **");
   	    					  System.out.println("***************************************");
   							  System.out.println("***************************************\n");
   	    					  System.out.println(" STUDENT's & SENIOR CITIZEN's with 20% DISCOUNT!!!\n");
   	    					  {
   	    					  seats[i] = 0;
   	    					  }
   	    					  
   	    				// Setup our scanner and default the choice to window.
    				          Scanner s = new Scanner(System.in);
    				          int choice1 = 1;
    				
    				        // Ask user for a window or an aisle seat and store their coice.
    				          System.out.print("Please enter 1 for Window seat, 2 for Aisle seat, or 0 to exit: \n");
    	    				  choice1 = s.nextInt();
    	    				// While their choice is not the one for exit, execute our booking.
    				          while (choice1 != 0) {
    				        	  int seatnumber = 0;
    				        
    				            // If they chose a window seat, attempt to book it.
    				              if (choice1 == 1) {
    				            	  seatnumber = bookWindow();
    				                // No window seats available, try booking an aisle seat for them instead.
    				                  if (seatnumber == -1) {
    				                	  seatnumber = bookAisle();
    				                	  if (seatnumber != -1) {
    				                		  System.out.println("Sorry, we were not able to book a Window seat. But do have an Aisle seat.");  
    				                	  }
    				                  }
    				                	  else {
    				                		   // Booking a window seat was successful.
  	    				                    System.out.println("You are in luck, we have a window seat available!");
  	    				                    //BoardingPass(x);
    				                	  }
    				              }
    				              else if (choice1 == 2) {
    				                	// If they chose booking an isle, check to see if it is available.
	    				                seatnumber = bookAisle();
	    				                
	    				                // If not available, see if we have window seats available.
	    				                if (seatnumber == -1) {
	    				                    seatnumber = bookWindow();
	    				                    if (seatnumber != -1) {
	    				                        System.out.println("Sorry, we were not able to book this seat. But do have a window seat.");
	    				                    }
	    				                }
	    				                else {
	    				                    // Booking an aisle seat was successful.
	    				                    System.out.println("You are in luck, this seat is available!");
	    				                }
    				                }
    				                else {
	    				                // Print an error message if they did not choose 1, 2, or 0 for their choice.
	    				                System.out.println("Invalid choice made. Please try again!");
	    				                choice1 = 0;
	    				            }
    				                // No window or aisle seats were available. 
	    				            if (seatnumber == -1) {
	    				                System.out.println("We are sorry, there are no window or aisle seats available.");
	    				                System.out.println();
	    				            }
	    				            
	    				            // Reprompt for a choice
	    				            System.out.print("Please enter 1 for Window seat, 2 for Aisle seat, or 0 to exit:\n ");
	    				            choice1 = s.nextInt();
    				          }    				  
    	    					if((seat[1]==0)&&(seat[2]==0)&&(seat[3]==0)&&(seat[4]==0)&&(seat[5]==0)){
    	    						System.out.println("Sorry, We don't  have available seats for all Destination!");
    	    						x=0;    	    						    	    						
    	    					}
    	    					
    	    					//inputing of Passenger's Name//
    	    					else{
    	    						for(x=1; x==1;){
	    	    						System.out.print("\nENTER PASSENGER'S NAME: ");
	    	    						ticketS[z][0] = in.readLine();	    								
	    								x=0;
	    								
	    								//if Passenger's Name already used, display error and go back to Inputing//
	    	    						for(int l=0; l<z; l++){
	    	    							if(ticketS[l][0].equalsIgnoreCase(ticketS[z][0])){
	    	    								System.out.println("Sorry, Passenger's name have already used!");
	    	    								x=1;
	    	    							}
	    	    						}
    	    						}
    	    						 
	    	    					//inputing of Destination//
	    	    					//integers Only [1-5]//
	    	    					for(x=1; x==1;){
	    	    						System.out.print("ENTER DESTINATION [number]: ");
	    	    						to = Integer.parseInt(in.readLine());
	    	    						
	    	    						//if Inputed integers are "<1" or ">5", display error and go back to Inputing//
	    	    						if(to<1 || to>5){
	    	    							System.out.println("Invalid Input!");
	    	    							x=1;
	    	    						}
	    	    						//if available seat is eqaul to "Zero", display error and go back to Inputing//
	    	    						for(int d=1; d<=5; d++){
	    	    							if(to==d){
	    	    								if(seat[to]==0){
	    	    									System.out.println("Sorry, We don't have available seat!");
	    	    									x=1;
	    	    								}
	    	    								x=0;
	    	    							}
	    	    						}
	    	    					}
	    	    					
	    	    					//convert the integer to string//
	    	    					String dest[] = { " ", "KARACHI CITY   11:00am - 01:00pm", "LAHORE CITY   08:30am - 10:30am", "ISLAMABAD CITY    07:00am - 08:00am", "MULTAN CITY   09:00am - 10:00am", "FAISLABAD CITY   02:00pm - 03:00pm"};
	    	    					double price[] = { 0,1000,1500,1600,1200,1300};
	    	    					//double time[] = {0,11.00-1.00,08.30-10.30,07.00-08.00,09.00-10.00,02.00-03.00};	    	    		
	    	    					//converted integer to string, transfer to storage array//
	    	    					ticketS[z][1] = dest[to];
	    	    					ticketD[z][0] = price[to];
	    	    					//ticketT[z][0] = time[to];
	    	    					//inputing for Number of Passenger's//
	    	    					for(x=1; x==1;){
	    	    					System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
	    	    					ticketI[z][0] = Integer.parseInt(in.readLine());
	    	    		
	    	    						//subtract the available seat by the the number inputed//
	    	    						for(int p=1; p<=5; p++){
	    	    							if(to==p){
	    	    								print=1;
	    	    								seat[to] = seat[to]-ticketI[z][0];
	    	    								
	    	    								//if the subtracted available seat is "<0", display error//
	    	    								//add the inputed number to the subtracted seat, to back the original seat//
	    	    								//display the available seat and back to the inputing//
	    	    								if(seat[to]<0){
	    	    									System.out.print("Sorry, We don't have seat available for " +ticketI[z][0] +" person\n");
	    	    									seat[to] = seat[to]+ticketI[z][0];
	    	    									System.out.print("We only have " +seat[to] +" seat available\n");
	    	    									x=1;
	    	    									print=0;
	    	    								}
	    	    								else{
	    	    									x=0;
	    	    								}
	    	    							}
	    	    						}
	    	    		
	    	    					}
	    	    					
	    	    					//inputing for Number of Discounted Passenger's//
	    	    					for(x=1;x==1;){
	    	    						System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
	    	    						ticketI[z][1] = Integer.parseInt(in.readLine());	    	    					
	    	    						if(ticketI[z][1]>ticketI[z][0]){	    	    							
	    	    							System.out.println("Invalid Input!");
	    	    							System.out.println("No. of Passengers are only " +ticketI[z][0] +"!");
	    	    						x=1;
	    	    						}
	    	    						else{
	    	    							break;
	    	    						}
	    	    					}
	    	    			    	    		
	    	    					//print out of passengers details....	    	    		
	    	    					if(print==1){
	    	    						System.out.println("\n***************************************");
	    	    						System.out.println("**        PASSENGER'S DETAILS        **");
	    	    						System.out.println("***************************************");
	    	    						System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
	    	    						System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
	    	    						System.out.println("PRICE: Rs " + ticketD[z][0]);
	    	    						//System.out.println("TIME:  " + ticketT[z][0]+"am-pm");
	    	    						System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
	    	    						System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[z][1]);
	    	    						System.out.println("***************************************");
	     	    						System.out.println("***************************************\n");
	    	    						ticketS[z][2]="0";
	    	    						double discount=(ticketD[z][0]-(ticketD[z][0]*0.2))*ticketI[z][1];
	    	    						ticketD[z][2]= ((ticketI[z][0]-ticketI[z][1])*ticketD[z][0])+discount;
	    	    						x=0;
	    	    					}
	    	    					z++;	    	    						
    	    					}
    				        }	    				   		
	    						else if (choice.equals("3")){    
	    							for(x=1; x==1;){
	    									System.out.print("ENTER PASSENGER'S NAME: ");
	    									search = in.readLine();
	    									int s=1;
	    									for(int b=0;b<z;b++){
	    										if(search.equalsIgnoreCase(ticketS[b][0])){
	    											System.out.println("***************************************");
	    		    								System.out.println("**        PASSENGER'S DETAILS        **");
	    		    								System.out.println("***************************************");
	    		    								System.out.println("PASSENGER'S NAME: " + ticketS[b][0]);
	    		    								System.out.println("PASSENGER'S DESTINATION : " + ticketS[b][1]);
	    		    								System.out.println("PRICE: Rs" + ticketD[b][0]);
	    		    								//System.out.println("TIME: " + ticketT[z][0]);
	    		    								System.out.println("NO. OF PASSENGERS: " + ticketI[b][0]);
	    		    								System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[b][1]);
	    			 		   						System.out.println("***************************************");
	    		    								System.out.println("***************************************");
	    		    								s=0;
	    											x=0;
	    											if(ticketS[b][2].equals("x")){
	    		    									System.out.println("Passenger's Already Paid!");
	    		    									x=0;
	    		    								}
	    		    								else{
	    		    									ticketS[b][2]="x";	    		    								    		    							
	    		    									for(x=1; x==1;){
	    		    										System.out.println("\nPASSENGER'S TOTAL Price: Rs "+ticketD[b][2]);
	    		    										System.out.print("ENTER AMOUNT TO PAY: ");
	    		    										pay[b] = Double.parseDouble(in.readLine());
	    		    										change[b]=pay[b]-ticketD[b][2];	    		    							
	    		    										if(change[b]<0){
	    		    											System.out.println("Invalid Input!");
	    		    											x=1;
	    		    										}
	    		    										else{
	    		    											System.out.println("CHANGE: Rs "+change[b]);
	    		    											System.out.println("");
	    		    											x=0;
	    		    										}
	    		    									}
	    											}
	    										}
	    									}
	    									
	    									if (s==1){
	    										System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
	    										for(int q=1; q==1;){	    										
	    										System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
	    										again=in.readLine();	    										
	    										if(again.equalsIgnoreCase("y")){
	    											q=0;
	    										}
	    										else if (again.equalsIgnoreCase("n")){
	    											q=0;
	    											x=0;	    											
	    										}
	    										else{
	    											System.out.println("\nInvalid input!\n");
	    										}
	    									}
	    								}	
	    							}	    				            
	    						}
	    				   	    				   
	    						else if (choice.equals("4")){
	    							for(int sx=1; sx<=3;){
	    	 						System.out.print("SEARCH PASSENGER'S NAME: ");
	    	    					search = in.readLine();
	    	    		 		   	int s=1;
	    								for(x=0; x<=z; x++){
	    									if(search.equalsIgnoreCase(ticketS[x][0])){
	    										System.out.println("***************************************");
	    	    								System.out.println("**        PASSENGER'S DETAILS        **");
	    	    								System.out.println("***************************************");
	    	    								System.out.println("PASSENGER'S NAME: " + ticketS[x][0]);
	    	    								System.out.println("PASSENGER'S DESTINATION : " + ticketS[x][1]);
	    	    								System.out.println("PRICE: Rs" + ticketD[x][0]);
	    	    								//System.out.println("TIME: " + ticketT[x][0]);
	    	    								System.out.println("NO. OF PASSENGERS: " + ticketI[x][0]);
	    	    								System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
	    	    								System.out.println("TOTAL PRICE: Rs " + ticketD[x][2]);
	    	    								if(ticketS[x][2].equals("x")){
	    	    									System.out.println("PAY: Rs " +pay[x]);
	    	    									System.out.println("CHANGE: Rs " +change[x]);
	    	    									System.out.println("STATUS: PAID");
	    	    								}
	    	    								else{
	    	    									System.out.println("STATUS: NOT PAID");
	    	    								}
	    	    								
	    	    								s=0;
	    									    sx=4;
	    									}
	    								}	
	    								if (s==1){
	    									System.out.println("Passenger's Name not found!");
	    									sx++;
	    								}
	    					    	}
	    							 Tickets(x);
	    						}		
	    						else if(choice.equals("5")) {
	    							end=1;
	    							x=0;
	    							System.out.println("\nYour Booking is CANCELED!!");
	    							System.out.println("\nPlease Visit for the next time");
	    							System.out.println("\nThank You!");
	    						}
	    						else if(choice.equals("6")){
	    							end=1;
	    							x=0;
	    							System.out.println("Thank You!");
	    						}
	    					
	    						else{
	    							System.out.println("Invalid Input!");
	    							x=1;
	    						}
	    	    			}
	    	    	
	    	    			for(y=1; y==1;){
	    	    				if(end==1){
	    	    					break;
	    	    				}
	    	    				System.out.print("Do you want another transaction? [Y/N]: ");
	    	   				 	yn = in.readLine();
	    	    	
	    	    				if (yn.equalsIgnoreCase("y")){
	    	    					x=1;
	    	    					y=0;
	    	    				}
	    	    				else if (yn.equalsIgnoreCase("n")){
	    	    					System.out.println("\nThank You!!!");
	    	    					break;
	    	    				}
	    	    				else{
	    	    					System.out.println("Invalid Input!!!");
	    	    					y=1;
	    	    				}
	    	    			}
	    	    		}
	    	    		i=4;
	    	    	}
	    	    	else{
	    	    		System.out.println("\nInvalid user or password!\n");
	    	    		i++;
	    			}
	    	    }	 
	    }
	    // This function checks for window seats and returns seat number or -1 if full.	  
	    // This simply prints out a nice little boarding pass message with their seat number and date of issue.
		  private static int bookWindow() {
		        for (int i = 0; i < 6; i++) {
		            if (seats[i] == 0) {
		                seats[i] = 1;
		                return i + 1;
		            }
		        }
		        return -1;
		    }
		    // This function checks to see if aisle seats were available, -1 if full.
		    private static int bookAisle() {
		        for (int i = 6; i < 12; i++) {
		            if (seats[i] == 0) {
		                seats[i] = 1;
		                return i + 1;
		            }
		        }
		        return -1;
		    }
	    private static void Tickets(int seatnumber) {
	
	        Date timenow = new Date();
	        System.out.println();
	        System.out.println("Date: " + timenow.toString());
	        System.out.println("Ticket for seat number: " + seatnumber);
	        System.out.println("This ticket is non-refundable and non-transferable.");
	        System.out.println("\nPlease be curteous, do not smoke. Enjoy your trip.");
	        System.out.println("***************************************");
			System.out.println("***************************************");
	        System.out.println();
	    }	
	}
