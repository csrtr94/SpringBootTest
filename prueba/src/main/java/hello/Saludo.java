package hello;

public class Saludo {
	
	private long id;
	private String contenido;
	
	public Saludo(long id, String contenido) {
		this.id = id;
		this.contenido = contenido;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	

}
