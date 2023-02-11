
public class Band {
	private String nome;
	private Cantante lista[];
	private int numero_can;
	
	public Band (String nome, Cantante lista[], int numero_can)
	{
		setNome(nome);
		this.lista = new Cantante[10];
		setLista(lista);
		setNumero(numero_can);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLista(Cantante lista[]){
		
		this.lista =lista;	
	}
	
	public Cantante[] getLista() {
	return lista;
	}
	public void setNumero(int numero_can)
	{
		if(numero_can >= 0) {
		this.numero_can = numero_can;
		}
	}
	public void stampaLista()
	{
		for(int i=0; i<numero_can; i++)
		{
			System.out.println(lista[i].getNome()+" "+lista[i].getCognome());
		}
	}
}