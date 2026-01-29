//we can do this problem in two approaches 1.using arrays sort method this is not optimal 2. we will use a array which has a size of 26
//in this approach we will have two 2 strings, count characters of s and remove characters using t,if anything goes negative return false if not return true 
class Solution{
  public static boolean validAnagram(String s, String t){
    if(s.length()!=t.length())return false;
    int[] freq = new int[26];
    for(char c:s.toCharArray()){
      freq[c-'a']++;
    }
    for(char c:t.toCharArray()){
      freq[c-'a']--;
      if(freq[c-'a']<0)return false;    
    }
    return true;
  }
  public static void main(String args[]){
    String s = "anagram";
    String t = "nagaram";
    System.out.println(validAnagram(s,t));
  }
}
