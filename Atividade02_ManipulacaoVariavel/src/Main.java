public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "lucas";
        int idade = 23;
        double salario = 1500.00;
        int mesesTrabalhado = 12;
        int produtosComprados = 3;
        double produto1 = 700.00;
        double produto2 = 1200.00;
        double produto3 = 1300.00;

        Integer salarioAnual = (int) (salario * mesesTrabalhado);
        System.out.println(salarioAnual);

        Integer salarioLiquido = (int) (salarioAnual - 3200);
        System.out.println(salarioLiquido);

        Integer mediaGastos = (int) (produto1 + produto2 + produto3 / 3);
        System.out.println(mediaGastos);

        Integer produtos = (int) (produto1 + produto2 + produto3);
        System.out.println(produtos);


        System.out.println("olá Lucas, seu salário líquido é " + salarioLiquido + " reais");














    }
}