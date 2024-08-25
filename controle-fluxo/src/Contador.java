import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try
        {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e)
        {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    private static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException
    {
        if(paramDois < paramUm)
            throw new ParametrosInvalidosException();

        int contagem = paramDois - paramUm;

        for(int x = 1; x <= contagem; x++)
        {
            System.out.println("Imprimindo o número " + x);
        }
    }
}
