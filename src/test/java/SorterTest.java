import com.training.Sorter;
import org.junit.Assert;
import org.junit.Test;

public class SorterTest {
    private Sorter sorter = new Sorter();
    private final int input[][] = {null, {}, {8, 0, -1, 9, 3, 5, 2}, {8, 1, 1, 9, 1, 5, 2}};
    private final int expected[][] = {null, {}, {-1, 0, 2, 3, 5, 8, 9}, {1, 1, 1, 2, 5, 8, 9}};

    @Test
    public void bubbleSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doBubbleSort(input[i]);
            Assert.assertArrayEquals(expected[i], sorter.arr);
        }
    }

    @Test
    public void selectionSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doSelectionSort(input[i]);
            Assert.assertArrayEquals(expected[i], sorter.arr);
        }
    }

    @Test
    public void insertionSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doInsertionSort(input[i]);
            Assert.assertArrayEquals(expected[i], sorter.arr);
        }
    }

    @Test
    public void quickSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doQuickSort(input[i]);
            Assert.assertArrayEquals(expected[i], sorter.arr);
        }
    }
}
