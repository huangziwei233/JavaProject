package text;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100-1000�е�ˮ�ɻ����У�");
		for(int i=100;i<1000;i++){
			int x  = i%10;
			int y = i/10%10;
			int z = i/100%10;
			//ˮ�ɻ����ж�Ҫ��
			if(i == x*x*x+y*y*y+z*z*z){
				System.out.println(i+" ");
			}
		}
 
	}
 
}