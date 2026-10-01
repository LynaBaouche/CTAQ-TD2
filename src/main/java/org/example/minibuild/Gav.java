package org.example.minibuild;

public record Gav(String group, String artifact, String version) {
    public static Gav parse(String coordinate) {
        if (coordinate == null) {
            throw new IllegalArgumentException("coordonnée absente (null)");
        }
        String[] parts = coordinate.split(":", -1);
        if (parts.length != 3) {
            throw new IllegalArgumentException("attendu group:artifact:version, reçu : \"" + coordinate + "\"");
        }
        for (String part : parts) {
            if (part.isBlank()) {
                throw new IllegalArgumentException("composant vide dans : \"" + coordinate + "\"");
            }
        }
        return new Gav(parts[0], parts[1], parts[2]);
    }
}
