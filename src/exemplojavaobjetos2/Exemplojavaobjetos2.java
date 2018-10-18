
package exemplojavaobjetos2;


public class Exemplojavaobjetos2 {

  
   
    
    public static void main(String[] args) {
       
        //rectangulo objetoRectangulo1 = new rectangulo(3f,5f);
        //float res = objetoRectangulo1.area();
        //System.out.println("area ="+ res);
        
        //instanciando objeto 
        rectangulo rectangulo2 = new rectangulo();
        System.out.println("area"+rectangulo2.area());
        rectangulo2.setAltura(7);
        rectangulo2.setBase(7);
        System.out.println("area"+rectangulo2.area());
       // System.out.println("area ="+ res);
 
   
    }  
}
