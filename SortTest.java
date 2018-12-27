package text;

import java.util.Random;

/**
 * ���������
 * 
 * �����㷨�ķ������£� 1.��������ֱ�Ӳ��������۰��������ϣ�����򣩣� 2.��������ð�������򡢿������򣩣�
 * 3.ѡ������ֱ��ѡ�����򡢶����򣩣� 4.�鲢���� 5.��������
 * 
 * �������򷽷���ѡ�� (1)��n��С(��n��50)���ɲ���ֱ�Ӳ����ֱ��ѡ������
 * ����¼��ģ��Сʱ��ֱ�Ӳ�������Ϻã�������Ϊֱ��ѡ���ƶ��ļ�¼������ֱ�Ӳ��ˣ�Ӧѡֱ��ѡ������Ϊ�ˡ�
 * (2)���ļ���ʼ״̬��������(ָ����)����Ӧѡ��ֱ�Ӳ��ˡ�ð�ݻ�����Ŀ�������Ϊ�ˣ�
 * (3)��n�ϴ���Ӧ����ʱ�临�Ӷ�ΪO(nlgn)�����򷽷����������򡢶������鲢����
 * 
 */
public class SortTest {

    /**
     * ��ʼ����������ķ���
     * 
     * @return һ����ʼ���õ�����
     */
    public int[] createArray() {
        Random random = new Random();
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100) - random.nextInt(100);// ��������������������֤���ɵ������и���
        }
        System.out.print("ԭʼ����:");
        printArray(array);
        return array;
    }

    /**
     * ��ӡ�����е�Ԫ�ص�����̨
     * 
     * @param source
     */
    public void printArray(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * ����������ָ������Ԫ�ص�λ��
     * 
     * @param data
     * @param x
     * @param y
     */
    private void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }

    /**
     * ð������----���������һ��
     * ������������Ԫ�ؽ��бȽϣ�������Ҫ����н�����ÿ���һ��ѭ���ͽ����Ԫ������������С�������򣩣���һ��ѭ���ǽ����������������Ʋ�����
     * ���ܣ��Ƚϴ���O(n^2),n^2/2����������O(n^2),n^2/4
     * 
     * @param data
     *            Ҫ���������
     * @param sortType
     *            ��������
     * @return
     */
    public void bubbleSort(int[] data, String sortType) {
        if (sortType.equals("asc")) { // �����򣬴�С�ŵ���
            // �Ƚϵ�����
            for (int i = 1; i < data.length; i++) {
                // ���������������бȽϣ��ϴ��������ð��
                for (int j = 0; j < data.length - i; j++) {
                    if (data[j] > data[j + 1]) {
                        // ��������������
                        swap(data, j, j + 1);
                    }
                }
            }
        } else if (sortType.equals("desc")) { // �����򣬴Ӵ��ŵ�С
            // �Ƚϵ�����
            for (int i = 1; i < data.length; i++) {
                // ���������������бȽϣ��ϴ��������ð��
                for (int j = 0; j < data.length - i; j++) {
                    if (data[j] < data[j + 1]) {
                        // ��������������
                        swap(data, j, j + 1);
                    }
                }
            }
        } else {
            System.out.println("��������������ʹ���");
        }
        printArray(data);// ���ð������������ֵ
    }

    /**
     * ֱ��ѡ������----ѡ�������һ�� ������ÿһ�˴Ӵ����������Ԫ����ѡ����С������󣩵�һ��Ԫ�أ�
     * ˳��������ź�������е����ֱ��ȫ�������������Ԫ�����ꡣ ���ܣ��Ƚϴ���O(n^2),n^2/2 ��������O(n),n
     * ����������ð�������ٶ��ˣ����ڽ�������CPUʱ��ȱȽ������CUPʱ��࣬����ѡ�������ð������졣
     * ����N�Ƚϴ�ʱ���Ƚ������CPUʱ��ռ��Ҫ��λ��������ʱ�����ܺ�ð������̫�࣬���������ʿ϶�Ҫ��Щ��
     * 
     * @param data
     *            Ҫ���������
     * @param sortType
     *            ��������
     * @return
     */
    public void selectSort(int[] data, String sortType) {

        if (sortType.equals("asc")) { // �����򣬴�С�ŵ���
            int index;
            
            for (int i = 1; i < data.length; i++) {
                index = 0;
                for (int j = 1; j <= data.length - i; j++) {
                    if (data[j] > data[index]) {
                        index = j;

                    }
                }
                // ������λ��data.length-i��index(���ֵ)������
                swap(data, data.length - i, index);
            }
        } else if (sortType.equals("desc")) { // �����򣬴Ӵ��ŵ�С
            int index;
            
            for (int i = 1; i < data.length; i++) {
                index = 0;
                for (int j = 1; j <= data.length - i; j++) {
                    if (data[j] < data[index]) {
                        index = j;

                    }
                }
                // ������λ��data.length-i��index(���ֵ)������
                swap(data, data.length - i, index);
            }
        } else {
            System.out.println("��������������ʹ���");
        }
        printArray(data);// ���ֱ��ѡ������������ֵ
    }

    /**
     * �������� ��������һ����¼���뵽���ź����������п����ǿձ���,�Ӷ��õ�һ���µļ�¼����1������� ���ܣ��Ƚϴ���O(n^2),n^2/4
     * ���ƴ���O(n),n^2/4 �Ƚϴ�����ǰ���ߵ�һ�㣬�����������CPUʱ��Ͻ����٣����������ϱ�ð���������һ���࣬����ѡ������ҲҪ�졣
     * 
     * @param data
     *            Ҫ���������
     * @param sortType
     *            ��������
     */
    public void insertSort(int[] data, String sortType) {
        
        if (sortType.equals("asc")) { // �����򣬴�С�ŵ���
            // �Ƚϵ�����
            for (int i = 1; i < data.length; i++) {
                // ��֤ǰi+1�����ź���
                for (int j = 0; j < i; j++) {
                    if (data[j] > data[i]) {
                        // ������λ��j��i������
                        swap(data, i, j);
                    }
                }
            }
        } else if (sortType.equals("desc")) { // �����򣬴Ӵ��ŵ�С
            // �Ƚϵ�����
            for (int i = 1; i < data.length; i++) {
                // ��֤ǰi+1�����ź���
                for (int j = 0; j < i; j++) {
                    if (data[j] < data[i]) {
                        // ������λ��j��i������
                        swap(data, i, j);
                    }
                }
            }
        } else {
            System.out.println("��������������ʹ���");
        }
        printArray(data);// �����������������ֵ
    }

    /**
     * ��ת����ķ���
     * 
     * @param data
     *            Դ����
     */
    public void reverse(int[] data) {

        int length = data.length;
        int temp = 0;// ��ʱ����

        for (int i = 0; i < length / 2; i++) {
            temp = data[i];
            data[i] = data[length - 1 - i];
            data[length - 1 - i] = temp;
        }
        printArray(data);// �����ת�������ֵ
    }

    /**
     * �������� ��������ʹ�÷��η���Divide and conquer����������һ�����У�list����Ϊ���������У�sub-lists���� ����Ϊ��
     * 1. ������������һ��Ԫ�أ���Ϊ "��׼"��pivot���� 2.
     * �����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���������ָ�֮�󣬸û�׼���������λ��
     * �������Ϊ�ָpartition�������� 3. �ݹ�أ�recursive����С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
     * �ݻص���ײ����Σ������еĴ�С�����һ��Ҳ������Զ���Ѿ���������ˡ���Ȼһֱ�ݻ���ȥ����������㷨�ܻ��������Ϊ��ÿ�εĵ�����iteration��
     * �У������ٻ��һ��Ԫ�ذڵ�������λ��ȥ��
     * 
     * @param data
     *            �����������
     * @param low
     * @param high
     * @see SortTest#qsort(int[], int, int)
     * @see SortTest#qsort_desc(int[], int, int)
     */
    public void quickSort(int[] data, String sortType) {
        
        if (sortType.equals("asc")) { // �����򣬴�С�ŵ���
            qsort_asc(data, 0, data.length - 1);
        } else if (sortType.equals("desc")) { // �����򣬴Ӵ��ŵ�С
            qsort_desc(data, 0, data.length - 1);
        } else {
            System.out.println("��������������ʹ���");
        }
    }

    /**
     * ��������ľ���ʵ�֣�������
     * 
     * @param data
     * @param low
     * @param high
     */
    private void qsort_asc(int data[], int low, int high) {
        int i, j, x;
        
        if (low < high) { // ����������������ݹ�
            i = low;
            j = high;
            x = data[i];
            while (i < j) {
                while (i < j && data[j] > x) {
                    j--; // ���������ҵ�һ��С��x����
                }
                if (i < j) {
                    data[i] = data[j];
                    i++;
                }
                while (i < j && data[i] < x) {
                    i++; // ���������ҵ�һ������x����
                }
                if (i < j) {
                    data[j] = data[i];
                    j--;
                }
            }
            data[i] = x;
            qsort_asc(data, low, i - 1);
            qsort_asc(data, i + 1, high);
        }
    }

    /**
     * ��������ľ���ʵ�֣��ŵ���
     * 
     * @param data
     * @param low
     * @param high
     */
    private void qsort_desc(int data[], int low, int high) {
        int i, j, x;
        
        if (low < high) { // ����������������ݹ�
            i = low;
            j = high;
            x = data[i];
            while (i < j) {
                while (i < j && data[j] < x) {
                    j--; // ���������ҵ�һ��С��x����
                }
                if (i < j) {
                    data[i] = data[j];
                    i++;
                }
                while (i < j && data[i] > x) {
                    i++; // ���������ҵ�һ������x����
                }
                if (i < j) {
                    data[j] = data[i];
                    j--;
                }
            }
            data[i] = x;
            qsort_desc(data, low, i - 1);
            qsort_desc(data, i + 1, high);
        }
    }

    /**
     * ���ֲ����ض����������������е�λ��(�ݹ�) �������Ա�����������б�
     * 
     * @paramdataset
     * @paramdata
     * @parambeginIndex
     * @paramendIndex
     * @returnindex
     */
    public int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {

        int midIndex = (beginIndex + endIndex) >>> 1; // �൱��mid = (low + high) ����Ч�ʻ��Щ
        
        if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex){
            System.out.println("�Ҳ���Ҫ���ҵ�����");
            return -1;
        }
            
        
        if (data < dataset[midIndex]) {
            return binarySearch(dataset, data, beginIndex, midIndex - 1);
        } else if (data > dataset[midIndex]) {
            return binarySearch(dataset, data, midIndex + 1, endIndex);
        } else {
            return midIndex;
        }
    }

    /**
     * ���ֲ����ض����������������е�λ��(�ǵݹ�) �������Ա�����������б�
     * 
     * @paramdataset
     * @paramdata
     * @returnindex
     */
    public int binarySearch(int[] dataset, int data) {
        int beginIndex = 0;
        int endIndex = dataset.length - 1;
        int midIndex = -1;
        
        if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex)
            return -1;
        while (beginIndex <= endIndex) {
            midIndex = (beginIndex + endIndex) >>> 1; // �൱��midIndex =
                                                        // (beginIndex +
                                                        // endIndex) / 2������Ч�ʻ��Щ
            if (data < dataset[midIndex]) {
                endIndex = midIndex - 1;
            } else if (data > dataset[midIndex]) {
                beginIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SortTest sortTest = new SortTest();

        int[] array = sortTest.createArray();

        System.out.println("==========ð�������(����)==========");
        sortTest.bubbleSort(array, "asc");
        System.out.println("==========ð�������(����)==========");
        sortTest.bubbleSort(array, "desc");
        System.out.println();

        array = sortTest.createArray();

        System.out.println("==========��ת�����==========");
        sortTest.reverse(array);
        System.out.println();

        array = sortTest.createArray();

        System.out.println("==========ѡ�������(����)==========");
        sortTest.selectSort(array, "asc");
        System.out.println("==========ѡ�������(����)==========");
        sortTest.selectSort(array, "desc");
        System.out.println();

        array = sortTest.createArray();

        System.out.println("==========���������(����)==========");
        sortTest.insertSort(array, "asc");
        System.out.println("==========���������(����)==========");
        sortTest.insertSort(array, "desc");
        System.out.println();

        array = sortTest.createArray();
        System.out.println("==========���������(����)==========");
        sortTest.quickSort(array, "asc");
        sortTest.printArray(array);
        System.out.println("==========���������(����)==========");
        sortTest.quickSort(array, "desc");
        System.out.println();
        sortTest.printArray(array);

        System.out.println("==========������ֲ���==========");
        System.out.println("��Ҫ�ҵ����ڵ�" + sortTest.binarySearch(array,0) + "��λ�ӡ����±��0���㣩");
    }
}