class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>mp=new HashMap<>();
        for(String str: strs){
            char [] curr=str.toCharArray();
            Arrays.sort(curr);
            String key = new String(curr);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(str);
           
            
        }
        return new ArrayList<>(mp.values());
        
    }
}
