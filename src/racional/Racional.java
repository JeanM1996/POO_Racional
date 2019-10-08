package racional;
/**
 *  jshell /edit 8 -> abrir consola para edicion  /list Muestra todas las sentencias
 * @author Jean Paul Mosquera Arevalo
 * @description: Clase POO- Arquitectura de aplicaciones
* 
 */
public class Racional {
    private int numerador;
    private int denominador;

    
    public Racional(){
    }
    
    public Racional(int numerador, int denominador){
        numerador=this.numerador;
        setDenominador(denominador);
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador !=0){
            this.denominador = denominador;
        }else{
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }
        
    }
        
    public Racional sumarRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorRespuesta;
        int denominadorRespuesta;
        if (r1.getDenominador()==this.denominador) {
            numeradorRespuesta=r1.getNumerador()+this.numerador;
            denominadorRespuesta=r1.getDenominador();
        }else{
            numeradorRespuesta= (r1.getNumerador()*this.denominador)+(r1.getDenominador()*this.numerador);
            denominadorRespuesta =r1.getDenominador()*this.denominador;
        }
            respuesta.setNumerador(numeradorRespuesta);
            respuesta.setDenominador(denominadorRespuesta);
        
        return simplificar(respuesta);
    }

    
    
    public Racional restarRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorRespuesta;
        int denominadorRespuesta;
        if (r1.getDenominador()==this.denominador) {
            numeradorRespuesta=r1.getNumerador()-this.numerador;
            denominadorRespuesta=r1.getDenominador();
        }else{
            numeradorRespuesta= (r1.getNumerador()*this.denominador)-(r1.getDenominador()*this.numerador);
            denominadorRespuesta =r1.getDenominador()*this.denominador;
        }
            respuesta.setNumerador(numeradorRespuesta);
            respuesta.setDenominador(denominadorRespuesta);
        
        return simplificar(respuesta);
    }


    
    public Racional multiplicarRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorRespuesta= (r1.getNumerador()*this.numerador);
        int denominadorRespuesta =r1.getDenominador()*this.denominador;
        
        respuesta.setNumerador(numeradorRespuesta);
        respuesta.setDenominador(denominadorRespuesta);
        return simplificar(respuesta);
    }    


    public Racional dividirRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorR= r1.getNumerador()*this.denominador;
        int denominadorR =r1.getDenominador()*this.numerador;
        respuesta.setNumerador(numeradorR);        
        respuesta.setDenominador(denominadorR);
        return simplificar(respuesta);
    }    
    
    static double toDecimal (Racional r){
        return r.getNumerador()/r.getDenominador(); 
    }
    
    static String toString (Racional r){
        return r.getNumerador()+"/"+r.getDenominador();
    }
    
	private Racional simplificar(Racional r) {
		int i = 2;
		while((i < 100) && i <= r.getNumerador() && i <= r.getDenominador()) {
			if((r.getNumerador() % i == 0) && (r.getDenominador() % i == 0)) {
				r.setNumerador(r.getNumerador() / i);
				r.setDenominador(r.getDenominador() / i);
				i = 2;
			}
			else
				i++;
		}
		return this;
	}
}
