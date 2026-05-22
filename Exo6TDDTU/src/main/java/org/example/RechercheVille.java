package org.example;

import java.util.List;

public class RechercheVille {

    private final List<String> villes;

    public RechercheVille() {
        villes = List.of(
                "Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver",
                "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok",
                "Hong Kong", "Dubaï", "Rome", "Istanbul"
        );
    }

    public List<String> Rechercher(String mot) {
        if ("*".equals(mot)) {
            return villes;
        }
        if (mot == null || mot.length() < 2) {
            throw new NotFoundException();
        }
        String recherche = mot.toLowerCase();
        return villes.stream()
                .filter(ville -> ville.toLowerCase().contains(recherche))
                .toList();
    }
}
