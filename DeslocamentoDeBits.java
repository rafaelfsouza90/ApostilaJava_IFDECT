package deslocamentodebits;
public class DeslocamentoDeBits{
    public static void main(String[]args){
        //Deslocamento de bits para direita com sinal
        int x = 16;
        x = x >> 2;
        
        System.out.println(x);
        
        //Deslocamento de bits para esquerda com sinal
        int y = 4;
        y = y << 2;
        
        System.out.println(y);
        
        //Deslocamento a direita sem sinal
        int z = -200;
        z = z >>> 2;
        
        System.out.println(z);
    }
    
}
