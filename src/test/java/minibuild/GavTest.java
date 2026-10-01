package minibuild;
import org.example.minibuild.Gav;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GavTest {

    @Test
    void decoupeLeGroupe() {
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
        assertEquals("org.acme", gav.group());
    }
    @Test
    void decoupeUneAutreCoordonnee() {
        Gav gav = Gav.parse("org.other:lib-c:3.0.0");
        assertEquals("org.other", gav.group());
        assertEquals("lib-c", gav.artifact());
        assertEquals("3.0.0", gav.version());
    }
    @ParameterizedTest
    @CsvSource({
            "org.acme:lib-a:1.0.0,  org.acme,  lib-a, 1.0.0",
            "org.other:lib-c:3.0.0, org.other, lib-c, 3.0.0"
    })
    void decoupeUneCoordonneeValide(String entree, String groupe, String artefact, String version) {
        Gav gav = Gav.parse(entree);
        assertEquals(groupe, gav.group());
        assertEquals(artefact, gav.artifact());
        assertEquals(version, gav.version());
    }
}