package org.example.minibuild;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryStorage implements IStorage {
    private final Map<Gav, Artifact> artefacts = new HashMap<>();

    @Override
    public void put(Gav gav, Artifact artifact) {
        artefacts.put(gav, artifact);
    }
    @Override
    public Optional<Artifact> get(Gav gav) {
        return Optional.ofNullable(artefacts.get(gav));
    }
}

