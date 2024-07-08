package edu.bithefithy.bootcamp.declaracoes;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        // Operadores de atribuição
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Atribuição com adição: " + c);

        // Operadores relacionais
        boolean maiorQue = a > b;
        boolean menorQue = a < b;
        boolean igual = a == b;
        boolean diferente = a != b;

        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        boolean and = x && y;
        boolean or = x || y;
        boolean not = !x;

        System.out.println("AND lógico: " + and);
        System.out.println("OR lógico: " + or);
        System.out.println("NOT lógico: " + not);

        // Operadores unários
        int d = 10;
        d++; // d = d + 1
        System.out.println("Incremento: " + d);
        d--; // d = d - 1
        System.out.println("Decremento: " + d);
        int negativo = -d;
        System.out.println("Negação: " + negativo);

        // Operadores bitwise
        int e = 5; // 0101 em binário
        int f = 3; // 0011 em binário
        int bitwiseAnd = e & f; // 0001 em binário
        int bitwiseOr = e | f; // 0111 em binário
        int bitwiseXor = e ^ f; // 0110 em binário
        int bitwiseComplement = ~e; // 1010 em binário (complemento de 2)
        int shiftLeft = e << 1; // 1010 em binário (deslocamento à esquerda)
        int shiftRight = e >> 1; // 0010 em binário (deslocamento à direita)

        System.out.println("AND bit a bit: " + bitwiseAnd);
        System.out.println("OR bit a bit: " + bitwiseOr);
        System.out.println("XOR bit a bit: " + bitwiseXor);
        System.out.println("Complemento bit a bit: " + bitwiseComplement);
        System.out.println("Deslocamento à esquerda: " + shiftLeft);
        System.out.println("Deslocamento à direita: " + shiftRight);

        // Operador ternário
        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado: " + resultado);

        // Operador instanceof
        String texto = "Hello, World!";
        boolean isString = texto instanceof String;
        System.out.println("texto é uma instância de String: " + isString);
    }

}
