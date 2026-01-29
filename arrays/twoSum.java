//given an input array and target we need to return the sum of any numbers in the array == target
//approach 1 use 2 for loops with indexing i and j(i+1)
//approach 2 use hashmap which will store the number and its index value 
class Solution{
  public static int[] twoSum(int[] arr, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      //complement avoids using the same element twice
      int complement = target - arr[i];
      if(map.containsKey(complement))return new int[]{map.get(complement),i};
      map.put(arr[i],i);
    }
    return new int[]{};
  }
  public static void main(String args[]){
    int[] arr = {2,7,11,15};
    int target = 9;
    //it will print memory address
    //System.out.println(twoSum(arr,target));
    System.out.println(Arrays.toString(twoSum(arr,target)));
  }
}
