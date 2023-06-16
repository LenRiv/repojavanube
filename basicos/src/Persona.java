
public class Persona {

	
	//Atributos
	private String nombre;
	private String apellido;
    public float peso;
    public float estatura;
    
    //Constructor
    public Persona(float peso, float estatura)
    {
    	
    	this.peso = peso;
    	this.estatura = estatura;
    }
    
    
    
      //Metodos
    
    //getter & setter de peso
    	public void setPeso(float peso) {
    		this.peso = peso;
    	}
    	
    	
    	public float getPeso() {
    		return peso;
    	}
    	
    	
    	//getter & setter de estatura
    	public void setEstatura(float estatura) {
    		this.estatura = estatura;
    	}
    	
    	
    	public float getEstatura() {
    		return estatura;
    	}
    	
    
    	
 
    	
    	
    	
    	
    	
	
	
	
	
	
}
