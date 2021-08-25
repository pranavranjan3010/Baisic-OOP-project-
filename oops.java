package javaprogramming;
import java.util.ArrayList;
import java.util.Scanner;
public class phoneshop {

	public static void main(String[] args) {
	ArrayList<String>p=new ArrayList<String>();
	System.out.println("---------------------------------------******Big Billion Sale***********-------------------------------");
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("********************Collections(Phones)**********************");
	p.add("Nokia Lumia");
	p.add("Redmi 10A");
	p.add("Realme A5");
	p.add("Iphone 10S");
	p.add("Samsung Grand");
	System.out.println(p);
	samsung s=new samsung ();
	s.get_details();
	System.out.println("----------------------------Functions of the mobile-----------------");
	s.play_games();
	s.click_photos();
	s.for_study();
	s.make_calls();
	s.play_music();
	s.discount();
	s.Sim_details();
	s.personal_details();
    s.Payment_methods();
    s.pay();
    s.choose_phone();
	s.greet();
	s.sam_s();
	//redmi r1=new redmi();
	

	}

}
 class nokia//Parent class 
{
	Scanner Scan=new Scanner(System.in);
	private String name;
	private int cost=12000;
	private String color="Black";
	private int Model_no=123344;
	private String Battery_life="2 years";
	private String ram="6 GB";
	public int n_cost;
	private int no,choose;
	private int age,choice;
	
	private String name1;
	public void make_calls()
	{
		System.out.println(name+" is used to make calls");
	}
	public void play_music()
	{
		System.out.println(name+" is used to play music");
	}
	public void play_games()
	{
		System.out.println(name+" is used to play games");
	}
	public void click_photos()
	{
		System.out.println(name+" is used to click photos");
	}
	public void for_study()
	{
		System.out.println(name+" is used for online study purpose");
	}
	public void get_details()
	{
		System.out.print("Enter the phone of your choose-");
		name=Scan.next();
		System.out.println("----------Attributes of the------------------ "+name);
		System.out.println("Name-"+name);
		System.out.println("Cost-"+cost);
		System.out.println("Color-"+color);
		System.out.println("Model_no-"+Model_no);
		System.out.println("Battery life-"+Battery_life);
		System.out.println("Ram-"+ram);
	}
	public void discount()
	{
		System.out.println("-------------------------------------Discount offer--------------------------------");
		System.out.println("!!You will get Discount of Rs.25%!!");
		System.out.println("Enter the price of the moblie:-\n");
		n_cost=Scan.nextInt();
		n_cost=cost-3000;
		System.out.println("Price After Discount-"+n_cost);
		
	}
	public void Sim_details()
	{
		System.out.println("------------------------Personal Details-------------------------------------");
		System.out.println("Enter your name-\n");
	     name1=Scan.next();
		System.out.println("Enter your age-\n");
		 age=Scan.nextInt();
		System.out.println("Enter your aadhar_number-\n");
		 no=Scan.nextInt();
		
	}
	public void personal_details()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Name-"+name1);
		System.out.println("Age-"+age);
		System.out.println("Aadhar_no-"+no);
		System.out.println("-------------------------------------------");
		System.out.println("You have Successfully applied for the sim");
	}
	public void Payment_methods()
	{
		
		System.out.println("Enter the choice\n");
		System.out.println("1.Cash on delivery\n2.online Payment");
		choice=Scan.nextInt();
		switch(choice)
		{
		
		case 1:
			System.out.println("You selected COD");
		break;
		
		case 2:
		
			System.out.println("You selected Online payment");
		
		break;
			
			
	}
	}
	public void pay()
	{   System.out.println("Enter the choice again\n");
	     choice=Scan.nextInt();
	     if(choice==2)
	     {
		System.out.println("Enter the price of the mobile-\n");
		cost=Scan.nextInt();
		System.out.println("Enter the otp-\n");
		no=Scan.nextInt();
		System.out.println("Enter your cvv-\n");
		no=Scan.nextInt();
		System.out.println("!!Payment is Successfully done!!");
	     }
	     else 
	     {
	    	 System.out.println("!!Thanks for choosing COD option!!");
	     }
	}
	public void choose_phone()
	{
		System.out.println("--------------------Extra accessories------------------");
		System.out.println("Enter the mobile you choose\n");
		
		System.out.println("1.Redmi\n2.Realme\n3.Samsung\n4.Iphone\n5.Nokia");
		choose=Scan.nextInt();
		switch(choose)
		{
		case 1:
			System.out.println("!!You will get only charger and earphone!!");
			break;
		case 2:
			System.out.println("!!You will get only charger and earphone!!");
			break;
		case 3:
			System.out.println("!!You will get  charger, earphone, one Sd card of 16GB!!");
			break;
		case 4:
			System.out.println("!!You will get  charger, earphone,Headphones,Sd card of 32 GB and one ipot!!");
			break;
		case 5:
			System.out.println("!!You will get only charger !!");	
			
		}
	}
	public void greet()
	{
		System.out.println("--------------------------------!!Thanks for visitng!!----------------------------------");
		System.out.println("More collections will be available from the next week");
		ArrayList<String>p1=new ArrayList<String>();
		System.out.println("----------------------------New Collections--------------------");
		p1.add("Asus");
		p1.add("Oneplus");
		p1.add("Oppo");
		p1.add("Vivo");
		System.out.println(p1);
		
	}
	

}
 class redmi extends nokia
{
	public void redm_()
	{
		System.out.println("Thanks for purchasing Redmi");
	}
}
 class iphone extends nokia 
{
	 public void iphone_i1()
		{
			System.out.println("Thanks for purchasing Iphone");
		}
}
class realme extends nokia
{
	public void realme_p()
	{
		System.out.println("Thanks for purchasing Realme");
	}
	
}
class samsung extends nokia 
{
	public void sam_s()
	{
		
		
			System.out.println("!!Thanks for purchasing mobile from our website!!");
		}


}
