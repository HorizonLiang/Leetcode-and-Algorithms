import java.util.Arrays;

/**
 * 冒泡排序
 * 冒泡排序是一种稳定排序,每一轮都要遍历剩余所有元素,总共需要遍历(元素数量-1)轮,时间复杂度为O(n^2)
 */
public class BubbleSort {
    public static void sort(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                int tmp = 0;
                if(array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,8,6,3,7,9,2,1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
