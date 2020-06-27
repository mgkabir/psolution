package io.kabir.mockito;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    Repository repo = new Repository();

    public List<String> getLongNames() {
        return repo.getAllNames()
                .stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> getShortNames() {
        return repo.getAllNames()
                .stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toList());
    }
}
