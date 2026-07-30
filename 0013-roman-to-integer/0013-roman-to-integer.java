class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roadMap = new HashMap<>();
        roadMap.put('I',1);
        roadMap.put('V',5);
        roadMap.put('X',10);
        roadMap.put('L',50);
        roadMap.put('C',100);
        roadMap.put('D',500);
        roadMap.put('M',1000);

        int total = 0;

        for(int i = 0;i < s.length();i++)
        {
            int currVal = roadMap.get(s.charAt(i));
            if(i+1 < s.length())
            {
                int nextVal = roadMap.get(s.charAt(i+1));
                if(currVal < nextVal){
                    total += (nextVal-currVal);
                    i++;
                    continue;
                }   
            }
            total += currVal;
        }
        return total;
    }
}