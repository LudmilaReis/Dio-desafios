/**
 * Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
 *
 * No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.
 *
 * Entrada
 * A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.
 *
 * Saída
 * Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
 *
 *
 * Exemplo de Entrada	Exemplo de Saída
 * 2.0 4.0 7.5 8.0
 * 6.4
 *
 * Media: 5.4
 * Aluno em exame.
 * Nota do exame: 6.4
 * Aluno aprovado.
 * Media final: 5.9
 *
 * 2.0 6.5 4.0 9.0
 *
 * Media: 4.8
 * Aluno reprovado.
 *
 * 9.0 4.0 8.5 9.0
 *
 * Media: 7.3
 * Aluno aprovado.
 */
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Desafio{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        float n1, n2, n3, n4, media;
        double emexame, emexamefinal;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f%n" , media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
        if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            emexame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", emexame);
            emexamefinal = ((emexame + media) / 2.0);
        if (emexamefinal >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", emexamefinal);
        }else{
                System.out.println("Aluno reprovado");
                System.out.printf("Media final: %.1f%n", emexamefinal);
            }
        }
        sc.close();
    }

}