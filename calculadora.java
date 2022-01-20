package guzman.calculadorairpf;


import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un salario anual");
        double salarioyear = sc.nextDouble();
        System.out.println("Introduce el IRPF a calcular");
        double irpf = sc.nextDouble();

        double salariomes = salarioyear / 12;

        double Desempleo = (( 1.65*salariomes ) / 100);
        System.out.println("Desempleo: "+Desempleo);
        double contingencias = (( 4.7*salariomes ) / 100);
        System.out.println("Contingencias comunes: "+contingencias);
        double irpf2 = ((irpf * salariomes) / 100);
        System.out.println("IRPF: "+irpf2);
        double deduccionestot = Desempleo + contingencias + irpf2;
        System.out.println("las deducciones totales son " + deduccionestot);
        double salarioNetomes = salariomes - deduccionestot;
        System.out.println("Tu sueldo mensual seria de " + salarioNetomes);

    }

}
