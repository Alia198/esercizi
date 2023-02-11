package bello;
public class Giocatore {
    private String nome; //Nome del giocatore
    private String cognome; //Cognome del giocatore
    private String ruolo; //Ruolo / Posizione del giocatore(ES. ATT - DC ecc.)
    private int gol; //Gol del giocatore
    public Giocatore(String nome, String cognome, String ruolo) {
        setNome(nome);
        setCognome(cognome);
        setRuolo(ruolo);
    }
    public Giocatore(Giocatore a) { //costruttore di copia
        setNome(a.nome);
        setCognome(a.cognome);
        setRuolo(a.ruolo);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getRuolo() {
        return ruolo;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public int getGol() {
        return gol;
    }
    public void setGol(int gol) {
        this.gol = gol;
    }
    public void setGiocatore(Giocatore a) { //metodo di copia di un oggetto dentro un altro oggetto
        this.nome=a.nome;
        this.cognome=a.cognome;
        this.ruolo=a.ruolo;
        this.gol=a.gol;
    }
    public void aggiungiGol(){
    	this.gol++;
    }
}