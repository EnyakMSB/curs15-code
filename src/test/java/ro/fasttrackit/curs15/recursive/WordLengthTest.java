package ro.fasttrackit.curs15.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordLengthTest {
    @Test
    void testLength(){
        WordLength wordLength=new WordLength();
        assertThat(wordLength.len("abc")).isEqualTo(3);
    }

    @Test
    void testRev(){
        WordLength wordLength=new WordLength();
        assertThat(wordLength.rev("abc")).isEqualTo("cba");
    }

}