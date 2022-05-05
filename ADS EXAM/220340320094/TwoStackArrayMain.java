// Question 3
import java.util.*;

 class TwoStackArray{
    int[] arr;
    int size;
    int top1;
    int top2;

    TwoStackArray(int size){
	    this.size= size;
		arr= new int[size];
		top1 = size/2 +1;
		top2= size/2;
	}
	void push1(int x){
	    if(top1>0){
		    top1--;
			arr[top1] = x;
		}else{
		     //System.out.println("Stack overflow by element :"+x );
			 return;
		}
	}
	void push2(int x){
	    if(top2<size-1){
		    top2++;
			arr[top2] = x;
		}else{
		     //System.out.println("Stack overflow by element :"+x );
			 return;
		}
	}
	int pop1(){
	    if(top1<=size/2){
		int x = arr[top1];
		top1++;
		return x;
		}
		else{
		System.out.println("Stack underflow " );
		System.exit(1);
		}
		return 0;
	}
	int pop2(){
	    if(top2 >=size/2+1){
		int x = arr[top2];
		top2--;
		return x;
		}
		else{
		System.out.println("Stack underflow " );
		System.exit(1);
		}
		return 1;
	}
 }
 class TwoStackArrayMain{
     public static void main(String[] args){
	 TwoStackArray s = new TwoStackArray(8);
	 s.push1(5);
	 s.push2(10);
	 s.push2(15);
	 s.push1(11);
	 s.push2(40);
	s.push2(7);
 
 System.out.println("Popped element from stack1 is  "+s.pop1() );
   
 System.out.println("Popped element from stack2 is  "+s.pop2() );
    }
 }