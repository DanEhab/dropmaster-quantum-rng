package APIClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.function.IntFunction;
import org.junit.jupiter.api.Test;

/**
 * The quantum API returns a 17-qubit number (0 to 131,071). Every possible
 * number must map to exactly one item in each boss's drop table.
 */
class BackendTest {

    private static final int OUTCOMES = 1 << 17; // 131,072

    private static void everyOutcomeHasADrop(IntFunction<String> table) {
        for (int x = 0; x < OUTCOMES; x++) {
            assertFalse(table.apply(x).isEmpty(), "No drop for quantum outcome " + x);
        }
    }

    private static int countOf(IntFunction<String> table, String item) {
        int n = 0;
        for (int x = 0; x < OUTCOMES; x++) {
            if (table.apply(x).equals(item)) n++;
        }
        return n;
    }

    @Test
    void generalGraardorCoversEveryOutcome() { everyOutcomeHasADrop(backend::General); }

    @Test
    void krilTsutsarothCoversEveryOutcome() { everyOutcomeHasADrop(backend::KT_items); }

    @Test
    void kreearraCoversEveryOutcome() { everyOutcomeHasADrop(backend::KA_items); }

    @Test
    void commanderZilyanaCoversEveryOutcome() { everyOutcomeHasADrop(backend::CZ_items); }

    @Test
    void armadylHelmetDropsAboutOnceIn384Kills() {
        // From the case study: on average 384 Kree'arra kills for one Armadyl helmet.
        int outcomes = countOf(backend::KA_items, "Armadyl helmet");
        assertEquals(384.0, (double) OUTCOMES / outcomes, 5.0);
    }
}
