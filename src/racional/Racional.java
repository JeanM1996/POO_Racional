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
    
    static Racional sumar(Racional r1, Racional r2){
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
    static Racional restar(Racional r1, Racional r2){
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

    static Racional multiplicar(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador= (r1.getNumerador()*r2.getNumerador());
        int denominador =r1.getDenominador()*r2.getDenominador();
        
        respuesta.setNumerador(numerador);
        respuesta.setDenominador(denominador);
        return respuesta;
    }    
    
    public Racional multiplicarRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorRespuesta= (r1.getNumerador()*this.numerador);
        int denominadorRespuesta =r1.getDenominador()*this.denominador;
        
        respuesta.setNumerador(numeradorRespuesta);
        respuesta.setDenominador(denominadorRespuesta);
        return simplificar(respuesta);
    }    

    static Racional dividir(Racional r1, Racional r2){
        Racional respuesta= new Racional();
        int numerador= r1.getNumerador()*r2.getDenominador();
        int denominador =r1.getDenominador()*r2.getNumerador();
        
        respuesta.setNumerador(numerador);        
        respuesta.setDenominador(denominador);
        return respuesta;
    }    
    
    public Racional dividirRacional(Racional r1){
        Racional respuesta= new Racional();
        int numeradorR= r1.getNumerador()*this.denominador;
        int denominadorR =r1.getDenominador()*this.numerador;
        respuesta.setNumerador(numeradorR);        
        respuesta.setDenominador(denominadorR);
        return respuesta;
    }    
    
    static double toDecimal (Racional r){
        return r.getNumerador()/r.getDenominador(); 
    }
    
    static String toString (Racional r){
        return r.getNumerador()+"/"+r.getDenominador();
    }
    
    public Racional simplificar(Racional r1){
        Racional resultado= new Racional();
        if (r1.getNumerador()!=0) {
            int n1=gcd(Math.abs(r1.getNumerador()),r1.getDenominador());
            int numerador=r1.getNumerador()/n1;
            int denominador=r1.getDenominador()/n1;
        }
        
        return resultado;
    }
    public int gcd(int v1,int v2){
        while(v1!=v2){
            if (v1>v2) {
                v1=v1-v2;
            }else
                v2=v2-v1;
        }
        return v1;
    }
}
