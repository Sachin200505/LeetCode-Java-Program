class Solution {
    public boolean wordPattern(String pattern, String s) {
        String sp[]=s.split(" ");
        char ch[]=pattern.toCharArray();
        if(sp.length==ch.length){
            HashMap<Character,String> hm=new HashMap<>();
            for(int i=0;i<sp.length;i++){
                String a=sp[i];
                if(!(hm.containsKey(ch[i]))){
                    if(hm.containsValue(a)){
                        return false;
                    }
                    hm.put(ch[i],a);
                }
                else{
                    if(!(hm.get(ch[i]).equals(a))){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
}
}