package ro.fasttrackit.curs15.ExercitiuRecursivitate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs15.ExercitiuRecursivitate.ExercitiuRecursivitate;

public class ExercitiuRecusivitateTest {
    ExercitiuRecursivitate recursivitate;

    @BeforeEach
    void setup() {
        recursivitate = new ExercitiuRecursivitate();
    }

    @Test
    @DisplayName("suma primelor n numere intregi - > OK")
    void sumaNumereIntregiTest() {
        assertThat(recursivitate.sumaNumereIntregi(10)).isEqualTo(55);
        assertThat(recursivitate.sumaNumereIntregi(0)).isEqualTo(0);
    }

    @Test
    void sumaPrimelorNumerePareTest() {
        assertThat(recursivitate.sumaPrimelorNNumerePare(10)).isEqualTo(30);
    }

    @Test
    void sumNumberDigitsTest() {
        assertThat(recursivitate.sumNumberDigits(1234)).isEqualTo(10);
    }

    @Test
    void reversedPalindromeTest(){
        assertThat(recursivitate.reversedPalindrome("121")).isEqualTo("121");
        assertThat(recursivitate.reversedPalindrome("ana")).isEqualTo("ana");
    }
@Test
    void ckeckPalindromeTest(){
    assertThat(recursivitate.ckeckPalindrome("madam")).isEqualTo(true);
    assertThat(recursivitate.ckeckPalindrome("racecar")).isEqualTo(true);
    assertThat(recursivitate.ckeckPalindrome("test")).isEqualTo(false);
    assertThat(recursivitate.ckeckPalindrome("")).isEqualTo(true);
    assertThat(recursivitate.reversedPalindrome(null)).isEqualTo("");
}
}
