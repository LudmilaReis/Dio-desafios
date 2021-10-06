/* 
Desafio
Desenvolva um programa que leia um valor inteiro N. Este N refere-se à quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
 */
 using System;

namespace PUM {
    class Program {
        static void Main(string[] args) {
        
          int n= int.Parse(Console.ReadLine());
          int cont = 1;
          for (int i = 0; i < n; i++) {
            Console.Write(cont+" ");
            Console.Write(cont + 1 + " ");
            Console.Write(cont + 2 + " ");
            Console.WriteLine("PUM");
            cont += 4;
          }
          Console.ReadKey();
          }
    }
}