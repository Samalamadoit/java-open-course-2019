package ru.mail.polis.open.task3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketSequenceCheckerTest {

    boolean check = false;


    @BeforeEach
    void before1(){}

    @Test
    void checkEmptySequence() {
        try {
            CorrectBracketSequenceChecker.checkSequence("()");
        } catch (Throwable e) {
            fail(e);
        }
        assertThrows(
                IllegalArgumentException.class,
                () -> CorrectBracketSequenceChecker.checkSequence(null)
        );
        check = true;
    }

    @AfterEach
    void checkEmptyAfter() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            System.out.println("++");
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before2(){}


    @Test
    void checkIncorrectSequence() {
        try {
            CorrectBracketSequenceChecker.checkSequence("()");
        } catch (Throwable e) {
            fail(e);
        }
        assertThrows(
                IllegalArgumentException.class,
                () -> CorrectBracketSequenceChecker.checkSequence("dcp")
        );
        check = true;
    }

    @AfterEach
    void checkIncorrectAfter() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before3(){}

    @Test
    void checkIncorrectSequence2() {
        try {
            CorrectBracketSequenceChecker.checkSequence("()");
        } catch (Throwable e) {
            fail(e);
        }
        assertThrows(
                IllegalArgumentException.class,
                () -> CorrectBracketSequenceChecker.checkSequence("(a)")
        );
        check = true;
    }

    @AfterEach
    void checkIncorrectAfter2() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before4(){}

    @Test
    void checkLengthSequence() {
        try {
            CorrectBracketSequenceChecker.checkSequence("()");
        } catch (Throwable e) {
            fail(e);
        }
        assertThrows(
                IllegalArgumentException.class,
                () -> CorrectBracketSequenceChecker.checkSequence("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()")
        );
        check = true;
    }

    @AfterEach
    void checkLengthAfter() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before5(){}

    @Test
    void checkFalseString() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("{(}");
        assertFalse(b);
        check = true;
    }

    @AfterEach
    void checkFalseAfter() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before6(){}

    @Test
    void checkFalseString2() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("{(");
        assertFalse(b);
        check = true;
    }

    @AfterEach
    void checkFalseAfter2() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before7(){}

    @Test
    void checkFalseString3() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("}");
        assertFalse(b);
        check = true;
    }

    @AfterEach
    void checkFalseAfter3() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before8(){}

    @Test
    void checkFalseString4() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("(]");
        assertFalse(b);
        check = true;
    }

    @BeforeEach
    void before13(){}

    @AfterEach
    void checkFalseAfter4() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before9(){}

    @Test
    void checkFalseString5() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("([)]");
        assertFalse(b);
        check = true;
    }

    @AfterEach
    void checkFalseAfter5() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before10(){}

    @Test
    void checkTrueString() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("()");
        assertTrue(b);
        check = true;
    }

    @AfterEach
    void checkTrueAfter() {
        if (check) {
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before11(){}


    @Test
    void checkTrueString2() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("()[]{}");
        assertTrue(b);
        check = true;
    }

    @AfterEach
    void checkTrueAfter2() {
        if(check){
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @BeforeEach
    void before12(){}

    @Test
    void checkTrueString3() {
        boolean b = CorrectBracketSequenceChecker.checkSequence("({[][]({})})[{}()]{{}{}}");
        assertTrue(b);
        check = true;
    }

    @AfterEach
    void checkTrueAfter3() {
        if(check){
            CorrectBracketSequenceChecker.countOfCorrectTest++;
        } else {
            CorrectBracketSequenceChecker.countOfFailTests++;
        }

        check = false;
    }

    @AfterAll
    static void writeResults(){
        System.out.println(CorrectBracketSequenceChecker.countOfCorrectTest);
        System.out.println(CorrectBracketSequenceChecker.countOfFailTests);
    }
}