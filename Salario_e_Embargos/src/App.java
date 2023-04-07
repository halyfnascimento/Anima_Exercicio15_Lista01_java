import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double salarioH;
        double horaM;
        double salarioBruto;
        double dINSS;
        double dSIND;
        double desconto;
        double salarioL;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        salarioH = teclado.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        horaM = teclado.nextDouble();
        teclado.close();
        salarioBruto = (salarioH * horaM);
        dINSS = (salarioBruto * 0.11);
        dSIND = (salarioBruto * 0.05);
        desconto = (dINSS + dSIND);
        salarioL = (salarioBruto - desconto);
        System.out.println("Seu salario bruto e de RS:" + salarioBruto);
        System.out.println("Ouveram descontos no seu salario referente ao INSS, desconto esse de R$:" + dINSS
                + ". Tambem ouveram descontos referentes ao Sindicato, desconto esse de R$:" + dSIND + ".");
        System.out.println("Seu salario Liquido é de R$:" + salarioL);

        // Respostas Resumidas:
        System.out.println("RESUMO GERAL");
        System.out.println("Ganho por Hora. R$:" + salarioH);
        System.out.println("Horas trabalhadas no Mes.: " + horaM + "Horas");
        System.out.println("Salario bruto Mensal. RS:" + salarioBruto);
        System.out.println("Desconto do INSS.:" + dINSS);
        System.out.println("Desconto do Sindicato.:" + dSIND);
        System.out.println("Salario liquido. R$:" + salarioL);
    }
}