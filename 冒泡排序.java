package text;

//�ȶ�
//��Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵������ýϴ�������³�����С������ð��
//����ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
public class ð������ {
  public static void main(String[] args) {
      int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
      System.out.println("����֮ǰ��");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
      //ð������
      for (int i = 0; i < a.length; i++) {
          for(int j = 0; j<a.length-i-1; j++){
              //����-i��Ҫ��ÿ����һ�ζ�������i�������������ȥ�ˣ�û�б�Ҫ���滻��
              if(a[j]>a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
              }
          }
      }
      System.out.println();
      System.out.println("����֮��");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
  }
}