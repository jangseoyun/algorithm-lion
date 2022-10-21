package com.algorithm.day17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("TODO")
class SolveBracketTest {

    @DisplayName("괄호가 잘 풀리는지")
    @Test
    void bracket() {
        SolveBracket solveBracket = new SolveBracket();
        assertTrue(solveBracket.solution("()()"));
        assertTrue(solveBracket.solution("(())()"));
        assertFalse(solveBracket.solution(")()("));
        assertFalse(solveBracket.solution("(()("));
        assertFalse(solveBracket.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}