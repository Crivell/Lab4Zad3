import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> l1 = rozString("Ala ma kota", 4);
        dis(l1);
        l1 = rozString("abcd",2);
        dis(l1);
        l1 = rozString("",3);
        dis(l1);
    }

    public static List<String> rozString(String s, int length){
        if( length < 0 || s == null ){
            throw new IllegalArgumentException();
        }else{
            List<String> list = new ArrayList<String>();
            int le = length;
            for(int i=0;i<Math.floorDiv((s.length()+(length-1)),length);i++){
                if((i*length)+le>s.length()){
                    list.add(s.substring(i*length,s.length()));
                }else{
                    le*=(i+1);
                    list.add(s.substring(i*length,le));
                }
            }
            return list;
        }
    }

    public static void dis(List<String> l1){
        for (String s1: l1) {
            System.out.println(s1);
        }
    }

}

