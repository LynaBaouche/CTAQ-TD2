package org.example.minibuild;

public record Gav(String group, String artifact, String version) {
    public static Gav parse(String coordinate) {
        return new Gav("org.acme", "", "");     // FAKE : une valeur constante
    }
}
