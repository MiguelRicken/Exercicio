import java.util.Scanner;

//Neste exercicio tem a 1 e a 2 juntas da pag 26

public class Exer1e2 {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)){
        double b;
        double B;
        double h;
        double area;
        System.out.println("Digite o valor da altura(h): ");
        h = input.nextDouble();
        System.out.println("Digite o valor da base menor(b): ");
        b = input.nextDouble();
        System.out.println("Digite o valor da basa maior(B): ");
        B = input.nextDouble();
        area  = (h*(b + B)) /2 ;
        System.out.println("O valor do trapezio e: " + area);  
        System.out.println("---------------Atividade 2-----------------"); 
        System.out.println("O valor exato do da area é: " + area);
        System.out.println("O valor arrendodado e: " + Math.round(area));

    }   
}
}