package text;

public class XuanZe {
    public static void anXuanZe(int[] arr) {
        
        if (arr == null || arr.length == 0)
            return;
        
        int minIndex = 0;
        
        for (int i = 0; i < arr.length - 1; i++) { // ֻ��Ҫ�Ƚ�n-1�Ρ�
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { // ��i+1��ʼ�Ƚϣ���ΪminIndexĬ��Ϊi������i�Ͳ����ٱȽ��ˡ�
                
                if (arr[j] < arr[minIndex]) 
                    minIndex = j;
                
                if (minIndex != i)  // ���minIndex����i,˵���ҵ�����С��ֵ������֮��
                    swap(arr, i, minIndex);
                
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}