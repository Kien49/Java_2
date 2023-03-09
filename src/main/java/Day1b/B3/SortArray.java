package Day1b.B3;

public class SortArray {
    //Cho phep sx lai tat ca doi tuong implement compartor

    public <T extends IComparator<T>> void printArray(T[] arr){
        System.out.println("Array: ");

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public <T extends IComparator<T>> void sorted(T[] arr){
        for(int i =0; i< arr.length-1; i++){
            for(int j=0; j< arr.length; j++){
                if(arr[i].compare(arr[j]) > 0){
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
