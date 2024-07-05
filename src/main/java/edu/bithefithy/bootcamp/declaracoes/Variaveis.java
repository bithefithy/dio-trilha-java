package edu.bithefithy.bootcamp.declaracoes;

import edu.bithefithy.bootcamp.model.Pessoa;

public class Variaveis {
    // Variável do tipo String
    String mensagem = "Olá, Mundo!";

    // Variáveis de tipos primitivos
    int numero = 42;
    boolean estaAtivo = true;  //boolean: representa dois valores possíveis, true e false
    char letra = 'A';
    byte pequenoNumero = 10;
    short numeroCurto = 200;
    long numeroLongo = 123456789L;
    float numeroFlutuante = 3.14f;
    double numeroDouble = 3.14159;

    // Variável de tipo array
    int[] numerosArray = {1, 2, 3, 4, 5};
    String[] nomesArray = {"João", "Maria", "Ana"};

    // Variável de tipo referência (Objeto)
    Pessoa pessoa = new Pessoa("João", 30);
}
