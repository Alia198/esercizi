package Banca;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Intestatario p1= new Intestatario("Mario", "Rossi");
		Intestatario p2= new Intestatario("Marco", "Bianchi");
		Intestatario p3= new Intestatario("Matteo", "Stocchi");
		
		Banca c1 = new Banca(500, "IT8001245656", p1);
		Banca c2 = new Banca(500, "IT8001245666", p2);
		Banca c3 = new Banca(500, "IT8001245696", p3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Su che conto vuoi operare:");
		int scelta = scanner.nextInt();
		
		
		
		while(scelta!=0  && scelta < 3) {
			switch(scelta) {
			case 1:
				System.out.println("Prelievo (1), Deposito (2):");
				int s1 = scanner.nextInt();
				if(s1 == 1) {
					System.out.println("Quanto vorresti prelevare:");
					float p = scanner.nextFloat();
					c1.Prelievo(p);
				}
				if(s1 == 2) {
					System.out.println("Quanto vorresti Depositare:");
					float d = scanner.nextFloat();
					c1.Deposito(d);
				}
			case 2:
				System.out.println("Prelievo (1), Deposito (2):");
				int s2 = scanner.nextInt();
				if(s2 == 1) {
					System.out.println("Quanto vorresti prelevare:");
					float p = scanner.nextFloat();
					c2.Prelievo(p);
				}
				if(s2 == 2) {
					System.out.println("Quanto vorresti Depositare:");
					float d = scanner.nextFloat();
					c2.Deposito(d);
				}
			case 3:
				System.out.println("Prelievo (1), Deposito (2):");
				int s3 = scanner.nextInt();
				if(s3 == 1) {
					System.out.println("Quanto vorresti prelevare:");
					float p = scanner.nextFloat();
					c3.Prelievo(p);
				}
				if(s3 == 2) {
					System.out.println("Quanto vorresti Depositare:");
					float d = scanner.nextFloat();
					c3.Deposito(d);
				}
			}
		
			System.out.println("Su che conto vuoi operare:");
			scelta = scanner.nextInt();
		}
		do {
		System.out.println("Che conto vuoi visualizzare:");
		scelta = scanner.nextInt();
		if(scelta==1)
		{
			System.out.println("Dati: " + c1.getNome()+c1.getSaldo());
		}
		else if(scelta==2)
		{
			System.out.println("Dati: " + c2.getNome()+c2.getSaldo());
		}
		else if(scelta==3)
			System.out.println("Dati: " + c3.getNome()+c3.getSaldo());
		}while(scelta >= 1 && scelta <= 3);
	}

}
