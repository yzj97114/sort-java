import com.zzzsj.sort.bubble.BubbleSort;
import com.zzzsj.sort.selection.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {

    int[] arr = new int[]{1,4,6,9,20,3,2,7,8,19};

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }

    /**
     * 选择排序
     */
    @Test
    public void SelectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(arr)));
    }
}
