// criação do código do programa 
import java.util.Scanner;
public  class Mein  { 
    public static void main(String[] args )
    {
     Scanner sc = new Scanner(System.in );
     // criação de credeciais 
     String loginCorreto = "usuario123";
     String senhaCorreta = "senha123";
  
     // Soliciltação  do login 
     System.out.println("Digite o login:  ");
     String login = sc.nextLine();
     System.out.println("Digite  sua senha :  ");
     String senha  = sc.nextLine();
     if(login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
        System.out.println("Login feito com sucesso!");
    } else {
        System.out.println("login ou senha incorretos!");
    }
    
    sc.close();
    }
}