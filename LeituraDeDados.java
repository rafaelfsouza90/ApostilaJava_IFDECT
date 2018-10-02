package leituradedados;
import java.util.Scanner;
public class LeituraDeDados{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome=in.nextLine();
        
        System.out.println("Digite sua Idade: ");
        int idade=in.nextInt();
        
        System.out.println("Nome: "+nome+" Idade: "+idade);
    
    
    }



}
