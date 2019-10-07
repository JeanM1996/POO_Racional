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
    
    static Racional suma(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador;
        int denominador;
        if (r1.getDenominador()==r2.getDenominador()) {
            numerador=r1.getNumerador()+r2.getNumerador();
            denominador=r1.getDenominador();
        }else{
            numerador= (r1.getNumerador()*r2.getDenominador())+(r1.getDenominador()*r2.getNumerador());
            denominador =r1.getDenominador()*r2.getDenominador();
        }
            respuesta.setNumerador(numerador);
            respuesta.setDenominador(denominador);
        
        return respuesta;
    }
    static Racional resta(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador;
        int denominador;
        if (r1.getDenominador()==r2.getDenominador()) {
            numerador=r1.getNumerador()-r2.getNumerador();
            denominador=r1.getDenominador();
        }else{
            numerador= (r1.getNumerador()*r2.getDenominador())-(r1.getDenominador()*r2.getNumerador());
            denominador =r1.getDenominador()*r2.getDenominador();
        }
            respuesta.setNumerador(numerador);
            respuesta.setDenominador(denominador);
        
        return respuesta;
    }

    static Racional multiplicacion(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador= (r1.getNumerador()*r2.getNumerador());
        int denominador =r1.getDenominador()*r2.getDenominador();
        
        respuesta.setNumerador(numerador);
        respuesta.setDenominador(denominador);
        return respuesta;
    }    

    static Racional division(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador= r1.getNumerador()*r2.getDenominador();
        int denominador =r1.getDenominador()*r2.getNumerador();
        
        respuesta.setNumerador(numerador);        
        respuesta.setDenominador(denominador);
        return respuesta;
    }    
    
    static double toDecimal (Racional r){
        return r.getNumerador()/r.getDenominador(); 
    }
    
    static String printRacional (Racional r){
        return r.getNumerador()+"/"+r.getDenominador();
    }
    
    
}
