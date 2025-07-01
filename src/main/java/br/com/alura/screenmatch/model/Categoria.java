package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    DOCUMENTARIO("Documentary", "Documentário"),
    ROMANCE ("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    FANTASIA("Fantasy", "Fantasia"),
    SUSPENSE("Triller","Suspense"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    TERROR("Horror", "Terror"),
    ANIMACAO("Animation", "Animação"),
    MISTERIO ("Mystery", "Mistério");

    private String categoriaOmdb;

    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
