package week1;
import java.util.Arrays;

public class Dogproblem {
	
	public static Dog[] Larger(Dog[] dogs) {
//		主函数只判断当前数是不是比windows=2的前后邻居大
		Dog[] returndogs= new Dog[dogs.length];
		int cnt=0;
		for(int i=0; i<dogs.length;i++) {
			if (Biggest(dogs,i)) {
				System.out.println(dogs[i].size);
				returndogs[cnt]=dogs[i];
				cnt=cnt+1;
				
			}
			
			
			
			
		}
		
		
		returndogs=nonulldogs(returndogs, cnt);
		
		return returndogs;
	}
	
	/*判断是不是当前数比其他数都大*/
	public static boolean Biggest(Dog[] dogs,int i) {
		
		boolean right= false;
		for (int j=-2; j<=2;j++) {
//			不与自己比
			if (j==0) {
				
				continue;
			}
//			检测是否不超过index
			if (validindex(dogs,i+j)) {
				
				if (dogs[i+j].size<dogs[i].size){
					
				right=true;   
//				必须一致保持是right最后才是true;不然的话返回的就是loop最后一轮的布尔值。
					
				
				
			}
		
				else {
					right=false;
					break;
//					once have a false, the loop end, and return false;otherwise,the right will always be true and return true
				}
			}
		
			
			
			
			
	
		}
//		System.out.println(right);
		return right;
		}
	
		
		
		

	public static boolean validindex(Dog[] dogs, int i) {
		if (i <0) {
//		下标为负不可以，因为 index从0开始
			return false;
		}
		
		if (i>= dogs.length) {
			return false;
//			超过下标同样不行
		}
		return true;
//另一种写法，用and，一旦有一个不成立，就返回false
//		return (i>=0)&&(i<dogs.length);
	}
	
//	定义类
	public static class Dog {

		int size;
		public Dog(int x) {
			
			this.size=x;
			
		}}
	
//	避免nullpointer，方法是在已构造的数组中loop，并且已知最大非nullindex，重新构造一个新数组并返回
	
	public static Dog[] nonulldogs(Dog[] dogs, int cnt) {
		Dog[] nonulldog = new Dog[cnt];
		for (int i=0; i<cnt ;i++) {
			nonulldog[i]=dogs[i];
			
			
			
		}
		return nonulldog;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Dog[] dogs= new Dog[10] ;
		dogs[0]=new Dog(10);
		dogs[1]=new Dog(15);
		dogs[2]= new Dog(20);
		dogs[3]= new Dog(15);
		dogs[4]= new Dog(10);
		dogs[5]= new Dog(5);
		dogs[6]=new Dog(10);
		dogs[7]= new Dog(15);
		dogs[8]= new Dog(22);
		dogs[9]= new Dog(20);
		
		Dog[] maxdogs=Larger(dogs);
		for(int t=0;t<maxdogs.length;t++) {
			
		System.out.print(maxdogs[t].size+ " ");
		}
}}
