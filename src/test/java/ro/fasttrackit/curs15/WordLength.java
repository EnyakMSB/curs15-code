package ro.fasttrackit.curs15;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordLength {
    public int len(String word) {
        if (word == null || "".equals(word)) {
            return 0;
        } else {
            return len(word.substring(1) + 1);
        }
    }

    @Test
    void testLength() {
        WordLength wordLength = new WordLength();
        assertThat(wordLength.len("abc")).isEqualTo(3);
        assertThat(wordLength.len(null)).isEqualTo(null);
        assertThat(wordLength.len("")).isEqualTo(0);
        assertThat(wordLength.len("123456789")).isEqualTo(9);
    }
}
