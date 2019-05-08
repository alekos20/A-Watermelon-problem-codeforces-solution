import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
		{
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		if (a1<0 || a1>100)
			System.out.println("Debe ser un numero entre 1 y 100");
		else
			if (a1%2==0&&a1!=2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
}
