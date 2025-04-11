import org.intro_testing.Exercises;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Tdd {


    @Test
     @DisplayName
             ("Test array contains odd integers from 1 to n")
     void oddItoNTest() {

        int n = 10;
        int[] expectedResult = {1, 3, 5, 7, 9};
        int[] result = Exercises.oddUntilN(n); //1 esto fallará porque no existe aún(RED).

        assertArrayEquals(expectedResult, result);

    }

   // @Test
    @RepeatedTest(99)
    @DisplayName
            ("Test contains Java KeyWords")

    void keywordsTest(){
        String[] keyWordsJava=
                {
                        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                        "continue", "default", "do", "double", "else", "enum", "exports", "extends", "final", "finally",
                        "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long",
                        "module", "native", "new", "null", "open", "opens", "package", "private", "protected", "provides",
                        "public", "record", "requires", "return", "short", "static", "strictfp", "super", "switch",
                        "synchronized", "this", "throw", "throws", "to", "transient", "transitive", "try", "uses", "var",
                        "void", "volatile", "while", "with", "yield"
                };
        int numWords= 64;
        Random random = new Random();
        int randomIndex=random.nextInt(64); //beetwen 0..67 inclusive
        String checkWordJava = keyWordsJava[randomIndex]; // Return random keyWordJava

        // convert String to List. It is more easy find item.
        assertTrue (Arrays.asList(keyWordsJava).contains(checkWordJava));
        assertFalse (Arrays.asList(keyWordsJava).contains("ThisWordNoExist"));
        //assertFalse (Arrays.asList(keyWordsJava).contains("while"));
        }



    }

