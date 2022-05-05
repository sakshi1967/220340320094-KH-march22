//Question 2

 class InsertionSort{
    public  void sort(int a1[] , int n){
	     for(int i = 1;i<n ; i++ ){
		    int key = a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>key){
			     a1[j+1]=a1[j];
				 j=j-1;
			}
			a1[j+1] = key;
		 } 
	}
	public  void display(int a1[] , int n){
	    for(int i = 0; i<n;i++){
		    System.out.print(a1[i] +" ");
		}
	}
 public static void main(String[] args){
 InsertionSort s1 = new InsertionSort();
 
 int a1[] = {2 , 4 ,6 , 8 ,3};
 int n =a1.length;
 System.out.println("Size of the array :"+n);
 System.out.println("Before sorting of the array ");
 s1.display(a1 , n);
 System.out.println();
 System.out.println("After sorting of the array ");
 s1.sort(a1 , n);
 s1.display(a1 , n);
 }
 }