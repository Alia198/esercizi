import java.util.Scanner;

public class MainB {

	public static void main(String[] args){
		   double resto;
		   double binario = 0;
		   int decimale=45;
		   double i=1;
		   
		   Scanner sc=new Scanner(System.in);
		   decimale=sc.nextInt();
		   sc.close();
		        
		   while(decimale>0)
		   {
		   resto=decimale%2;
		   decimale/=2;
		   binario = binario + resto * Math.pow(10,i);
		   i++;
		   }
		   System.out.println(binario);
	}
		    
}
