package text;
public class ChaRu {
    public static void anChaRu(int[] arr) {

        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) {// �����һ������λ������ȷ�ģ�Ҫ�������ƣ��ͱ���Ҫ�����һ������λ������ȷ�ġ�

            int j = i;
            int target = arr[i];// �ȴ���������

            // ��������
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            // ��������
            arr[j] = target;
        }
    }
}
