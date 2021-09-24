/* Desafio
Você recebeu o desafio de ler um valor e criar um programa que coloque o valor lido na primeira posição de um vetor N[10]. Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

Entrada
A entrada contém um valor inteiro (V<=50).

Saída
Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V. */
using System; 

class Program {
  static void Main(string[] args) { 
    int valorLido = int.Parse(Console.ReadLine());
    int[] n = new int[10];
    
    n[0] = valorLido;
    
    for (int i = 1; i < 10; ++i) {
      n[i] = n[i-1] * 2; 
    }

    for (int i = 0; i < 10; ++i) {
      Console.WriteLine($"N[{i}] = {n[i]}");
    }
  }
}