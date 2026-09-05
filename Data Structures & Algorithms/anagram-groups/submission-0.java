    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            
            for(int i = 0; i < strs.length; i++){
                String string = strs[i];
                char[] chars = string.toCharArray();
                Arrays.sort(chars);
                String sortedString = new String(chars);
                
                List<String> group;
                if(map.containsKey(sortedString)){
                    group = map.get(sortedString);
                } else{
                    group = new ArrayList<>();
                }

                group.add(string);
                map.put(sortedString, group);
            }
            List<List<String>> solution = new ArrayList<List<String>>(map.values());
            return solution;

        }
    }
