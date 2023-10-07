import java.util.Scanner;
public class Main 
{
	
	public static double add (Scanner s)					//1.adding method
	{
		//Scanner s = new Scanner(System.in);
		double sum = 0.0;
		System.out.println("How many numbers do you want to add?");
		int n=s.nextInt();
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i<n ; ++i) sum+=s.nextDouble();
		return sum;
	}
	
	public static double substruct (Scanner s)			//2.subtract method
	{
		//Scanner s = new Scanner(System.in);			
		double result = 0.0;
		System.out.println("How many numbers do you want to subtract?");
		int n=s.nextInt();
		System.out.println("Enter " + n + " numbers");
		result=s.nextDouble();
		for (int i = 1; i<n ; ++i) result-=s.nextDouble();
		return result;
	}
	
	public static double multiply (Scanner s)			//3.Multiplying method 
	{
		//Scanner s = new Scanner(System.in);
		double product = 1.0;
		System.out.println("How many numbers do you want to multiply?");
		int n=s.nextInt();
		System.out.println("Enter " + n + " numbers");
		for (int i = 0; i<n ; ++i) product*=s.nextDouble();
		return product;
	}
	
	public static double devide(Scanner s)				//4.dividing method
	{
		//Scanner s = new Scanner(System.in);
		double res;
		System.out.println("How many numbers do you want to devide?");
		int n=s.nextInt();
		System.out.println("Enter " + n + " numbers");
		res = s.nextDouble();
		for (int i = 1; i<n ; ++i) res/=s.nextDouble();
		return res;
	}
	
	public static double sine(Scanner s)					//5.sine method
	{
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter number in radians to find the sine");
		return Math.sin(s.nextDouble());
	}
	
	public static double cosine (Scanner s)				//6.cosine method
	{
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter number in radians to find the cosine");
		return Math.cos(s.nextDouble());
	}
	
	public static double tangent (Scanner s)				//7.tangent method
	{
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter number in radians to find the tangent");
		return Math.tan(s.nextDouble());
	}
	
	public static void main (String [] args)	//MAIN METHOD
	{
		//DECLARATION AND INITIALIZATION
		Scanner s = new Scanner(System.in);
		String mode, operator, over;
		boolean again = true;
		//INPUT
		while (again)
		{
	//-----------------------> public static String getModeFunction(Scanner s) {}
		System.out.println("Enter the calculator mode: Standard/Scientific?");	//Prompt user to enter a valid calculator mode
		mode=s.next();
		while ((mode.compareTo("Standard")!=0)&&(mode.compareToIgnoreCase("Scientific")!=0))	//Prompt user to enter a valid calculator mode
		{
			System.out.println("Enter the calculator mode: Standard/Scientific?");	//Prompt user to enter a valid calculator mode
			mode=s.next();
			if ((mode.compareTo("Standard")==0)||(mode.compareToIgnoreCase("Scientific")==0)) break; 	//Prompt user to enter a valid calculator mode
		}
		if (mode.compareTo("Standard")==0) 
			{
			System.out.println("The calculator will operate in standard mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			}
		else 
		{
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println("Enter '+' for addition, '-' for substraction, '*' for multiplication, '/' for division,"
							 + " 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
		}
	//------------------------>end of public static String getModeFunction(Scanner s) {}	
		//System.out.println(add());			//TESTING THE METHODS
		//System.out.println(substruct());		//TESTING THE METHODS
		//System.out.println(multiply());		//TESTING THE METHODS
		//System.out.println(devide());			//TESTING THE METHODS
		//System.out.println(sine());			//TESTING THE METHODS
		//System.out.println(cosine());			//TESTING THE METHODS
		//System.out.println(tangent());		//TESTING THE METHODS
		
		operator = s.next();
		
		
		
	//-----------------------> public static double calcSort(String operator, String getMode) {}	
		if (mode.compareTo("Standard")==0) 
		{
			while ((operator.compareTo("+")!=0)&&(operator.compareTo("-")!=0)&&(operator.compareTo("/")!=0)&&(operator.compareTo("*")!=0))
			{
				System.out.println("Invalid operator " + operator); 
				System.out.println("Enter '+' for addition, '-' for substraction, '*' for multiplication, '/' for division");
				operator = s.next();
			}
			switch (operator)
			{
			case "+" :
			{
				System.out.println("Result: " +add(s));
				break;
			}
			case "-" :	
				{
					System.out.println("Result: " + substruct(s));
					break;
				}
			case "*" :
			{
				System.out.println("Result: " + multiply(s));
				break;
			}
			case "/" :
			{
				System.out.println("Result: " + devide(s));
				break;
			}
				
			//default : {System.out.println("Invalid operator " + operator);break;}
			}
		}
			//System.out.println("Invalid operator " + operator);
			if (mode.compareTo("Scientific")==0) 
			{
				while ((operator.compareTo("+")!=0)&&(operator.compareTo("-")!=0)&&(operator.compareTo("/")!=0)&&(operator.compareTo("*")!=0)&&(operator.compareTo("sin")!=0)&&(operator.compareTo("cos")!=0)&&(operator.compareTo("tan")!=0))
				{
					System.out.println("Invalid operator " + operator); 
					System.out.println("Enter '+' for addition, '-' for substraction, '*' for multiplication, '/' for division,"
							 + " 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
					operator = s.next();
				}
				switch (operator)
				{
				case "+" :
					{
						System.out.println("Result: " + add(s));
						break;
					}
				case "-" :	
					{
						System.out.println("Result: " + substruct(s));
						break;
					}
				case "*" :
					{
						System.out.println("Result: " + multiply(s));
						break;
					}
				case "/" :
					{
						System.out.println("Result: " + devide(s));
						break;
					}
				case "sin" :
					{
						System.out.println("Result: " + sine(s));
						break;
					}
				case "cos" :
					{
						System.out.println("Result: " + cosine(s));	
						break;
					}
				case "tan" :
					{
						System.out.println("Result: " + tangent(s));
						break;
					}
					
				}//default : {System.out.println("Invalid operator " + operator);break;}
			}
			System.out.println("Do you want to start over? (Y/N)");
			over = s.next();
			while ((over.compareTo("Y")!=0)&&(over.compareTo("N")!=0))
			{
				System.out.println("Do you want to start over? (Y/N)");
				over = s.next();
			}
			if (over.compareTo("Y")==0) again = true;
			if (over.compareTo("N")==0) 
				{
				again = false;
				System.out.println("Goodbye");
				}
		}
			s.close();
		}
		//OUTPUT 
		
		
	}
	
