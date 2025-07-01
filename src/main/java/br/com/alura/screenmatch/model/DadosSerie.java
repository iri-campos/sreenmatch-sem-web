package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("Plot") String sinopse,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Poster") String poster) {
}
