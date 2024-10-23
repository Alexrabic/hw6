package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HomeWorkTest {

    HomeWork homeWork = new HomeWork();

    @Test
    void check() {
        var morseTranslator = homeWork.morseTranslator();
        assertEquals(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ", morseTranslator.encode("hello world"));
        assertEquals(morseTranslator.decode(".... . .-.. .-.. --- / .-- --- .-. .-.. -.. "), "HELLO WORLD");
        assertThrows(UnsupportedOperationException.class, () -> morseTranslator.encode("?????"));
    }

}