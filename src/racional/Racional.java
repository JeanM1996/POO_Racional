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
        
 //sumar fracciones
    public Racional sumar(Racional f) {
        Racional resultado = new Racional();
        int numeradorR;
        int denominadorR;
        if(denominador==f.getDenominador()){
            numeradorR=numerador+f.getNumerador();
            denominadorR=denominador;
        }else{
           numeradorR= (numerador*f.getDenominador())+(denominador*f.getNumerador());
           denominadorR =denominador*f.getDenominador();
        }
        resultado.setNumerador(numeradorR);
        resultado.setDenominador(denominadorR);
        resultado.simplificar();  //se simplifica antes de devolverla
        return resultado;
    }
   
    //restar fracciones
    public Racional restar(Racional f) {
        Racional resultado = new Racional();
        int numeradorR;
        int denominadorR;
        if(this.denominador==f.getDenominador()){
            numeradorR=numerador-f.getNumerador();
            denominadorR=denominador;
        }else{
           numeradorR= (numerador*f.getDenominador())-(denominador*f.getNumerador());
           denominadorR =denominador*f.getDenominador();
        }
        resultado.setNumerador(numeradorR);
        resultado.setDenominador(denominadorR);
        resultado.simplificar();  //se simplifica antes de devolverla
        return resultado;
    }
   
    //multiplicar fracciones
    public Racional multiplicar(Racional f) {
        Racional resultado = new Racional();
        int numeradorR=numerador*f.getNumerador();
        int denominadorR=denominador*f.getDenominador();
        resultado.setNumerador(numeradorR);
        resultado.setDenominador(denominadorR);
        resultado.simplificar();  //se simplifica antes de devolverla
        return resultado;
    }

    //dividir fracciones
    public Racional dividir(Racional f) {
        Racional resultado = new Racional();
        int numeradorR=numerador*f.getDenominador();
        int denominadorR=denominador*f.getNumerador();
        resultado.setNumerador(numeradorR);
        resultado.setDenominador(denominadorR);
        resultado.simplificar();  //se simplifica antes de devolverlo
        return resultado;
    }
   
    //Cálculo del máximo común divisor por el algoritmo de Euclides
    private int mcd() {
        int u = Math.abs(numerador); //valor absoluto del numerador
        int v = Math.abs(denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        numerador = numerador / n;
        denominador = denominador / n;
        
    }
    
    private Racional negar(){
        return new Racional (-1*numerador,denominador);
    }
    
    public Racional sumar2(Racional r){
        return new Racional(numerador*r.getDenominador()+denominador*r.getNumerador(),denominador*r.getDenominador());
    }
    
    public Racional restar2(Racional r2){
        return sumar2(r2.negar());
    }
    
    public boolean esMenorQue(Racional r){
        return numerador*r.getDenominador()
                <r.getNumerador()*denominador;
    }
    public Racional obtenerMayor(Racional r){
        if (this.esMenorQue(r)) {
            return r;
        }else{
            return this;
        }
    }
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }     
}
