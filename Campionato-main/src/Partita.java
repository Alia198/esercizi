package bello;

public class Partita {
	private String squadra1; 
	private String squadra2;
	private Giocatore formazione1[];
	private Giocatore formazione2[];
	private int gol1;    //i gol della squadra 1
	private int gol2;    //i gol della squadra 2
	
	public void setSquadra1(String squadra1){
		this.squadra1=squadra1;
	}
	public void setSquadra2(String squadra2){
		this.squadra2=squadra2;	
	}
	public void setGol1(int gol1){
		this.gol1=gol1;
	}
	public void setGol2(int gol2){
		this.gol2=gol2;
	}
	
	public String getSquadra1(){
		return squadra1;
	}
	public String getSquadra2(){
		return squadra2;
	}
	public int getGol1(){
		return gol1;
	}
	public int getGol2(){
		return gol2;
	}
	public void setFormazione1(Giocatore listaGiocatori[]) {  //Formazione della squadra 1
		for(int i=0; i<listaGiocatori.length; i++) {
			formazione1[i]=listaGiocatori[i];
		}
	}
	public void setFormazione2(Giocatore listaGiocatori[]) { //Formazione della squadra 2
		for(int i=0; i<listaGiocatori.length; i++) {
			formazione2[i]=listaGiocatori[i];
		}
	}
	public void addGol1() {
		gol1++;
	}
	public void addGol2() {
		gol2++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
