
public class Cantante {
	private String nome;
	private String cognome;
	
	public Cantante(String nome, String cognome)
	{
		setNome(nome);
		this.setCognome(cognome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!(nome.equals(""))) //
		{
			this.nome = nome;
		}
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if(!(cognome.equals("")))
		{
		this.cognome = cognome;
		}
	}
	

}
