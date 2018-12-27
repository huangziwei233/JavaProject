package text;

public class shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100-1000中的水仙花数有：");
		for(int i=100;i<1000;i++){
			int x  = i%10;
			int y = i/10%10;
			int z = i/100%10;
			//水仙花数判断要求
			if(i == x*x*x+y*y*y+z*z*z){
				System.out.println(i+" ");
			}
		}
 
	}
 
}