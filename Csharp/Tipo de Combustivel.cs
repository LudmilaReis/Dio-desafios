/**********************************************************
 Tipo de Combustível
 **********************************************************
 Desafio:
Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

 
Exemplo de Entrada	Exemplo de Saída
8                   MUITO OBRIGADO
1                   Alcool: 1
7                   Gasolina: 2
2                   Diesel: 0
2
4
***************************************************************/
using System; 

class URI {
        static void Main(string[] args){
  
        int x;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        do
        {

            x = Convert.ToInt32(Console.ReadLine());

            switch (x)
            {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    continue;
            }
        }
        while (x != 4);
        Console.WriteLine("MUITO OBRIGADO");
        Console.WriteLine("Alcool: " + alcool);
        Console.WriteLine("Gasolina: " + gasolina);
        Console.WriteLine("Diesel: " + diesel);
    }

}


