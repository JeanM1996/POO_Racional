
package racional;

/**
 * Class Test Racional
 * @author Jean Paul Mosquera Arevalo
 */
public class TestRacional {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional r1= new Racional();
        Racional r2=new Racional();
        /** Sin encapsular !error 
        /// r1.numerador=3;
        // r1.denominador=2;
         **/
        
        
        //Encapsulando
        /**
            r1.setNumerador(5);
            r1.setDenominador(0);
            r2.setDenominador(6);
            r2.setNumerador(5);
         */
        
        //Con Objetoos
        //Racional r3= new Racional (1,0);
        
        r1.setNumerador(1);
        r1.setDenominador(4);
        r2.setNumerador(3);
        r2.setDenominador(4);
        
        
        
        //Racional resultado=r2.dividirRacional(r1);
        Racional suma=r1.sumar(r2);
        Racional resta=r1.restar(r2);
        Racional multiplicacion=r1.multiplicar(r2);
        Racional division=r1.dividir(r2);
        

        System.out.println(r1.toString()+"+"+r2.toString()+"="+suma.toString());
        System.out.println(r1.toString()+"-"+r2.toString()+"="+resta.toString());
        System.out.println("Method2"+r1.toString()+"-"+r2.toString()+"="+r1.restar2(r2).toString());
        System.out.println(r1.toString()+"*"+r2.toString()+"="+multiplicacion.toString());
        System.out.println(r1.toString()+"/"+r2.toString()+"="+division.toString());
        
                
        
        

        
        
    }
    
}
