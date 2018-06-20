package IntSet;

public class IntSetArr{
	public int[] array;
	public int size;
	public int maxvalue;
	
	public IntSetArr() {
		size=0;
		maxvalue=0;
		
	}
	
	public int size() {
		return size;
		
	}
	public void intSetImp(int maxelems, int maxval) {
		array = new int[maxelems];
		maxvalue = maxval;
		
	}
	
	public void insert(int elem) { //insert
		if(size < array.length && elem < maxvalue) {
			for(int i=0;i<size;i++) {
				if(elem == array[i]) {
					return ;
				}
			}
			array[size] = elem;
			size++;
		}
	}
	public int[] report() {
		Sort(array, 0, array.length -1);
		return array;
	}
	
	public void Sort(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int p = arr[(left+right)/2];
		
		do {
			while(arr[l]<p) {
				l++;
			}
			while(arr[r]>p) {
				r--;
			}
			if(l<=r) {
				int tmp = arr[l];
				arr[l]=arr[r];
				arr[r]=tmp;
				l++; r--;
				
			}
		}while(l<=r);
		
		if(left<r) {
			Sort(arr,left,r);
			
		}if(right > l) {
			Sort(arr,l,right);
		}
	}
	
}

