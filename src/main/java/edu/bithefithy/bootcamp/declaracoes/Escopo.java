package edu.bithefithy.bootcamp.declaracoes;

public class Escopo {
    // Escopo de classe (variável de instância)
    // Acessível por qualquer método dentro da classe
    public int publicVar = 1; // Acessível de qualquer lugar
    private int privateVar = 2; // Acessível apenas dentro desta classe
    protected int protectedVar = 3; // Acessível dentro do mesmo pacote e subclasses
    int defaultVar = 4; // Acessível apenas dentro do mesmo pacote

    // Método público acessível de qualquer lugar
    public void mostrarVariaveis() {
        // Escopo de método
        // Acessível apenas dentro deste método
        int metodoVar = 5; // Variável local ao método
        System.out.println("metodoVar: " + metodoVar);

        // Acessando variáveis de instância (escopo de classe)
        System.out.println("publicVar: " + publicVar);
        System.out.println("privateVar: " + privateVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("defaultVar: " + defaultVar);

        // Escopo de bloco
        if (metodoVar > 0) {
            // Acessível apenas dentro deste bloco if
            int blocoVar = 6;
            System.out.println("blocoVar: " + blocoVar);
        }

        // System.out.println("blocoVar: " + blocoVar); // Inválido, blocoVar não está no escopo aqui
    }

    public static void main(String[] args) {
        Escopo exemplo = new Escopo();

        // Acessando método público
        exemplo.mostrarVariaveis();

        // Acessando variáveis de instância diretamente (escopo de classe)
        System.out.println("publicVar: " + exemplo.publicVar);
        // System.out.println("privateVar: " + exemplo.privateVar); // Inválido, privateVar é privado
        System.out.println("protectedVar: " + exemplo.protectedVar);
        System.out.println("defaultVar: " + exemplo.defaultVar);
    }
}

class OutraClasseNoMesmoPacote {
    public void acessarVariaveis() {
        Escopo exemplo = new Escopo();

        // Acessando variáveis de instância (escopo de classe) no mesmo pacote
        System.out.println("publicVar: " + exemplo.publicVar);
        // System.out.println("privateVar: " + exemplo.privateVar); // Inválido, privateVar é privado
        System.out.println("protectedVar: " + exemplo.protectedVar);
        System.out.println("defaultVar: " + exemplo.defaultVar);
    }
}
