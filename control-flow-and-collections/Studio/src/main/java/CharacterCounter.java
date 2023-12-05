import java.util.HashMap;
import java.util.Map;
public class CharacterCounter {
    public static void main(String[] args){
    String movieQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
    HashMap<Character, Integer> counter = new HashMap<>();
    for(char i : movieQuote.toCharArray()){

        if(counter.containsKey(i)){
            counter.put(i, counter.get(i)+1);
        } else{
            counter.put(i, 1);
        }
    }
    for(Map.Entry<Character, Integer>  object: counter.entrySet()){
        String results = String.format("%s: %s",object.getKey(),object.getValue());
        System.out.println(results);
    }

    }
}
