package com.kodilla.good.patterns.challenges;

public class MovieStoreApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.print("!");
         movieStore.getMovies().entrySet().stream()
                .flatMap(v -> v.getValue().stream())
                 .map(s -> s + "!")
                .forEach(System.out::print);
    }
}
