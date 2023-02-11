package bello;

public class Campionato {
    private String nome;   //Nome del Campionato
    private Giocatore marcatori[];   //Marcatori delle squadre (Giocatori che hanno segnato almeno 1 gol)
    private Squadra listaSquadre[];  //Insieme delle squadre
    private Partita calendario[];    //Tutte le partite che vengono giocate
    public Campionato(String nome) {
    	setNome(nome);
    }
    public String getNome(){
	    return nome;
	}
	public void setNome(String nome){
	    this.nome=nome;
	}
	public void addPartita(Partita a) {
		calendario[calendario.length]=a; //aggiunge una partita nel calendario
	}
	public void addMarcatore(Giocatore a) {
		marcatori[marcatori.length]=a; //aggiunge il marcatore al primo elemento dell'array disponibile
	}
	public void addSquadra(Squadra a) {
		listaSquadre[listaSquadre.length]=a;
	}
	public void bubbleSort(Giocatore marcatori[]) { //bubble sort(algoritmo di ordinamento per il numero di gol dato l'array marcatori
	    for(int i = 0; i < marcatori.length; i++) {
	        boolean flag = false;
	        for(int j = 0; j < marcatori.length-1; j++) {
	            if(marcatori[j].getGol()>marcatori[j+1].getGol()) {
	                Giocatore k=new Giocatore(marcatori[j]);
	                marcatori[j].setGiocatore(marcatori[j+1]);
	                marcatori[j+1].setGiocatore(k);
	                flag=true;
	            }
	        }
	        if(!flag) break; //termine ordinamento
	    }
	}
	public  void cercaSquadra(String nome, String cognome,String Squadra) {
        for (int i=0; i<listaSquadre.length; i++) {
            if(Squadra==listaSquadre[i].getNomeSquadra()) {
            	listaSquadre[i].cercaGiocatore(nome,cognome);
            	addMarcatore(listaSquadre[i].cercaGiocatore(nome,cognome));
            }
        }
	}
	public void aggiungiGol(String nome,String cognome,String squadra, int numeropartita) { //aggiunge i gol alle squadre
		if(calendario[numeropartita].getSquadra1()==squadra) {
			calendario[numeropartita].addGol1();
			cercaSquadra(nome,cognome,squadra);
		}else {
			calendario[numeropartita].addGol2();
			cercaSquadra(nome,cognome,squadra);
			
		}
		
	}
	public void stampaSquadre() {
		for(int i=0; i<listaSquadre.length; i++) {
			System.out.println("indirizzo:"+listaSquadre[i].getIndirizzoSquadra()+" nome:"+listaSquadre[i].getNomeSquadra()+" nome stadio: "+listaSquadre[i].getNomeStadio());
		}
	}
}
