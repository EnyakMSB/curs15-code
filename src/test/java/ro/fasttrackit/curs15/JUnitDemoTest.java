package ro.fasttrackit.curs15;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Once before all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before Test");
    }

    @Test
    @DisplayName("WHEN the test is called THEN ... ")
  void testWhenTheNumberReceivedIsTheSumOfParameters(){

    }
    void test() {
        System.out.println("Acesta este un test");
    }

    @Test
    void test2() {
        System.out.println("Alt test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after tests");
    }

    @AfterAll

    static void afterAll() {
        System.out.println("Once after all");
    }
}
