
public class Main {

	public static void main(String[] args) {
		Cantante c1 = new Cantante("kurt","cobain");
		Cantante c2 = new Cantante("fabri","fibra");
		Cantante c3 = new Cantante("cory","taylor");
		Cantante c4 = new Cantante("ian","curtis");
		Cantante c5 = new Cantante("david","bowie");
		Cantante c6 = new Cantante("lou","reed");
		
		Cantante[] lista = new Cantante [10];
		lista[0] = c1;
		lista[1] = c2;
		lista[2] = c3;
		Cantante[] lista2 = new Cantante[10];
		lista[0] = c3;
		lista[1] = c4;
		lista[2] = c5;
		lista[3] = c6;
		Band b1 = new Band("i truci", lista, 3);
		Band b2 = new Band("test", lista2, 4);
		b1.stampaLista();
		c3.setCognome("fabri");
		}

}
