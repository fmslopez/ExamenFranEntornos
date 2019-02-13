
public class Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona("negro",180,80);//una persona		
		Persona p2=new Persona("rubia",170,60);//otra persona
		Persona p3=new Persona("pelirroja",160,50);
		System.out.println("La persona p tiene el color de pelo siguiente:"+p.getColorPelo());
		p.setColorPelo("rubio");
		p.setColorPelo("rojo");
		System.out.println("La persona p tiene el color del pelo siguiente:"+p.getColorPelo());
		;
	}

}
