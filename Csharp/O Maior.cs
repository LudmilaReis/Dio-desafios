/*****************************************
O Maior
******************************************
Desafio
Desenvolva um programa capaz de ler três valores e apresentar o maior deles e adicionar a mensagem “ eh o maior”. Use a seguinte forma como base:



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido pela mensagem " eh o maior".

 
Exemplos de Entrada	Exemplos de Saída
7 14 106            106 eh o maior
217 14 6            217 eh o maior
*****************************************************************/

using System;

   class Program{
    static void Main(string[] args)
    {

        String[] vet = Console.ReadLine().Split(' ');

        int a = int.Parse(vet[0]);
        int b = int.Parse(vet[1]);
        int c = int.Parse(vet[2]);
        int MAIOR = 0;

        if (a < b || a < c)
        {
            if (b >= a && b >= c)
            {
                MAIOR = b;
                Console.WriteLine($"{MAIOR} eh o maior");
            }
            else
            {
                MAIOR = c;
                Console.WriteLine($"{MAIOR} eh o maior");
            }
        }
        else
        {
            MAIOR = a;
            Console.WriteLine($"{MAIOR} eh o maior");
        }

    }

}


