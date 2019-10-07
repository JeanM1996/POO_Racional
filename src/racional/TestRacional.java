
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
        
        r1.setNumerador(5);
        r1.setDenominador(7);
        r2.setNumerador(1);
        r2.setDenominador(6);
        
        
        
        Racional suma = Racional.suma(r1,r2);
        Racional resta= Racional.resta(r1, r2);
        Racional multiplicacion = Racional.multiplicacion(r1, r2);
        Racional div= Racional.division(r1, r2);
        
        
        System.out.println(Racional.printRacional(r1)+"+"+Racional.printRacional(r2)+"="+Racional.printRacional(suma));
        System.out.println(Racional.printRacional(r1)+"-"+Racional.printRacional(r2)+"="+Racional.printRacional(resta));
        System.out.println(Racional.printRacional(r1)+"*"+Racional.printRacional(r2)+"="+Racional.printRacional(multiplicacion));
        System.out.println(Racional.printRacional(r1)+"/"+Racional.printRacional(r2)+"="+Racional.printRacional(div));
        
                
        
        

        
        
    }
    
}
