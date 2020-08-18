import java.util.Arrays;

/**
 * 冒泡排序优化2
 * 数组 3,4,2,1,5,6,7,8 前半部分无序的，后半部分是有序的
 * 关键点在于对数列有序区的界定
 * 在每一轮排序后，记录最后一次元素交换的位置
 */
public class BubbleSort2 {

    public static void sort(int[] array){
        // 记录最后一次交换的位置;
        int lastExchangeIndex = 0;
        // 无序数列的边界,每次比较只需要比到这里为止
        int sortBorder = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            // 有序标识,每一轮的初始值都是true
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                int tmp = 0;
                if(array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    // 因为有元素发生交换,所以标识为false
                    isSorted = false;
                    // 更新最后一次交换元素的位置
                    lastExchangeIndex = j;
                }
            }
            sortBorder = lastExchangeIndex;

            if(isSorted){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,2,1,5,6,7,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
