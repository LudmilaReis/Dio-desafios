package Java;
import java.io.IOException;
import java.util.Scanner;

public class Idade {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        idadeDias -=    * 365 //implemente no espaço em branco
        int meses = idadeDias / 30;
        idadeDias -=    * 30;  //implemente no espaço em branco
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
	
}
	
}