package HelloWorldBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorldBean implements Serializable {
	private static final long serialVersionUID =
			6949827676782977015L;
	private String nome;
	public String getNome() {
		System.out.println("Chamando GET");
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("Chamando SET");
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
