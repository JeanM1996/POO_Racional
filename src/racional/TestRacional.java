
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
        
        
        
        Racional suma = Racional.sumar(r1,r2);
        Racional resta= Racional.restar(r1, r2);
        Racional multiplicacion = Racional.multiplicar(r1, r2);
        Racional div= Racional.dividir(r1, r2);
        Racional resultado=r2.dividirRacional(r1);
        
        System.out.println(Racional.toString(r1)+"+"+Racional.toString(r2)+"="+Racional.toString(suma));
        System.out.println(Racional.toString(r1)+"-"+Racional.toString(r2)+"="+Racional.toString(resta));
        System.out.println(Racional.toString(r1)+"*"+Racional.toString(r2)+"="+Racional.toString(multiplicacion));
        System.out.println(Racional.toString(r1)+"/"+Racional.toString(r2)+"="+Racional.toString(div));
        System.out.println(Racional.toString(r1)+"/"+Racional.toString(r2)+"="+Racional.toString(resultado));
                
        
        

        
        
    }
    
}
