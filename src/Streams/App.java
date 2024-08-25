package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        // Q1 : Square each number
        List<Integer> nums = Arrays.asList(3, 7, 2, 8, 10, 1, 5);

        Stream<Integer> data = nums.stream();
        Stream<Integer> mappedData = data.map(d -> d * d);
        mappedData.forEach(System.out::println);
        


        // Q2 : Filter even numbers and sort them
        List<Integer> nums2 = Arrays.asList(3, 7, 2, 8, 10, 1, 5);

        nums2.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .map(n -> n * n)
                .forEach(System.out::println);

            
        // OTHER QUESTIONS:

        // Q3: Filter even numbers, square them and sort them
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 10, 1, 5);
        List<Integer> processedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(processedNumbers);


        // Q4: Reverse and capitalize each word
        List<String> words = Arrays.asList("stream", "filter", "map", "collect", "java", "programming");
        String result = words.stream()
                .map(w -> new StringBuilder(w).reverse().toString())
                .filter(w -> w.length() > 4)
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .collect(Collectors.joining(","));

        System.out.println("Sonuç: " + result);


        // Q5: Sum of positive numbers
        List<Integer> numbersForQuestion = Arrays.asList(-10, 15, 3, -7, 0, 8, -2, 5);
        Integer positiveNumbers = numbersForQuestion.stream()
                .filter(n -> n > 0)
                .mapToInt(Integer::intValue)
                .sorted()
                .sum();

        System.out.println(positiveNumbers);

        // Q6: Find the longest sentence
        List<String> sentences = Arrays.asList(
                "Java is a programming language",
                "Streams are powerful",
                "Lambda expressions are concise",
                "Functional programming is interesting",
                "Learn Java and improve your skills");

        String longestSentence = sentences.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(longestSentence);
    }

}
