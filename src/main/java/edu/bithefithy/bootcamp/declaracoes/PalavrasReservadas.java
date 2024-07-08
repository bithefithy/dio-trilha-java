package edu.bithefithy.bootcamp.declaracoes;

public class PalavrasReservadas {

    private String nome;

    private void metodoSuper() {}

    // Palavra reservada: abstract
    // Define uma classe ou método abstrato que não pode ser instanciado diretamente.
    abstract class ClasseAbstrata {
        abstract void metodoAbstrato();
    }

    // Palavra reservada: assert
    // Usada para fazer afirmações no código que devem ser verdadeiras em tempo de execução.
    public void metodoAssert(int valor) {
        assert valor > 0 : "Valor deve ser maior que zero";
    }

    // Palavra reservada: boolean
    // Define um tipo de dado booleano, que pode ser true ou false.
    boolean variavelBooleana = true;

    // Palavra reservada: break
    // Interrompe o loop ou switch em execução.
    public void metodoBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    // Palavra reservada: byte
    // Define um tipo de dado inteiro de 8 bits.
    byte variavelByte = 127;

    // Palavra reservada: case
    // Usada em uma instrução switch para definir um bloco de código a ser executado.
    public void metodoCase(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            // ...
            default:
                System.out.println("Dia inválido");
        }
    }

    // Palavra reservada: catch
    // Define um bloco de código para capturar exceções.
    public void metodoCatch() {
        try {
            int divisao = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        }
    }

    // Palavra reservada: char
    // Define um tipo de dado de caractere de 16 bits.
    char variavelChar = 'A';

    // Palavra reservada: class
    // Define uma classe.
    public class ClasseInterna {
        // ...
    }

    // Palavra reservada: continue
    // Interrompe a iteração atual de um loop e continua com a próxima iteração.
    public void metodoContinue() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    // Palavra reservada: default
    // Define um bloco padrão em uma instrução switch.
    public void metodoDefault(int dia) {
        switch (dia) {
            // ...
            default:
                System.out.println("Dia inválido");
        }
    }

    // Palavra reservada: do
    // Usada em um loop do-while.
    public void metodoDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    // Palavra reservada: double
    // Define um tipo de dado de ponto flutuante de 64 bits.
    double variavelDouble = 10.5;

    // Palavra reservada: else
    // Define um bloco de código alternativo em uma instrução if.
    public void metodoElse(int a) {
        if (a > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Não é positivo");
        }
    }

    // Palavra reservada: enum
    // Define um tipo de enumeração, um conjunto fixo de constantes.
    enum DiaDaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
    }

    // Palavra reservada: extends
    // Indica que uma classe herda de outra classe.
    public class ClasseBase {
        // ...
    }

    public class ClasseDerivada extends ClasseBase {
        // ...
    }

    // Palavra reservada: final
    // Define uma constante ou previne a sobrescrita de métodos ou classes.
    final int CONSTANTE = 10;

    public final void metodoFinal() {
        // ...
    }

    public final class ClasseFinal {
        // ...
    }

    // Palavra reservada: finally
    // Define um bloco de código que sempre será executado após um bloco try-catch.
    public void metodoFinally() {
        try {
            int divisao = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        } finally {
            System.out.println("Bloco finally");
        }
    }

    // Palavra reservada: float
    // Define um tipo de dado de ponto flutuante de 32 bits.
    float variavelFloat = 5.5f;

    // Palavra reservada: for
    // Define um loop for.
    public void metodoFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    // Palavra reservada: if
    // Define uma instrução condicional.
    public void metodoIf(int a) {
        if (a > 0) {
            System.out.println("Positivo");
        }
    }

    // Palavra reservada: implements
    // Indica que uma classe implementa uma interface.
    interface MinhaInterface {
        void meuMetodo();
    }

    public class MinhaClasse implements MinhaInterface {
        @Override
        public void meuMetodo() {
            System.out.println("Implementando a interface");
        }
    }

    // Palavra reservada: import
    // Importa pacotes ou classes para uso na classe atual.
    // Exemplo: import java.util.List;

    // Palavra reservada: instanceof
    // Verifica se um objeto é uma instância de um tipo específico.
    public void metodoInstanceof(Object obj) {
        if (obj instanceof String) {
            System.out.println("É uma string");
        }
    }

    // Palavra reservada: int
    // Define um tipo de dado inteiro de 32 bits.
    int variavelInt = 100;

    // Palavra reservada: interface
    // Define uma interface.
    interface OutraInterface {
        void outroMetodo();
    }

    // Palavra reservada: long
    // Define um tipo de dado inteiro de 64 bits.
    long variavelLong = 1000L;

    // Palavra reservada: native
    // Indica que um método é implementado em código nativo, fora do Java.
    public native void metodoNativo();

    // Palavra reservada: new
    // Cria novas instâncias de classes.
    public void metodoNew() {
        ClasseInterna objeto = new ClasseInterna();
    }

    // Palavra reservada: null
    // Representa uma referência nula.
    Object variavelNull = null;

    // Palavra reservada: package
    // Define o pacote ao qual a classe pertence.
    // Exemplo: package com.exemplo;

    // Palavra reservada: private
    // Define um membro privado da classe.
    private int variavelPrivada = 10;

    // Palavra reservada: protected
    // Define um membro protegido da classe.
    protected int variavelProtegida = 20;

    // Palavra reservada: public
    // Define um membro público da classe.
    public int variavelPublica = 30;

    // Palavra reservada: return
    // Retorna um valor de um método.
    public int metodoReturn() {
        return 42;
    }

    // Palavra reservada: short
    // Define um tipo de dado inteiro de 16 bits.
    short variavelShort = 32767;

    // Palavra reservada: static
    // Define um membro estático da classe.
    public static int variavelEstatica = 50;

    // Palavra reservada: strictfp
    // Restringe a precisão e arredondamento de ponto flutuante para garantir consistência.
    public strictfp void metodoStrictfp() {
        // ...
    }

    // Palavra reservada: super
    // Referencia a superclasse imediata.
    public class ClassePai {
        public void metodoSuper() {
            System.out.println("Classe Pai");
        }
    }

    public class ClasseFilha extends ClassePai {
        public void metodoFilha() {
            super.metodoSuper();
        }
    }

    // Palavra reservada: switch
    // Define uma instrução de seleção múltipla.
    public void metodoSwitch(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            // ...
            default:
                System.out.println("Dia inválido");
        }
    }

    // Palavra reservada: synchronized
    // Indica que um método ou bloco de código é sincronizado.
    public synchronized void metodoSynchronized() {
        // Código sincronizado
    }

    // Palavra reservada: this
    // Referencia a instância atual da classe.
    public void metodoThis() {
        this.nome = "Novo Nome";
    }

    // Palavra reservada: throw
    // Lança uma exceção.
    public void metodoThrow() throws Exception {
        throw new Exception("Exceção lançada");
    }

    // Palavra reservada: throws
    // Declara uma exceção que pode ser lançada por um método.
    public void metodoThrows() throws Exception {
        metodoThrow();
    }

    // Palavra reservada: transient
    // Indica que um campo não deve ser serializado.
    transient int variavelTransient = 60;

    // Palavra reservada: try
    // Define um bloco de código que pode lançar exceções.
    public void metodoTry() {
        try {
            int divisao = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        }
    }

    // Palavra reservada: void
    // Indica que um método não retorna nenhum valor.
    public void metodoVoid() {
        System.out.println("Método sem retorno");
    }

    // Palavra reservada: volatile
    // Indica que um campo pode ser alterado de forma assíncrona.
    volatile int variavelVolatile = 70;

    // Palavra reservada: while
    // Define um loop while.
    public void metodoWhile() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    // Método principal para executar exemplos
    public static void main(String[] args) {
        PalavrasReservadas exemplo = new PalavrasReservadas();

        // Executando alguns métodos de exemplo
        exemplo.metodoAssert(5);
        exemplo.metodoBreak();
        exemplo.metodoCase(1);
        exemplo.metodoCatch();
        exemplo.metodoContinue();
        exemplo.metodoDoWhile();
        exemplo.metodoElse(-1);
        exemplo.metodoFor();
        exemplo.metodoIf(0);
        exemplo.metodoInstanceof("Teste");
        exemplo.metodoNew();
        exemplo.metodoReturn();
        exemplo.metodoSuper();
        exemplo.metodoSwitch(3);
        exemplo.metodoSynchronized();
        exemplo.metodoThis();
        exemplo.metodoTry();
        exemplo.metodoVoid();
        exemplo.metodoWhile();
    }
}
