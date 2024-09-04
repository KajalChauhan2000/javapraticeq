public class Duplicate {
    public static void main(String args[])
    {
        int arr[]= new int[]{7,8,9,7,10,10,8};
        
        System.out.println("Duplicates elementsn in given array : ");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
