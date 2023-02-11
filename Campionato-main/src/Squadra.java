package bello;
public class Squadra {

    private String indirizzoSede;
    private String nomeSquadra;
    private String nomeStadio;
    private Giocatore listaGiocatori[];

    public Squadra(String indirizzoSede, String nomeSquadra, String nomeStadio){
        setIndirizzoSede(indirizzoSede);
        setNomeSquadra(nomeSquadra);
        setNomeStadio(nomeStadio);
    }
    public void setIndirizzoSede(String indirizzoSede){
        this.indirizzoSede = indirizzoSede;
    }
    public void setNomeSquadra(String nomeSquadra){
        this.nomeSquadra = nomeSquadra;
    }
    public void setNomeStadio(String nomeStadio){
        this.nomeStadio = nomeStadio;
    }
    public String getIndirizzoSquadra() {
        return indirizzoSede;
    }
    public String getNomeSquadra(){
        return nomeSquadra;
    }
    public String getNomeStadio(){
        return nomeStadio;
    }
    public void addGiocatore(Giocatore a) {
    	listaGiocatori[listaGiocatori.length]=a;
    }
    public Giocatore cercaGiocatore(String nome, String cognome) {
    	int i;
        for (i=0; i<listaGiocatori.length; i++) {
            if(cognome==listaGiocatori[i].getCognome() && nome==listaGiocatori[i].getNome() ) {
            	listaGiocatori[i].aggiungiGol();
            	
            	
            }
            
        }
        return listaGiocatori[i]; 
    }

}