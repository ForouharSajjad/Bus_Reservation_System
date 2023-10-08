#include<stdio.h>
#include<conio.h>
#include<math.h>

int main()
{
	int pr1 = 0;
	int b1s[40];
	int b2s[50];
	int b3s[30];
	int b4s[40];
	int b5s[50];
	int b6s[30];
	int b7s[40];
	int b8s[50];
	int b9s[30];
	int b10s[40];
	int b11s[50];
	int b12s[30];
	int c1 = 0;
	int c2 = 0;
	int c3 = 0;
	int c4 = 0;
	int c5 = 0;
	int c6 = 0;
	int c7 = 0;
	int c8 = 0;
	int c9 = 0;
	int c10 = 0;
	int c11 = 0;
	int c12 = 0;
	int sizeb1 = sizeof(b1s) / 4;
	int sizeb2 = sizeof(b2s) / 4;
	int sizeb3 = sizeof(b3s) / 4;
	int sizeb4 = sizeof(b4s) / 4;
	int sizeb5 = sizeof(b5s) / 4;
	int sizeb6 = sizeof(b6s) / 4;
	int sizeb7 = sizeof(b7s) / 4;
	int sizeb8 = sizeof(b8s) / 4;
	int sizeb9 = sizeof(b9s) / 4;
	int sizeb10 = sizeof(b10s) / 4;
	int sizeb11 = sizeof(b11s) / 4;
	int sizeb12 = sizeof(b12s) / 4;
	int bus1, bus2, bus3;
	int bus[32];
	int num = 0, i,bs,n,seat;
	char ch;
	
	printf("\n\n==================== WELCOME TO BUS RESERVATION SYSTEM ====================\n\n\n");
	printf("\n\t\t\tEnter 1 for Routes/Destination"); 
	printf("\n\t\t\tEnter any num to exite this application");
	printf("\n\n\t\t\t\t\t\tYour Choice : ");
	scanf_s("%d", &num);
	if (num == 1)
	{ 
		printf("\n\n\t================== Choose Your Routes/Destination ===================\n\n\n");
		printf("|\t1) Karachi To Nooriabd |\t\n");
		printf("|\t2) Karachi To Hyderabad |\t\n");
		printf("|\t3) Karachi To Multan |\t\n");
		printf("|\t4) Karachi To Lahore |\t\n");
		printf("\n\n\t\t\t\t\tYour Choice : ");
		scanf_s("%d",  &n);
		switch (n)
		{
		case 1:
		{
			printf("\nSelect Bus Status of Karachi To Nooriabd");
			printf("\n\n\t===================  Bus - Status ===================\n\n\n");
			printf("\n\t\t\t| 1) Daewoo");
			printf("\n\t\t\t| 2) Local");
			printf("\n\t\t\t| 3) Business");
			printf("\n\n\t\t\t\t\t\tYour Choice : ");
			scanf_s("%d", &bs);
			if (bs == 1)
			{
				printf("\n\n\t=================== Bus -  Daewoo ===================\n\n");
				printf("\n\t\t\t| Daewoo |");
				printf("\n\t\t\t| Timing (9:00-AM) |");
				printf("\n\t\t\t| Ticket price = 1000Rs |");
				printf("\n\t\t\t| Driver Name Arsalan Sheikh |");
				printf("\n\t40 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 40)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb1 - c1);
				}
				printf("\n\tBus1");
			}

			else if (bs == 2)
			{
				printf("\n\n\t=================== Bus - Local ===================\n\n\n");
				printf("\n\t\t\t| Local |");
				printf("\n\t\t\t| Timing (10:30-AM) |");
				printf("\n\t\t\t| Ticket price = 600Rs |");
				printf("\n\t\t\t| Driver Name Ahmed Bhutt |");
				printf("\n\t50 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 50)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb2 - c2);
				}
				printf("\n\tBus2");
			}
			else if (bs == 3)
			{
				printf("\n\n\t=================== Bus - Business ===================\n\n\n");
				printf("\n\t\t\t| Business |");
				printf("\n\t\t\t| Timing (11:30-PM) |");
				printf("\n\t\t\t| Ticket price = 100Rs |");
				printf("\n\t\t\t| Driver Name Amir khan |");
				printf("\n\t30 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 30)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb3 - c3);
				}
				printf("\n\tBus3");
			}
			else
			{
				printf("\n\n\t Choose a Valid Option");
				return 0;
			}
			{
			printf("\n\nSelect Theme");
			printf("\n\n\t=================== Options ===================\n\n\n");
			printf("\n\t\t\t| 1)Red & Bright White");
			printf("\n\t\t\t| 2)Light Blue & White");
			printf("\n\t\t\t| 3)Light Yellow & Black");
			printf("\n\t\t\t| 4)Light Aqua & Black");
			printf("\n\t\t\t| 5)Default");
			printf("\n\t\t\t| 0)Back\n");
			printf("\n\n\t\t\t\tYour Choice : ");
			scanf_s("%d", &num);

			switch (num)
			{
			case 1:
				printf("color 4f");
				break;
			case 2:
				printf("color 97");
				break;
			case 3:
				printf("color 6a");
				break;
			case 4:
				printf("color b2");
				break;
			case 5:
				printf("color c4");
				break;
			default:
				printf("welcome");
			}
			printf("\n\n\tThanks For Booking");
		}
		}
		break;
		_getch();
		case 2:
		{
			printf("\nSelect Bus Status of Karachi To Hyderabad");
			printf("\n\n\t===================  Bus - Status ===================\n\n\n");
			printf("\n\t\t\t| 1) Daewoo");
			printf("\n\t\t\t| 2) Local");
			printf("\n\t\t\t| 3) Business");
			printf("\n\n\t\t\t\t\t\tYour Choice : ");
			scanf_s("%d", &bs);
			if (bs == 1)
			{
				printf("\n\n\t=================== Bus -  Daewoo ===================\n\n");
				printf("\n\t\t\t| Daewoo |");
				printf("\n\t\t\t| Timing (11:00-AM) |");
				printf("\n\t\t\t| Ticket price = 1200Rs |");
				printf("\n\t\t\t| Driver Name Umer Sheikh |");
				printf("\n\t40 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 40)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb4 - c4);
				}
				printf("\n\tBus4");

			}
			else if (bs == 2)
			{
				printf("\n\n\t=================== Bus - Local ===================\n\n\n");
				printf("\n\t\t\t| Local |");
				printf("\n\t\t\t| Timing (12:30-AM) |"); 
				printf("\n\t\t\t| Ticket price = 800Rs |");
				printf("\n\t\t\t| Driver Name Arsal Shah |");
				printf("\n\t50 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);

				if (seat <= 50)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb5 - c5);
				}
				printf("\n\tBus5");
			}
			else if (bs == 3)
			{
				printf("\n\n\t=================== Bus - Business ===================\n\n\n");
				printf("\n\t\t\t| Business |");
				printf("\n\t\t\t| Timing (1:30-PM) |");
				printf("\n\t\t\t| Ticket price = 1500Rs |");
				printf("\n\t\t\t| Driver Name Faizan Khan |");
				printf("\n\t30 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 30)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb6 - c6);
				}
				printf("\n\tBus6");
			}
			else
			{
				printf("\n\n\t Choose a Valid Option");
				return 0;
			}
			{
				printf("\n\nSelect Theme");
				printf("\n\n\t=================== Options ===================\n\n\n");
				printf("\n\t\t\t| 1)Red & Bright White");
				printf("\n\t\t\t| 2)Light Blue & White");
				printf("\n\t\t\t| 3)Light Yellow & Black");
				printf("\n\t\t\t| 4)Light Aqua & Black");
				printf("\n\t\t\t| 5)Default");
				printf("\n\t\t\t| 0)Back\n");
				printf("\n\n\t\t\t\tYour Choice : ");
				scanf_s("%d", &num);

				switch (num)
				{
				case 1:
					printf("color 4f");
					break;
				case 2:
					printf("color 97");
					break;
				case 3:
					printf("color 6a");
					break;
				case 4:
					printf("color b2");
					break;
				case 5:
					printf("color c4");
					break;
				default:
					printf("welcome");
				}
				printf("\n\n\tThanks For Booking");
			}
		}
		break;
		_getch();
		case 3:
		{
			printf("\nSelect Bus Status of Karachi To Multan");
			printf("\n\n\t===================  Bus - Status ===================\n\n\n");
			printf("\n\t\t\t| 1) Daewoo");
			printf("\n\t\t\t| 2) Local");
			printf("\n\t\t\t| 3) Business");
			printf("\n\n\t\t\t\t\t\tYour Choice : ");
			scanf_s("%d", &bs);
			if (bs == 1)
			{
				printf("\n\n\t=================== Bus -  Daewoo ===================\n\n");
				printf("\n\t\t\t| Daewoo |");
				printf("\n\t\t\t| Timing (8:00-AM) |");
				printf("\n\t\t\t| Ticket price = 4000Rs |");
				printf("\n\t\t\t| Driver Name Mueed Ali |");
				printf("\n\t40 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);

				if (seat <= 40)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb7 - c7);
				}
				printf("\n\tBus7");
			}
			else if (bs == 2)
			{
				printf("\n\n\t=================== Bus - Local ===================\n\n\n");
				printf("\n\t\t\t| Local |");
				printf("\n\t\t\t| Timing (9:30-AM) |");
				printf("\n\t\t\t| Ticket price = 3000Rs |");
				printf("\n\t\t\t| Driver Name Huzaifa Khan |");
				printf("\n\t50 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 50)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb8 - c8);
				}
				printf("\n\tBus8");
			}
			else if (bs == 3)
			{
				printf("\n\n\t=================== Bus - Business ===================\n\n\n");
				printf("\n\t\t\t| Business |");
				printf("\n\t\t\t| Timing (11:30-AM) |");
				printf("\n\t\t\t| Ticket price = 5000Rs |");
				printf("\n\t\t\t| Driver Name Hamza Asgar |");
				printf("\n\t30 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 30)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb9 - c9);
				}
				printf("\n\tBus9");
			}
			else
			{
				printf("\n\n\t Choose a Valid Option");
				return 0;
			}
			{
				printf("\n\nSelect Theme");
				printf("\n\n\t=================== Options ===================\n\n\n");
				printf("\n\t\t\t| 1)Red & Bright White");
				printf("\n\t\t\t| 2)Light Blue & White");
				printf("\n\t\t\t| 3)Light Yellow & Black");
				printf("\n\t\t\t| 4)Light Aqua & Black");
				printf("\n\t\t\t| 5)Default");
				printf("\n\t\t\t| 0)Back\n");
				printf("\n\n\t\t\t\tYour Choice : ");
				scanf_s("%d", &num);

				switch (num)
				{
				case 1:
					printf("color 4f");
					break;
				case 2:
					printf("color 97");
					break;
				case 3:
					printf("color 6a");
					break;
				case 4:
					printf("color b2");
					break;
				case 5:
					printf("color c4");
					break;
				default:
					printf("welcome");
				}
				printf("\n\n\tThanks For Booking");
			}
		}
		break;
		_getch();
		case 4:
		{
			printf("\nSelect Bus Status of Karachi To Lahore");
			printf("\n\n\t===================  Bus - Status ===================\n\n\n");
			printf("\n\t\t\t| 1) Daewoo");
			printf("\n\t\t\t| 2) Local");
			printf("\n\t\t\t| 3) Business");
			printf("\n\n\t\t\t\t\t\tYour Choice : ");
			scanf_s("%d", &bs);
			if (bs == 1)
			{
				printf("\n\n\t=================== Bus -  Daewoo ===================\n\n");
				printf("\n\t\t\t| Daewoo |");
				printf("\n\t\t\t| Timing (10:00-AM) |");
				printf("\n\t\t\t| Ticket price = 4000Rs |");
				printf("\n\t\t\t| Driver Name Noman Shah |");
				printf("\n\t40 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 40)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb10 - c10);
				}
				printf("\n\tBus10");
			}
			else if (bs == 2)
			{
				printf("\n\n\t=================== Bus - Local ===================\n\n\n");
				printf("\n\t\t\t| Local |");
				printf("\n\t\t\t| Timing (12:30-PM) |");
				printf("\n\t\t\t| Ticket price = 3000Rs |");
				printf("\n\t\t\t| Driver Name Usama Khan |");
				printf("\n\t50 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 50)
				{
					printf("\nYour seat no:%d in this bus", seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb11 - c11);
				}
				printf("\n\tBus11");
			}
			else if (bs == 3)
			{
				printf("\n\n\t=================== Bus - Business ===================\n\n\n");
				printf("\n\t\t\t| Business |");
				printf("\n\t\t\t| Timing (2:30-PM) |");
				printf("\n\t\t\t| Ticket price = 5000Rs |");
				printf("\n\t\t\t| Driver Name Raza Haider |");
				printf("\n\t30 Seats available");
				printf("\nSeat Number: ");
				scanf_s("%d", &seat);
				if (seat <= 30)
				{
					printf("\nYour seat no:%d in this bus",seat);
				}
				else
				{
					printf("\n\t\t\t| Seats Available - %d |\n", sizeb12 - c12);
				}
				printf("\n\tBus12");
			}
			else
			{
				printf("\n\n\t Choose a Valid Option");
				return 0;
			}
			{
				printf("\n\nSelect Theme");
				printf("\n\n\t=================== Options ===================\n\n\n");
				printf("\n\t\t\t| 1)Red & Bright White");
				printf("\n\t\t\t| 2)Light Blue & White");
				printf("\n\t\t\t| 3)Light Yellow & Black");
				printf("\n\t\t\t| 4)Light Aqua & Black");
				printf("\n\t\t\t| 5)Default");
				printf("\n\t\t\t| 0)Back\n");
				printf("\n\n\t\t\t\tYour Choice : ");
				scanf_s("%d", &num);

				switch (num)
				{
				case 1:
					printf("color 4f");
					break;
				case 2:
					printf("color 97");
					break;
				case 3:
					printf("color 6a");
					break;
				case 4:
					printf("color b2");
					break;
				case 5:
					printf("color c4");
					break;
				default:
					printf("welcome");
				}
				printf("\n\n\tThanks For Booking");
			}
		}
		break;
		_getch();
		default:
			printf("\n\n\t Choose a Valid Option");
			
		}
		
	}
	else
	{
		printf("Thanks For Visiting");
	}
	
	_getch();
}
