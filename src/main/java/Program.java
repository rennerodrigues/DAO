import java.util.Scanner;
public class Program {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int op = 0;

        do{
            System.out.println("1.criar conta");
            System.out.println("2.logar");
            System.out.println("3.recuperar senha");
            System.out.println("4.sair");
            op= input.nextInt();
        }while(op!=4);
    }
}
    

