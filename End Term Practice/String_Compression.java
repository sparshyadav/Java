import java.util.*;
public class String_Compression {
    static StringBuilder compressString(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch, count+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb;
    }
    public static void main(String[] args) {
        String str="aaabbccds";
        StringBuilder sc=compressString(str);
        System.out.println(str+" after Compression becomes: "+sc);
    }
}
