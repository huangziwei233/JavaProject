package text;

import java.util.Scanner;
public class ð��
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner input = new Scanner(System.in);//ʵ������̨������
      int num=0;
      System.out.println("��������Ҫ��������ָ���:");
      num=input.nextInt();
       int []a = new int[num];
       
       System.out.println("����������:");
       for(int i=0;i<a.length;i++){
           a[i] = input.nextInt();
        }
      
       System.out.println("����֮ǰ:");
        for (int i : a) {
             System.out.print(i+"\t");
       }
         
       //ð������ʵ��
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                  int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
          }
       }
              
       System.out.println("\n����֮��:");
        for (int i : a) {
             System.out.print(i+"\t");
         }
        
    }
}


