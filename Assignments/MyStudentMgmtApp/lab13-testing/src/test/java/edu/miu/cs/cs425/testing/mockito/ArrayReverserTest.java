package edu.miu.cs.cs425.testing.mockito;

import edu.miu.cs.cs425.testing.junitest.ArrayFlattenerService;
import edu.miu.cs.cs425.testing.mockito.ArrayReverser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@RunWith(value= MockitoJUnitRunner.class)
class ArrayReverserTest {

    @Mock
    private ArrayReverser arrayReverser;

    @BeforeEach
    void setUp() {
        this.arrayReverser = new ArrayReverser();
    }

    @AfterEach
    void tearDown() {
        this.arrayReverser = null;
    }

    @Test
    public void whenWithInput() {
        ArrayReverser arrayReverser = new ArrayReverser();
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {9, 5, 4, 0, 3, 1};
        int[] result = arrayReverser.reversedArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenInputIsNull() {
        ArrayReverser arrayReverser = new ArrayReverser();
        int[][] input = null;
        int[] result = arrayReverser.reversedArray(input);
        assertNull(result);
    }


}