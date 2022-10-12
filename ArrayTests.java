import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4Elem() {
    int[] input1 = { 1, 2, 3, 4 };
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace4Elem() {
    int[] input1 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, input1);
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = { 99.1, 92.0, 90.0, 89.0, 88.5 };
    assertEquals(92.5, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.1);

    double[] input2 = { 1 };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2), 0.1);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = { -2, 0, 3, 3 };
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

}
