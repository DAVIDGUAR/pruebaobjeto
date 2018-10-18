package exemplojavaobjetos2;


public class rectangulo {
    
      private float base,altura;
           
//constructores
    //por defecto
    public rectangulo(){
    }
    //por parametro
    public rectangulo(float b, float h){
        base = b;
        altura = h;
    }
    //metodos de acceso
    public void setBase(float b){
        base=b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float h){
        altura=h;
        
    }
    public float getAltura(){
        return altura;
    }
    public float area(){
        float area;
        area= base*altura;
        return area;
    }
}
