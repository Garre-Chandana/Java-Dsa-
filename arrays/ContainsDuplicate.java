import java.util.*;
/*
Pattern: Hashing
Idea: Used hashset to track seen elements. if an element appears again, return true.
Time: O(n),space:O(n)
*/
class Solution{
  public boolean containsDuplicate(int[] nums){
    HashSet<Integer> set =  new HashSet<>();
    for(int n:nums){
      if(set.contains(n))return true;
    }
    return false;
  }
}
