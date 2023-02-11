package Banca;

public class Banca {
	private float saldo;
	private String	iban;
	private Intestatario nome;
	
	public Banca(float saldo, String iban, Intestatario nome){
		setIban(iban);
		setSaldo(saldo);
		
	}
	
	public void setNome(Intestatario nome) {
		this.nome=nome;
	}
	public Intestatario getNome() {
		return nome;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void Prelievo(float prelievo) {
		if(saldo<=0) {
			System.out.println("il conto e' vuoto");
		}
		else if(prelievo>saldo) {
			System.out.println("saldo insufficiente");
		}
		else {
			saldo-=prelievo;
		}
	}
	public void Deposito(float deposito) {
		saldo+=deposito;
	}

}
