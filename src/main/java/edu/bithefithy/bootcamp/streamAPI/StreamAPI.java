package edu.bithefithy.bootcamp.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StreamAPI {

    public static void main(String[] args) {
        // Exemplos genéricos para ilustrar o uso de cada operação

        // Operações Intermediárias

        // filter: Filtra elementos da stream
        Stream.of(1, 2, 3, 4, 5).filter(n -> n % 2 == 0);

        // map: Transforma os elementos da stream
        Stream.of("a", "b", "c").map(String::toUpperCase);

        // flatMap: Transforma cada elemento em uma stream e "achata"
        Stream.of("apple", "banana").flatMap(s -> Stream.of(s.split("")));

        // distinct: Remove elementos duplicados
        Stream.of(1, 2, 2, 3).distinct();

        // sorted: Ordena os elementos em ordem natural
        Stream.of(3, 1, 2).sorted();

        // sorted (Comparator): Ordena os elementos de acordo com um comparador
        Stream.of("apple", "banana").sorted(Comparator.comparing(String::length));

        // peek: Executa uma ação para cada elemento
        Stream.of(1, 2, 3).peek(System.out::println);

        // limit: Limita o número de elementos
        Stream.of(1, 2, 3, 4).limit(2);

        // skip: Ignora os primeiros elementos
        Stream.of(1, 2, 3, 4).skip(2);

        // mapToInt: Transforma os elementos em uma stream de int
        Stream.of("1", "2", "3").mapToInt(Integer::parseInt);

        // mapToLong: Transforma os elementos em uma stream de long
        Stream.of("1", "2", "3").mapToLong(Long::parseLong);

        // mapToDouble: Transforma os elementos em uma stream de double
        Stream.of("1.0", "2.0", "3.0").mapToDouble(Double::parseDouble);

        // flatMapToInt: Transforma os elementos em uma stream de IntStream
        Stream.of("12", "34").flatMapToInt(s -> s.chars().map(Character::getNumericValue));

        // flatMapToLong: Transforma os elementos em uma stream de LongStream
        Stream.of("12", "34").flatMapToLong(s -> LongStream.of(Long.parseLong(s)));

        // flatMapToDouble: Transforma os elementos em uma stream de DoubleStream
        Stream.of("1.2", "3.4").flatMapToDouble(s -> DoubleStream.of(Double.parseDouble(s)));

        // boxed: Converte uma stream de tipos primitivos em uma stream de objetos correspondentes
        IntStream.of(1, 2, 3).boxed();


        // Operações Terminais

        // forEach: Executa uma ação para cada elemento
        Stream.of("a", "b", "c").forEach(System.out::println);

        // forEachOrdered: Executa uma ação para cada elemento, mantendo a ordem
        Stream.of("a", "b", "c").forEachOrdered(System.out::println);

        // toArray: Retorna um array com os elementos da stream
        Object[] array = Stream.of(1, 2, 3).toArray();

        // toArray (IntFunction): Retorna um array com os elementos da stream, usando o gerador fornecido
        Integer[] intArray = Stream.of(1, 2, 3).toArray(Integer[]::new);

        // reduce (identity, accumulator): Combina os elementos da stream
        int sum = Stream.of(1, 2, 3).reduce(0, Integer::sum);

        // reduce (accumulator): Combina os elementos da stream
        Integer max = Stream.of(1, 2, 3).reduce(Integer::max).orElse(0);

        // collect (Collector): Coleta os elementos em uma coleção ou outro tipo de resultado
        List<Integer> list = Stream.of(1, 2, 3).collect(Collectors.toList());

        // collect (Supplier, BiConsumer, BiConsumer): Coleta os elementos usando funções específicas
        List<Integer> customList = Stream.of(1, 2, 3).collect(
                ArrayList::new, ArrayList::add, ArrayList::addAll);

        // min: Retorna o menor elemento
        int min = Stream.of(1, 2, 3).min(Integer::compareTo).orElse(0);

        // max: Retorna o maior elemento
        int maxElement = Stream.of(1, 2, 3).max(Integer::compareTo).orElse(0);

        // count: Retorna o número de elementos
        long count = Stream.of(1, 2, 3).count();

        // anyMatch: Retorna true se algum elemento corresponder ao predicado
        boolean hasEven = Stream.of(1, 2, 3).anyMatch(n -> n % 2 == 0);

        // allMatch: Retorna true se todos os elementos corresponderem ao predicado
        boolean allEven = Stream.of(2, 4, 6).allMatch(n -> n % 2 == 0);

        // noneMatch: Retorna true se nenhum elemento corresponder ao predicado
        boolean noneOdd = Stream.of(2, 4, 6).noneMatch(n -> n % 2 != 0);

        // findFirst: Retorna o primeiro elemento
        int first = Stream.of(1, 2, 3).findFirst().orElse(0);

        // findAny: Retorna algum elemento
        int any = Stream.of(1, 2, 3).findAny().orElse(0);

        // toList: Coleta os elementos em uma lista (somente Java 16+)
        List<Integer> listFromToList = Stream.of(1, 2, 3).toList();
    }
}
