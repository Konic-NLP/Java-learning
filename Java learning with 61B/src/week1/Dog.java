package week1;
import java.util.Arrays;

public class Dog {

	int size;
	public Dog(int x) {
		
		this.size=x;
		
	}
	public static Dog[] Larger(Dog[] dogs) {
		Dog[] maxdogs= new Dog[dogs.length];
			int cnt=0;
		
			for(int j=0; j <dogs.length;j++) {
				int max =0;
				int maxsize=0;
				boolean right= true;
				for(int i= -2;i<=2;i++) {
				if (check(j,i,dogs)) {
					if (dogs[i+j].size>dogs[j].size) {
					right=false;
					}
					
					
					
				}
				continue;
				
				
			}
		
				if (right) {
				maxdogs[cnt]=dogs[j];
				cnt=cnt+1;}
				
			}

			
			
			
			maxdogs=nonulldogs(maxdogs,cnt);
			return maxdogs;
			
			}
		
		
		
		
		
		
	
	public static boolean check(int j, int i,Dog[] dogs) {
		
		boolean overcheck=true;
		if (j+i <0) {
			overcheck=false;}
		if (j+i>dogs.length-1) {
		    overcheck=false;
			
		}
		return overcheck;
		
		
		
		
	}
	
	public static Dog[] nonulldogs(Dog[] dogs, int cnt) {
		Dog[] nonulldog=new Dog[cnt];
		
		
		for(int i=0;i<cnt;i++) {
			
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
		
		
		
	}
	
			
		
}


/*  methods and variables are “members” of the class. Members can be instance members or static members.
 *  Static members: include ''static'
 *  instance members: not include 'static'
 */
