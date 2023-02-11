package bello;
/*
 * @author team1
 * @version 1.1
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Campionato a=new Campionato("ciao");
			Squadra a1= new Squadra("indirizzo", "nome", "nomestadio" );
			Squadra a2= new Squadra("indirizzo", "nome", "nomestadio" );
			Giocatore zera=new Giocatore("daniele", "zeraschi", "attaccante");
			
			a.addSquadra(a1);
			a.addSquadra(a2);
			a.stampaSquadre();
	}

}
