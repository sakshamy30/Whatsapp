import java.util.*;
class Whatsapp
{
	Scanner sc = new Scanner(System.in);
	long phno;
	String name1;
	String about;
	int OTP;	
	public void login()
	{
		System.out.println();
		System.out.println("========== SIGN-UP ==========");
		System.out.println();
		Random rm = new Random();
		System.out.println("Enter your Phone Number");
		phno = sc.nextLong();
		long temp = phno;
		int count=0;
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		if(count == 10)
		{
			System.out.println("OTP is send to your phone number");
			int otp = rm.nextInt(9000) + 1000;
			System.out.println(otp);
			System.out.println("Enter the OTP generated");
			OTP = sc.nextInt();
			if(OTP == otp)
			{
				System.out.println("OTP Verified :)");
			}
			else
			{
				System.out.println("Invalid OTP!!!");
				System.exit(0);
			}
		}
		else
		{
			System.err.println("*************** Invalid Phone Number ****************");
			System.exit(0);
		}
		System.out.println();
		System.out.println("Enter Your Name");
		name1 = sc.next();
		System.out.println("Enter Description");
		about = sc.next();
		System.out.println();
		System.out.println("============================================");
		System.out.println("You Have Successfully Logged In to Whatsapp");
		System.out.println("============================================");
		System.out.println();
	}
}
class Chat extends Whatsapp
{
	Scanner sc = new Scanner(System.in);
	String choice;
	String name2;
	String name3;
	String gname;
	String choice3;
	public void privateChat()
	{
		System.out.println();
		System.out.println("Do you want to chat with Someone from your Contact?");
		System.out.println("Type Y or N");
		choice = sc.next();
		if(choice.equals("Y") || choice.equals("y"))
		{
			System.out.println("Search their name");
			name2 = sc.next();
			System.out.println();
			System.out.println("This is a private chat of "+name2);
			System.out.println("It is end to end encrypted chat");

		}
		else if(choice.equals("N") || choice.equals("n"))
		{
			System.out.println("Okay Thankyou!");
		}
		else
		{
			System.out.println("Sorry Invalid Choice :(");
		}
		System.out.println();
	}
	public void groupChat()
	{
		System.out.println("Do you want to make a Group?");
		System.out.println("Type Y or N");
		choice3 = sc.next();
		if(choice3.equals("Y") || choice3.equals("y"))
		{
			System.out.println("Add a Group Name");
			gname = sc.next();
			System.out.println("How many Participants do you want to add?");
			int n = sc.nextInt();
			if(n<=1024)
			{
				System.out.println("Search their names");
				for(int i=1; i<=n; i++)
				{
					name3 = sc.next();
				}
				System.out.println();
				System.out.println("A Group is created :)");
				System.out.println("Group name is "+gname+" and there are "+n+" Participants in this Group.");
			}
			else
			{
				System.out.println("Can not add more than 1024 Participants in a Group :(");
			}
		}
		else if(choice3.equals("N") || choice3.equals("n"))
		{
			System.out.println("Okay Thankyou!");
		}
		else
		{
			System.out.println("Sorry Invalid Choice :(");
		}
	}
}
class Call extends Whatsapp
{
	Scanner sc = new Scanner(System.in);
	String choice2;
	String name4;
	String name5;
	int n2;
	String choice4;
	String name6;
	String name7;
	int n3;
	public void audioCall()
	{
		System.out.println();
		System.out.println("Do you want to Audio Call Someone?");
		System.out.println("Type Y or N");
		choice2 = sc.next();
		if(choice2.equals("Y") || choice2.equals("y"))
		{
			System.out.println("Search their name");
			name4 = sc.next();
			System.out.println();
			System.out.println("It is a Audio Call with "+name4);
			System.out.println();
			System.out.println("Do you want to add more people");
			System.out.println("Type Y or N");
			choice2 = sc.next();
			if(choice2.equals("Y") || choice2.equals("y"))
			{
				System.out.println("How many Participants do you want to add?");
				n2 = sc.nextInt();
				if(n2<=32)
				{
					System.out.println("Search their names");
					for(int i=1; i<=n2; i++)
					{
						name5 = sc.next();
					}
					System.out.println();
					System.out.println("This is Group Audio Call and there are "+n2+" Participants in this Call :)");
				}
				else 
				{
					System.out.println("You can not add more than 32 People :(");
				}
			}
			else if(choice2.equals("N") || choice2.equals("n"))
			{
				System.out.println("Okay Thankyou!");
			}
			else
			{
				System.out.println("Sorry Invalid Choice :(");
			}		
		}
		else if(choice2.equals("n") || choice2.equals("N"))
		{
			System.out.println("Okay Thankyou!");
		}
		else
		{
			System.out.println("Sorry Invalid Choice :(");
		}
	}
	public void videoCall()
	{
		System.out.println();
		System.out.println("Do you want to Video Call Someone?");
		System.out.println("Type Y or N");
		choice4 = sc.next();
		if(choice4.equals("Y") || choice4.equals("y"))
		{
			System.out.println("Search their name");
			name6 = sc.next();
			System.out.println();
			System.out.println("It is a Video Call with "+name6);
			System.out.println();
			System.out.println("Do you want to add more people");
			System.out.println("Type Y or N");
			choice4 = sc.next();
			if(choice4.equals("Y") || choice4.equals("y"))
			{
				System.out.println("How many Participants do you want to add?");
				n3 = sc.nextInt();
				if(n3<=32)
				{
					System.out.println("Search their names");
					for(int i=1; i<=n3; i++)
					{
						name7 = sc.next();
					}
					System.out.println();
					System.out.println("This is Group Video Call and there are "+n3+" Participants in this Call :)");
				}
				else 
				{
					System.out.println("You can not add more than 32 People :(");
				}
			}
			else if(choice4.equals("N") || choice4.equals("n"))
			{
				System.out.println("Okay Thankyou!");
			}
			else
			{
				System.out.println("Sorry Invalid Choice :(");
			}		
		}
		else if(choice4.equals("n") || choice4.equals("N"))
		{
			System.out.println("Okay Thankyou!");
		}
		else
		{
			System.out.println("Sorry Invalid Choice :(");
		}
	}
}
class Payment extends Whatsapp
{
	Scanner sc = new Scanner(System.in);
	Random rm = new Random();
	long phno2;
	int OTP2;
	String bank;
	String name8;
	int send;
	String choice5;
	public void payment()
	{
		System.out.println();
		System.out.println("Do you want to send Money to Someone in your Contact?");
		System.out.println("Type Y or N");
		choice5 = sc.next();
		if(choice5.equals("Y") || choice5.equals("y"))
		{
			System.out.println();
			System.out.println("==================================");
			System.out.println("Registration For Whatsapp Payment");
			System.out.println("==================================");
			System.out.println();
			System.out.println("Enter your Phone Number");
			phno2 = sc.nextLong();
			long temp2 = phno2;
			int count2=0;
			while(temp2>0)
			{
				temp2 = temp2/10;
				count2++;
			}
			if(count2 == 10)
			{
				System.out.println("OTP is send to your phone number");
				int r = rm.nextInt(9000)+1000;
				System.out.println(r);
				System.out.println("Enter the OTP generated");
				OTP2 = sc.nextInt();
				if(OTP2 == r)
				{
					System.out.println("OTP Verified :)");
					System.out.println("Add Your Bank Name");
					bank = sc.next();
					System.out.println("Create a 4 number UPI Pin");
					int pin = sc.nextInt();
					System.out.println();
					System.out.println("===== Registration Completed Successfully =====");
					System.out.println();
					System.out.println("To Whom do you want to send money?");
					name8 = sc.next();
					System.out.println("How much amount do you want to send?");
					send = sc.nextInt();
					if(send <= 100000)
					{
						System.out.println("Enter Pin:");
						int pin2 = sc.nextInt();
						if(pin == pin2)
						{
							System.out.println();
							System.out.println("*** "+send+"rs is sent to "+name8+" ***");
						}
						else
						{
							System.out.println("***** Invalid PIN *****");
						}
					}
					else
					{
						System.out.println("Sorry can not send more than 1 lakh rupees in one day :(");
					}
				}
				else
				{
					System.out.println("Invalid OTP!!!");
				}
			}
			else
			{
				System.out.println("*********** Sorry Invalid Phone Number ***********");
			}
		}
		else if(choice5.equals("N") || choice5.equals("n"))
		{
			System.out.println("Okay Thankyou!");
		}
		else
		{
			System.out.println("Sorry Invalid Choice :(");
		}
	}
}
class Main
{
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		w.login();
		System.out.println(w.name1+" Whatsapp");
		Chat c = new Chat();
		c.privateChat();
		c.groupChat();
		Call c2 = new Call();
		c2.audioCall();
		c2.videoCall();
		Payment p = new Payment();
		p.payment();
	}
}