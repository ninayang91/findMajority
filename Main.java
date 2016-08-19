
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={0,0,2,3,0,0,6,7,0,1,0};
		System.out.println(findMajority(a));
	}
	
// A majority element in an array A of size N is an element that
//appears more than N/2 times
//Find a majority element if one exists or reports that one does not.
//Naive solution: Test each element O(N^2);
//O(N)
	
	public static int findMajority(int[] a){
		int counter=0;
		int candidate=0;
		//For any partition(S,T) of Array A, if x is the majority elemnet of A
		//then it must be the majority element of S or T
		for(int i=0;i<a.length;i++){
			if(a[i]==a[candidate]){
				counter++;
			}else{
				counter--;
			}
			if(counter==0){
				candidate=i+1;
			}
		}
		//candidate may equal to a.length, double check in case IndexOutOfBound
		if(candidate==a.length){
			//return -1;
			throw new Error("No solution");
		}
		counter=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==a[candidate]){
				counter++;
			}
		}
		if(counter>a.length/2){
			return a[candidate];
		}else{
			//return -1;
			throw new Error("No solution");
		}
	}
	

}


