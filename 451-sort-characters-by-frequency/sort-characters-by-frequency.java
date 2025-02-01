class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //maxheap
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char n=pq.poll();
            sb.append(String.valueOf(n).repeat(map.get(n)));
        }
        return sb.toString();
    }
}