package edu.bithefithy.bootcamp.declaracoes;

    public class Metodos {

        // Método de Instância
        // Pertence a uma instância específica da classe
        private String nome;

        // Método de instância para definir o nome
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Método de instância para obter o nome
        public String getNome() {
            return nome;
        }

        // Método Estático
        // Pertence à classe em si e não a instâncias individuais
        public static int soma(int a, int b) {
            return a + b;
        }

        // Método de Construtor
        // Usado para inicializar objetos quando são criados
        public Metodos(String nome) {
            this.nome = nome;
        }

        // Método de Sobrecarga (Overload)
        // Mesmo nome de método com diferentes tipos de parâmetros ou quantidade de parâmetros
        public int soma(int a, int b, int c) {
            return a + b + c;
        }

        public double soma(double a, double b) {
            return a + b;
        }

        // Método Final
        // Não pode ser sobrescrito por subclasses
        public final void metodoFinal() {
            System.out.println("Este método não pode ser sobrescrito.");
        }

        // Método Abstrato (em uma classe abstrata)
        // Não tem implementação na classe onde é declarado, define um contrato para subclasses
        public abstract static class Animal {
            public abstract void emitirSom();
        }

        // Subclasse que sobrescreve o método abstrato
        public static class Cachorro extends Animal {
            @Override
            public void emitirSom() {
                System.out.println("Cachorro latindo");
            }
        }

        // Método Privado
        // Não pode ser acessado fora da classe onde é declarado
        private void metodoPrivado() {
            System.out.println("Método privado");
        }

        // Método Protegido
        // Pode ser acessado dentro do mesmo pacote e por subclasses
        protected void metodoProtegido() {
            System.out.println("Método protegido");
        }

        public static void main(String[] args) {
            // Exemplo de uso de métodos de instância
            Metodos exemplo = new Metodos("João");
            exemplo.setNome("Maria");
            System.out.println(exemplo.getNome());

            // Exemplo de uso de método estático
            int resultado = Metodos.soma(10, 5);
            System.out.println("Soma estática: " + resultado);

            // Exemplo de uso de métodos sobrecarregados
            System.out.println("Soma sobrecarregada (int): " + exemplo.soma(1, 2, 3));
            System.out.println("Soma sobrecarregada (double): " + exemplo.soma(1.5, 2.5));

            // Exemplo de uso de método final
            exemplo.metodoFinal();

            // Exemplo de uso de método abstrato
            Animal cachorro = new Cachorro();
            cachorro.emitirSom();

            // Exemplo de uso de método privado (somente dentro da classe)
            exemplo.metodoPrivado();

            // Exemplo de uso de método protegido
            exemplo.metodoProtegido();
        }
    }
