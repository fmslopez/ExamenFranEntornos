
public class Persona {
	String colorPelo;
	int altura;
	int peso;
	
	//Constructor que me crea una persona con un color de pelo, altura y peso
	public Persona(String c, int a,int p) {
		this.colorPelo=c;
		this.altura=a;
		this.peso=p;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	
}
