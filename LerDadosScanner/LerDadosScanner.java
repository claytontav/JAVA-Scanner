//Importar a classe Scanner
import java.util.Scanner;

class LerDadosScanner{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Ler uma linha inteira 
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é: " + nomeCompleto);

        //Ler um tipo especifico
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        //Ler um valor int
        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
    
        //Ler um valor float
        System.out.println("Informe sua altura: ");
        float altura = scan.nextFloat();
        System.out.println("Sua altura é: " + altura);

        //Ler um valor double
        System.out.println("Informe seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Seu peso é: " + peso);

        //Ler varios valores
        System.out.println("Informe seu nome, sua idade, sua altura e seu peso: ");
        
        String nome = scan.next();
        int idadee = scan.nextInt();
        float alturaa = scan.nextFloat();
        float pesoo = scan.nextFloat();

        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idadee);
        System.out.println("Sua altura: " + alturaa);
        System.out.println("Seu peso: " + pesoo);
    }
}