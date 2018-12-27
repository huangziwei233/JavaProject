package text;
public class ChaRu {
    public static void anChaRu(int[] arr) {

        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) {// 假设第一个数的位置是正确的，要想往后移，就必须要假设第一个数的位置是正确的。

            int j = i;
            int target = arr[i];// 等待插入数字

            // 后移数字
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // 插入数字
            arr[j] = target;
        }
    }
}
