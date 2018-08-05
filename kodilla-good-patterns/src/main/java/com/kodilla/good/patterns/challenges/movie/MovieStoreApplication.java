package com.kodilla.good.patterns.challenges.movie;

import java.util.stream.Collectors;

public class MovieStoreApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movieStringList = movieStore.getMovies().entrySet().stream()
                .flatMap(v -> v.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(movieStringList);
    }
}
